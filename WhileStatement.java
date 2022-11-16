package PraktikumNr4.copy;
import java.util.Scanner;
public class WhileStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int guess,rand ;
		
		
		rand = (int )(Math.random()*100);
		boolean stillplaying = true ;
		System.out.println("Rand nummber is"+rand);
		
		while (stillplaying) {
			
		System.out.println("Guess a nummber  between 0 and 100  ")	;
		guess = input .nextInt();
	     if (guess > rand )
	    	 
	    	 
	    	   System.out.println("Guess too large");
	     
	     
	     
	     else
	    	 if (guess<rand)
	    		 
	    		 System.out.println(" Guess too small");
	     
	    	 else {
	    		 
	    System.out.println("You win!!  ");
	    		 
	    		stillplaying = false ;
	    	 }
	    		 
	    		 
		
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		

	}

}
