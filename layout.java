package Drawing;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Image;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
public class LayoutPanel extends Panel {
	
	
	Button b1 = new Button("Hallo");
	Button b2 = new Button("es");
	Button b3 = new Button("funktioniert");
	Button b4 = new Button("Genius!!!");
	Image i ;
	
	public LayoutPanel(Image Img)
	{
		setFont(new Font("System", Font.PLAIN, 24));
		setLayout(new BorderLayout());    
		

		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.WEST);
		add(b3,BorderLayout.EAST);
		add(b4, BorderLayout.SOUTH);
		
		i = new Image(Img);
		add(i, BorderLayout.CENTER);
	}
	
	
	public static void main(String args[])
	{

		Frame F = new Frame("Layout & Image");
		Image I = F.getToolkit().getImage(args[0]);
		LayoutImage LI = new LayoutImage(I);
		F.add(LI);
		F.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we){System.exit(0);}
		});
		F.pack();   
		F.setVisible(true);   
	}

}
