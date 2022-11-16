package SocketExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class client {
	public static void main(String args[]) throws IOException {

		String myHost = "DESKTOP-JPHCQFB";

		
		String fileName = "src/IO/SER/Test1.txt";
		File file = new File(fileName);
		
		byte[] textAsByte = new byte[(int)file.length()];
	
		
		FileInputStream ins = new FileInputStream(file);
		
		ins.read(textAsByte);
		
		//byte[] mess = args[0].getBytes();
		
		
		// Liefert Internetadresse
		InetAddress addr = InetAddress.getByName(myHost);
		// Das Datenpaket
		DatagramPacket packs = new DatagramPacket(textAsByte, textAsByte.length, addr, 12347);
		// Der SendeSocket
		DatagramSocket ds = new DatagramSocket();
		// Paket absenden
		ds.send(packs);

	}

}
