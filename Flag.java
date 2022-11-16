package PraktikumNr4.copy;
import java.util.Scanner;
public class Flag {
	
  public static void main (String args [])	{
	  
	Scanner input = new Scanner (System.in) ;
	 double  sum = 0.0;
	 double value ;
	 boolean postiv  = true ;
	 
	 while (postiv==true) {
		 
		 System.out.println("Enter The Next Number Postive Number");
		 value = input.nextDouble();
		 
		if (value < 0)
			
		postiv = false ; 	
			
		else 
		sum = sum + value ; 	
			 
	 }			 
		 
		
	 System.out.println(" sum of input is" +sum)	;	
		  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
	
	
	
	
	
	
	
	

}
