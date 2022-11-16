package SocketExample;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {

	public static void main(String[] args) throws IOException {
		
		String messr = "";

		DatagramPacket packr = new DatagramPacket(new byte[1024], 1024);
		
		
		DatagramSocket ds = new DatagramSocket(12347);
		
		ds.receive(packr); 
		
		byte[] data = packr.getData(); 
//		byte[] newData = new byte[data.length];
//		int i = 0;
//		// r e g a l
//		// l a g e l
//		for(int index = packr.getLength() -1 ; index >= 0; index--)
//		{
//			newData[i] = data[index];	
//			i++;
//		}
//				
//		messr = new String(newData , 0, packr.getLength());
//		
//		
//		System.out.println(messr);
		
		
		String textAsString = new String(data);
		
		System.out.println(textAsString);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		double [] temps = temp(textAsString);
		
		for(int i = 0; i< temps.length; i++)
		{
			System.out.println(temps[i]);
		}
		ds.close();
	}

	static double[] temp(String text) 
	{
		double[] result = new double[10];
		String value;
		
		// ohne For schleife wenn wir nur readLine benutzen möchten
		//int firstIndex = text.indexOf("80.71");
		//int lastIndex = text.indexOf("°C", firstIndex);
		//value =  text.substring(firstIndex -1, lastIndex);

		int index = 0;
		int count = 0;
		
		while(text.indexOf("°C", index) != -1)
		{
		int lastIndex = text.indexOf("°C", index);
		int firstIndex = 0;
		
		int indexPlus = text.indexOf("+", index);
		int indexMinus = text.indexOf("-", index);
		
		if(indexPlus < 0)
		{
			firstIndex	= indexMinus;	
		}
		else if(indexMinus < 0)
		{
			firstIndex	= indexPlus;	
		}
		else if( indexPlus < indexMinus )
		{
			firstIndex	= indexPlus;
		}
		else
		{
			firstIndex	= indexMinus;
		}
		
		value =  text.substring(firstIndex -1, lastIndex);

		index = lastIndex + 1;
		//System.out.println(value);
		count++;
		result[count] = Double.parseDouble(value);
		}
		
		return result;
	}
}
