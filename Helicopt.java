package Drawing;

import java.awt.*;
import java.awt.event.*;

class Helicopt extends Panel {
	int x = 50, y = 30;

	Color c1 = new Color(0x5050ff); // Blau
	Color c2 = new Color(0xffffff); // Weiss

	public Dimension getPreferredSize() {
		return new Dimension(500, 300);
	}
/////////////////////////

	void drawBackground(Graphics gr, Color c1, Color c2, int numsteps) {
		int r, g, b;
		
		int dr = (c2.getRed() - c1.getRed()) / numsteps;
		int dg = (c2.getGreen() - c1.getGreen()) / numsteps;
		int db = (c2.getBlue() - c1.getBlue()) / numsteps;
		
		Dimension size = this.getSize();
		
		int w = size.width, h = size.height;
		
		int dw = size.width / numsteps;
		int dh = size.height / numsteps;
		
		gr.setColor(c1);
		
		gr.fillRect(0, 0, w, h);
		
		for (r = c1.getRed(), g = c1.getGreen(), b = c1.getBlue(); h > 0; h -= dh, w -= dw, r += dr, g += dg, b += db) {
			gr.setColor(new Color(r, g, b));
			gr.fillOval(0, 0, w, h);
		}
	}
	////////////////////////////////

//	void drawBackground(Graphics gr, Color c1, Color c2, int numsteps) {
//		gr.setColor(Color.yellow);
//		Dimension size = this.getSize();
//		gr.fillRect(0, 0, size.width, size.height);
//	}

	public void paint(Graphics g) {

		Polygon P = new Polygon();
		P.addPoint(x + 4, y + 15);
		P.addPoint(x + 35, y + 15);
		P.addPoint(x + 35, y + 25);

		drawBackground(g, c1, c2, 128);

		g.setColor(Color.black);
		Color C = g.getColor();

		g.setColor(Color.red);

		g.fillPolygon(P);

		g.fillOval(x, y + 10, 10, 10);
		g.fillRect(x + 41, y + 3, 5, 7);
		g.fillRect(x + 20, y + 1, 50, 3);
		g.fillOval(x + 30, y + 10, 26, 26);
		g.fillOval(x + 24, y + 31, 8, 8);
		g.fillOval(x + 49, y + 31, 8, 8);

		g.setColor(Color.blue);

		g.fillArc(x + 31, y + 11, 24, 24, 0, 90);
		g.fillArc(x + 31, y + 11, 24, 24, 0, -75);

		g.setColor(C);
	}

	public static void main(String args[]) {
		Frame f = new Frame();
		f.setSize(500, 300);
		Helicopt p = new Helicopt();
		f.add(p);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
