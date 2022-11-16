package PraktikumNr4.copy;
import java.util.Scanner ;
 

public class WhileDoLoob {
    public static void main (String[]args) {
	Scanner input = new Scanner (System.in);
	  int num1 = 10 ; int num2 = 2; int operation;
	  
	  do  {
		  System.out.println("Select an option from the menu");
		  System.out.println("1. Sum 2 numbers");
		  System.out.println("2. Subtract numbers ");
		  System.out.println("3.Divide 2 nummbers ");
		  System.out.println("0.   Exit");
		  operation = input.nextInt();
		  switch(operation) {
		  case 1 :
			  
			  System.out.println("sum of the 2Numbers is"+(num1+num2) );
			  break;
			  
		  case 2:
			  System.out.println("Subtract of the 2 numbers is"+(num1-num2));
			 break;
			 
		  case 3:
		 
		  System.out.println("Divide of  the 2 numbers "+(num1/num2));
		  break;
		  
		  case 0:
			  
			 System.out.println("Good bye ");
		  break;
		  default:
			  System.out.println(" INnvaid option");
		  
		  
		  
		  
		  
		  
		  }
		  
		  
		  
		  
		  
		  
		  
	  }while (operation != 0);
		  
		  
		  
		  
		  
		  
		  
	  
	  
	
	
    }
	
	
	
	
	
	
	
	
	
	
}
