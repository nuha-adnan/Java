package FigureInterface;

public class FigureTest {

	public static void main(String[] args) {

	Rechtteckig r1 = new Rechtteckig(5, 7);
	
	System.out.println(r1);
	r1.setHeight(8);
	System.out.println(r1);
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	
	Figure[] figures1 = {new Quadrat(3), new Quadrat(5), new Quadrat(10)};
	Figure[] figures2 = {new Rechtteckig(3.5, 8.9), new Quadrat(13), new Kreis(13.5)};
	
	for(Figure f : figures1) {
		System.out.println(f.toString());
	}

	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	for(Figure f : figures2) {
		System.out.println(f.toString());
	}
	}
}

