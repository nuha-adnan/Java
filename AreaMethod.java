package PraktikumNr4.copy;
import java.util.Scanner;
public class AreaMethod {
	static Scanner input  = new Scanner(System.in);

	public static void main ( String args[]) {
		
		 System.out .println("Enter size Area");
		int size ;
		size = input.nextInt();
		int [] ids = new int[size];
		fillarea(ids);
		printarea(ids);
		System.out.println("Enter the id to search for");
		int seachedid = input.nextInt();
		int returnedidex= seach(ids,seachedid);
		if(returnedidex>=0)
			System.out.println("the found");
		else 
			System.out.println("the ihem nict found");
		
	}
	 public static void fillarea(int[]list) {
		 for (int i = 0; i<list.length;i++) {
			 System.out.println("Enter no "+(i+1));
			 list[i]= input.nextInt();
		 }
		 
		 
	 }
     public static void printarea(int[]list) {
    	 
    	 
    	 for(int i = 0;i<list.length;i++)
    		 System.out.println(list[i]);
     }
     public static int seach(int[]list,int target) {
    	 
    	 for (int i = 0;i<list.length;i++) {
    		 if (list[i]==target)
    			 return i;
    			 
    	 }
		return -1;
     }
     
}
