package SocketExample;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Arrays;

public class server2 {

	
    public static void main(String[] args) {

        byte receiveBuffer[] = new byte[1024];
        byte sendBuffer[] = new byte[1024];
        
        try {
            DatagramSocket ds = new DatagramSocket(Integer.parseInt(args[0]));
            DatagramPacket packr = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            
            while (true) {
                
                ds.receive(packr);

                String s = new String(packr.getData(), 0, packr.getLength());
                
                System.out.println("raw received String: " + s);
                StringBuilder strb = new StringBuilder(s).reverse();
                String reversedStrng = strb.toString();
                System.out.println("reversed String: " + reversedStrng);

                InetAddress sendersAddres = packr.getAddress();
                int sendersPort = packr.getPort();

                Arrays.fill(sendBuffer, (byte)0);
                System.out.println("len 2: " + receiveBuffer.length);  
                System.arraycopy(reversedStrng.getBytes(), 0, sendBuffer, 0, reversedStrng.getBytes().length);
                System.out.println("len 3: " + receiveBuffer.length);  

                packr = new DatagramPacket(sendBuffer, sendBuffer.length, sendersAddres, sendersPort);
                ds.send(packr);
               
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

