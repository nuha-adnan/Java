package PraktikumNr4.copy;

public class Person {

	String name;
	double age;
	String adresse;
	String nationality;

	public Person() {

	}

	public Person(String n, double a, String d, String nat) {
		name =n;
		age = a;
		adresse = d;
		nationality = nat;
	}

	public void setname(String n) {

		name = n;
	}

	public void setage(double a) {

		age = a;
	}

	public void setadresse(String d) {

		adresse = d;
	}

	public void setnationaltiy(String nat) {

			nationality = nat;
	}

	public String getname() {
		return name;
	}

	public double getage() {

		return age;
	}

	public String adresse() {
		return adresse;
	}

	public String getnationality() {
		return nationality;
	}
	
	public void print() {
		
		System.out.println("Name =" + name + "\n age =" + age + "\n  adresse =" + adresse + "\n nationality =" +  nationality );
	}
}
