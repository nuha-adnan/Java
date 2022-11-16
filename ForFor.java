package PraktikumNr4.copy;
import java. util.Scanner; 
public class ForFor {
	
	public static void main (String [] args) {
		
	int num ; int sumeven = 0; int sumodd =  0;
	Scanner input = new Scanner (System.in);
	
	for ( int i = 1; i<= 10 ; i++) {
		
		System.out .println("Enter your number :" +i);
		num = input.nextInt();
		     if (num%2 == 0)
			     sumeven += num ;
	        else 
			
	        	sumodd += num;
		
		
		
}
		
		
		
	System.out.println ("Even "+sumeven);	
	System.out.println ("odd "+sumodd);
		
		
		
	}
	
	
	
	
	
	

}
