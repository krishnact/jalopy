package de.hunsicker.jalopy;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Formatter {
	public static void main(String[] args) throws FileNotFoundException {
		// create a new Jalopy instance with the currently active code convention settings
		 
		 File file = new File(args[0]);
		 byte[] bb = new byte[100000];
		 String contents;
		 FileInputStream fis = new FileInputStream(args[0]);
		 int iRead;
		try {
	    	 JalopyMode.OPERATING_MODE=0;
			 iRead = fis.read(bb);
			 contents = new String(bb,0,iRead);
			 
			 // specify input and output target
			 //ByteArrayInputStream bais = new ByteArrayInputStream(bb,0,iRead);
//			 jalopy.setInput(new String(bb,0,iRead));
//			 
//			 StringBuffer strBuff = new StringBuffer(); 
//			 jalopy.setOutput(strBuff);
//
//			 // format and overwrite the given input file
//			 jalopy.format();
//			 System.out.println(strBuff.toString());
			 System.out.println(Jalopy.format(contents));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
		
		
	}
}
