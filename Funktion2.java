package PraktikumNr4.copy;
import java.util.Scanner;
public class Funktion2 {
  public static void mainn  (String [] args) {
	  
	   Scanner input = new Scanner(System.in);
	   int a = 10 ; int b = 20;
	   char x= 'a'; char y ='A';
	    large(a,b);
	    large(x,y);
	  
	  
  }
  public static int large (int n1, int n2) {
	  
	  byte[]  c = "Nuha".getBytes();
	  byte[] d = {'N', 'u', 'h', 'a'};
	  if (n1>n2 )return n1;
	  else return n2;
	  
	  
  }

  public static char large(char c1,char c2) {
	  
	  if (c1>c2)return c1;
	  else return c2 ;
	  
	  
	  
	  
  }







}



