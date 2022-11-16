package SocketExample;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class Client2 {
	public static class client extends Panel{

	    TextField tfHost = new TextField(20);
	    TextField tfPort = new TextField(20);
	    TextField tfMess = new TextField(20);
	    GridBagConstraints c = new GridBagConstraints();

	    static String host;
	    static int port;
	    static byte[] mess;

	    String receivedString;

	    FocusListener focusListenerH = new FocusListener() {

	        @Override
	        public void focusGained(FocusEvent event) {
	            System.out.println("Host focus Gained");
	        }
	        
	        @Override
	        public void focusLost(FocusEvent e){
	            host = tfHost.getText();
	            System.out.println("done, host = " + host);
	        }
	    };

	    FocusListener focusListenerP = new FocusListener() {
	 
	        @Override
	        public void focusGained(FocusEvent event) {
	            System.out.println("Port focus Gained");
	        }
	        
	        @Override
	        public void focusLost(FocusEvent e){
	            try {
	                port = Integer.parseInt(tfPort.getText());
	            } catch (Exception er) {
	                System.out.println("error while converting, make sure port is int");
	                tfPort.setText("error");
	            }
	            
	            System.out.println("done, port = " + port);
	        }
	    };

	    ActionListener zeichenChanged = new ActionListener(){
	        public void actionPerformed(ActionEvent e){
	            mess = tfMess.getText().getBytes();
	            System.out.println("done, mess = " + new String(mess));

	            sendAndReceive();
	        }
	    };
	    
	    public void sendAndReceive(){
	        try {

	            InetAddress addr = InetAddress.getByName(host);
	    
	            DatagramPacket packs = new DatagramPacket(mess, mess.length, addr, port);
	            DatagramSocket ds = new DatagramSocket();
	    
	            ds.send(packs);

	            DatagramPacket packr = new DatagramPacket(new byte[1024], 1024);
	            ds.receive(packr);
	    
	            String s = new String(packr.getData());
	            
	            System.out.println("received string: " + s.trim() + "\n");
	            tfMess.setText(s.trim());

	            ds.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }

	    public client(){
	        setLayout(new GridBagLayout());
	        setFont(new Font("System", Font.PLAIN, 24));

	        c.anchor = GridBagConstraints.EAST;
	        
	        c.gridx = 0;
	        c.gridy = 0;
	        add(new Label("Host: ", Label.RIGHT), c);
	        c.gridy++;
	        add(new Label("Port: ", Label.RIGHT), c);
	        c.gridy++;
	        add(new Label("mess: ", Label.RIGHT), c);

	        c.gridy = 0;
	        c.gridx = 1;
	        c.weightx = 1.0;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        add(tfHost, c);
	        c.gridy++;
	        add(tfPort, c);
	        c.gridy++;
	        add(tfMess, c);

	        tfHost.addFocusListener(focusListenerH);
	        tfPort.addFocusListener(focusListenerP);
	        tfMess.addActionListener(zeichenChanged);
	    }

	    public static void main(String[] args) {
	        
	        Frame f = new Frame();
	        client client = new client();
	        f.add(client);

	        f.addWindowListener((WindowListener) new WindowAdapter() {
	            @Override
	            public void windowClosing(WindowEvent we) {
	               f.dispose();
	            }
	        });
	        
	        f.setTitle("client");
	        f.pack();
	        f.setLocationRelativeTo(null);
	        f.setVisible(true);

	        
	    }    
	}
}
