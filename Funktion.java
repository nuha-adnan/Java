package PraktikumNr4.copy;
import java.util.Scanner;
public class Funktion {

	
	public static void main (String[] args) {
	
	
	int total; double A;
	Scanner    input = new Scanner (System.in);	
	System.out.println("Enter 3 number");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	int num3 = input.nextInt();
   total	=  sum (num1 ,num2 ,num3 );
	A = average(num1,num2,num3);
	display(total,A);
		
		
	} 
	
	public static int sum (int n1,int n2,int n3) {
		
		return n1+n2+n3;
		
		
	}
	
	
	public static double average (int n1 ,int n2, int n3) {
		
		return sum(n1,n2,3)/3;
		
	}
	
	
	public static void display( int s,double a ) {
		
		System.out.println("the sum of the 2 nummber is:"+s);
		System.out.println("the avarge of the :"+a);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
