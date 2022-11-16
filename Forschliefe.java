package PraktikumNr4.copy;
import java.util.Scanner;
public class Forschliefe {

	
	public static void main(String args[]) {
		Scanner input = new Scanner (System.in);
		int grad,sum = 0; 
		for ( int count= 1 ; count <= 10;count++  ) {
			System.out.println("Enter Grad for student"+count);
		 grad = input.nextInt();
		 sum+=grad;
		
		
	}	
		
		
		
		System.out.println("The averge is"+(sum));
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
