package PraktikumNr4.copy;

import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Stream4 {

	public static void main(String[] args) {
  
		try {

			File file1 = new File("src/PraktikumNr4/Taxigeschichten.txt"); // 1
			FileReader fr = new FileReader(file1); // FileReader

			CharArrayWriter caw = new CharArrayWriter(128); // charWriteArray
			int len = 0;
			char[] myBytearry = new char[128];

			while ((len = fr.read(myBytearry)) > -1) {
				caw.write(myBytearry, 0, len);
			}

			char[] data1 = caw.toCharArray();
			String data2 = caw.toString();
			System.out.println(new String(data2));

			caw.close();
			fr.close();
		} catch (IOException e) {
		}

	}

}
