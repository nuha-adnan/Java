package FigureInterface;

public class Kreis implements Figure {

	private double radius;
	
	public Kreis(double radius) 
	{
		this.radius = radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
		
	}
		
	public double getRadius() {
		return this.radius;
	}
		
	public double getUmfang() {
		return 2 * Math.PI * this.radius;
	}
	
	public double getFleacher() {
		 return Math.PI * this.radius * this.radius;}
	
	public String toString() {
		return String.format ("Der Kreis hat :Radius = %s , Umfang = %s , Fleacher = %s." , this.radius ,this.getUmfang(),this.getFleacher());
		}
	
	//ende
}
