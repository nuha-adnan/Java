package FigureInterface;

public class Quadrat implements Figure {

	private double vierSeiten; // fields
	
	public Quadrat(double vierSeiten) 
	{
		this.vierSeiten = vierSeiten;
	}
	
	public double getVeirSeiten() {
		return this.vierSeiten;
	}

	public void setVierSeiten(double vierSeiten) {

		this.vierSeiten =  vierSeiten;
	}
	
	public double getUmfang() {
		return this.vierSeiten * 4;
	}
	
	public double getFleacher() { // üerschreibung
		return this.vierSeiten * this.vierSeiten;
	}

	

	public String toString() { // string format
		return String.format ("Quadrat hat: vierseiten = %s ,  Fleacher = %s , Umfang = %s . " , this.vierSeiten ,  this.getFleacher() , this.getUmfang() );
		
	}
}
