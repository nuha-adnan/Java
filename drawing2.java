package Drawing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Muster extends Panel {

	private Image img;
	private double braunkohle = 35;
	private double steinkKohle = 20;
	private double kernenergie = 15;
	private double erdgas = 15;
	private double wind = 10;
	private double wasserkraft = 5;

	public Muster(Image img) {
		this.img = img;
	}

	public Dimension getPreferredSize() {
		return new Dimension(700, 500);
	}
	
	public void paint(Graphics g) {

		g.drawImage(img, 0, 0, 700, 500, this);

		Color c = g.getColor();
		int width = 300;
		int height = 300;
		
		int x = (700 - width) / 2;
		int y = (500 - height) / 2;
		
		int startAngle  = 0;
		int arcAngle = (int) ((braunkohle * 360) / 100);
		g.setColor(filterColor(Color.blue));
		g.fillArc(x, y, width, height, startAngle , arcAngle);
		
		startAngle  =  startAngle + arcAngle;
		arcAngle = (int) ((steinkKohle * 360) / 100);
		g.setColor(filterColor(Color.black));
		g.fillArc(x, y, width, height, startAngle , arcAngle);
		
		startAngle  = startAngle + arcAngle;
		arcAngle = (int) ((kernenergie * 360) / 100);
		g.setColor(filterColor(Color.red));
		g.fillArc(x, y, width, height, startAngle , arcAngle);
		
		startAngle  = startAngle + arcAngle;
		arcAngle = (int) ((erdgas * 360) / 100);
		g.setColor(filterColor(Color.yellow));
		g.fillArc(x, y, width, height, startAngle , arcAngle);
		
		startAngle  = startAngle + arcAngle;
		arcAngle = (int) ((wind * 360) / 100);
		g.setColor(filterColor(Color.green));
		g.fillArc(x, y, width, height, startAngle , arcAngle);
			
		startAngle  = startAngle + arcAngle;
		arcAngle = (int) ((wasserkraft * 360) / 100);
		g.setColor(filterColor(Color.pink));
		g.fillArc(x, y, width, height, startAngle , arcAngle);
		
		//g.setColor(c);
		c = filterColor(Color.black);
		g.setFont(new Font("Courier", Font.BOLD,14));
		
		x = 580; // 580 (Point)
		y = 370; // 370 (point)
		width = 10;
		height = 10;
		
		g.setColor(c);
		g.drawString("Braunkohle", x, y);
		g.setColor(filterColor(Color.blue));
		g.fillRect(x +100 , y - 10, width, height);
		
		g.setColor(c);
		g.drawString("SteinkKohle", x, y + 15);
		g.setColor(filterColor(Color.black));
		g.fillRect(x + 100, y + 5, width, height);
		
		g.setColor(c);
		g.drawString("Kernenergie", x, y + 30);
		g.setColor(filterColor(Color.red));
		g.fillRect(x + 100, y + 20, width, height);
		
		g.setColor(c);
		g.drawString("Erdgas", x, y + 45);
		g.setColor(filterColor(Color.yellow));
		g.fillRect(x + 100, y + 35, width, height);
		
		g.setColor(c);
		g.drawString("Wind", x, y + 60);
		g.setColor(filterColor(Color.green));
		g.fillRect(x + 100, y + 50, width, height);
		
		g.setColor(c);
		g.drawString("Wasserkraft", x, y + 75);
		g.setColor(filterColor(Color.pink));
		g.fillRect(x + 100, y + 65, width, height);	
	}
	
	public Color filterColor(Color c) {	
		return new Color(c.getRGB() & 0x3cffffff, true);
	}

	public static void main(String[] args) {

		Frame frame = new Frame();

		Image img = frame.getToolkit().getImage(args[0]);
		Muster panel = new Muster(img);
		frame.add(panel);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		frame.setSize(700, 500);
		frame.setVisible(true);
		frame.pack();
	}

}
