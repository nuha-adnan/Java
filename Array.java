package PraktikumNr4.copy;
import java.util.*;
public class Array {
public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	int size ;
	System.out.println("Enter your Numer");
	size = input.nextInt();
	int [] numbers = new int[size];
		
	
	for(int i = 0;i<= numbers.length;i++) {
		System.out.println(" Enter salay  for empployee no " +i);
		numbers[i] = input.nextInt();
		
	
}
int  sum = 0,avg=0,count= 0 ;

for(int i = 0 ; i<numbers.length; i++) {
 if (numbers[i]>0)
	 sum+= numbers[i];
 count++;
}
}

}