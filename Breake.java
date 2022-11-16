package PraktikumNr4.copy;
import java. util.Scanner;
public class Breake {
	
	public static void main (String[] args) {
		
int counter = 1; int num ; int sum = 0;		
	Scanner input = new Scanner (System.in)	;
	while ( counter <= 5) {
		
		 System.out .println (" Enter a postiv integer " + counter );
		 num = input.nextInt();
		 if (num<0) {
			 
			System.out.println("Negativ number are not allowed") ;
			//continue;
			// break;
			 }
		
		sum = sum + num;
		counter++;
		
		
		
		
	}
		
		
		
		
	System.out.println("sum ="+sum)	;
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
