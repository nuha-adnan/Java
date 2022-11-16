package FigureInterface;

public class Rechtteckig implements  Figure {

	private double height;
	private double wight;

	public Rechtteckig(double height, double wight) 
	{
		this.height = height;
		this.wight = wight;
	}
	
	public double getHeight() {
		return this.height;
	}

	public double getWight() {
		return this.wight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWight(double wight) {
		this.wight = wight;
	}

	public double getUmfang() {
		return (height + wight) * 2 ;	
	}
	
	public double getFleacher() {
		return this.height * this.wight;
	}

	public String toString() {
		
	return String.format("die Rechtteckig hat: Height = %s , Wight = %s , Fleacher = %s , Umfang = %s .", this.height, this.wight, this.getFleacher(), this.getUmfang());
	}

	// Ende Class
}
