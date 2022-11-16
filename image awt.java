package Drawing;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;

public class ForImages extends Panel{

	private Image img;
	
	public ForImages(Image img) { 
//		this.img = img;
//		//img=img.getScaledInstance(1440, 1050, Image.SCALE_SMOOTH);
//		MediaTracker M=new MediaTracker(this);
//		M.addImage(img,300);
//		try {M.waitForID(300);}catch (Exception e){}
		}
	
	public void paint(Graphics graph) {
		graph.drawImage(img, 0, 0, 1024, 900, this);
		//graph.drawString("Nuha", 0, 0);
		//graph.setColor(Color.red);
	
	}
	public static void main(String[] args) {
	
		Frame frame = new Frame();
		
		
		Image image = frame.getToolkit().getImage(args[0]);
	
		
		//CropImageFilter crop = new CropImageFilter(200, 150, 300, 300);
		//FilteredImageSource filtered = new FilteredImageSource(image.getSource(), crop);
		
	//	image = frame.createImage(filtered);
		
		ForImages panel = new ForImages(image);
		
		frame.add(panel);
		
		//frame.setSize(image.getScaledInstance(WIDTH, HEIGHT, ABORT));
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setVisible(true);
		frame.pack();
	}

}
