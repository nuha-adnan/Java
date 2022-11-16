package PraktikumNr4.copy;

public class salaryEmployee extends Employee {
 
	
	double bonus ;
	double delen;
	
	
	
	
	
	
	
	
	
	public salaryEmployee(String n, double a, String ad, String nat, double s, String r, String j,double b, double de) {
		super(n, a, ad, nat, s, r, j);
		// TODO Auto-generated constructor stub
		bonus = b;
		delen = de;
	}


  
	@Override 
	public double getsalary() { 
		return salary + bonus -delen;
	}
		
	
	
	
	
}
