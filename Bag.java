package PraktikumNr4.copy;
import java .util.Scanner ;
public class Bag {
	
	
	public static void main (String[]args) {
		 Scanner input= new Scanner (System.in);
     	char passclass;
     	double bagweight ;
     	double excessweight = 0;
     	double charge = -1;
     	int num ;
     	int grub ;
        System.out.println("enter groub:");
        grub = input.nextInt();
        for (int j = 0; j<=grub;j++) {
        
        System.out.println("Enter your number :" +j);
        num = input.nextInt();
       
        
        for (int i =1;i<=num;i++) {
        
        
     	System.out.println("Enter your Class "+i);
     	passclass= input.next().charAt(0);
     	System.out.println(" Enter pagweight");
     	bagweight=input.nextDouble();
     	
     	switch (passclass) {
     	
     	
     	case 'F': 
     		 if (bagweight >30) {
     			excessweight= bagweight - 30 ;
     		   charge = excessweight * 10 ;
     		   break;
     		 }
     		
     	case 'B' :
     		if (bagweight <25) {
     			excessweight = bagweight - 25 ;
     			charge = excessweight * 10 ;
     			
     			break;
     		}
     		
     	case 'E':
     		 if (bagweight >20) {
     			excessweight = bagweight - 20 ;
     			charge = excessweight * 10 ;
     			 
     			break; 
     	 }
     		 
     		 
     		 
     	default :
     		System.out.println("Ende");
     	
     	
     	
     	
     	}
     
        }
     	
        }
        
        System.out.println("you Have To pay Extra charge equal"+charge);
     	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
