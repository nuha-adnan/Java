package PraktikumNr4.copy;
import java.util.Scanner;
public class Nuhaswitch {

	public static void main(String[] args) {

		int num1; int num2; int chicke; int result ;
		
		Scanner input = new Scanner (System.in);
		  System.out.println("Enter your  chicke :");
		  System.out.println("1.Add two nummbers");
		  System.out.println("2.Get the doubel of a postive nummber");
		  System.out.println ("3 Get the square  of a number   ");
		  
		  chicke 	=  input.nextInt();
		  switch (chicke) {
		  
		  case 1 :
			   
				System.out.println("2,Enter your num2 :");	  
				     num1 = input.nextInt();
				     num2 = input.nextInt();
				     System.out.println(num1+num2);
				     break;
				     
		          
		  case 2 :
			   
		System.out.println("2,Enter your num2 :");	  
		     num1 = input.nextInt();
		     num2 = input.nextInt();
		     System.out.println(num1-num2);
		     break;
		     
		     
		  case 3 :
			  System.out.println("  Enter youe postiv nummber   ") ;
			  num1 = input.nextInt();
			  if(num1 >0)
				  System.out.println( num1 *num1);
			  break;
			  
			  
			  
         default : 
        	 
        	 System.out.println ("  input    ");
        
	
		  
		      
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  }
		  
		  
		 
   
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
