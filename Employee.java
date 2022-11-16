package PraktikumNr4.copy;

public class Employee extends Person  {
	
	
	 double salary ;
	 String rank;
	 String job ;
	 
	 public  Employee (String n, double a, String ad , String nat ,double s,String r,String j) {
		 
		super(n,a,ad,nat) ;
		salary = s;
		rank = r;
		job  = j;
		
		 
		 
		 
	 }
    public void setsalary( double s) {
    	salary = s;
    	
    	
    }
	
	public double  getsalary() {
		
		
		return salary;
	}
	 
	public void print() {
		
		super.print();
		
		System.out.println("salary =" +salary+ "\n rank = " +rank+"job = " +job);
	}
	
}
