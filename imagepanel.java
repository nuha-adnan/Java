package Drawing;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class ImagPanel extends Panel {
	
	private Image Img;

	ImagPanel(Image Img) {
		this.Img = Img;
	}

	public void paint(Graphics g) {
		g.drawImage(Img, 0, 0, this);
	}

	public static void main(String args[]) {
		System.out.println(args[0]);
		Frame F = new Frame("ImagepanelDemo");
		
		Image I = F.getToolkit().getImage(args[0]);
		
		ImagPanel P = new ImagPanel(I);
		
		F.add(P);
		F.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		F.pack();
		F.setVisible(true);
	}
}
