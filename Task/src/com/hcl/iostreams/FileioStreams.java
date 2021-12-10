package com.hcl.iostreams;

/*
 * this program defines the working of InputStream method
 * read(),close(),skip(),reset(),mark()
 */
import java.io.*;
class FileioStreams{
public static void main(String args[]) throws Exception {

	InputStream input = null;
	try {

		input = new FileInputStream("C:\\Users\\shaiknayabrasool.s\\Desktop\\FileIO\\Sample.txt");
		System.out.println("char :" + (char) input.read());
		System.out.println("char :" + (char) input.read());
		System.out.println("char :" + (char) input.read());

		// mark() :read liming the input stream

		input.skip(1);
		System.out.println("skip() the method in one postion");
		System.out.println("char :" + (char) input.read());
		System.out.println("char :" + (char) input.read());
		System.out.println("char :" + (char) input.read());

	} catch (Exception e) {

		// in case of i/o error
		e.printStackTrace();
	} finally {

		// releasing the resources back and garbageCollector when close
		if (input != null) {

			input.close();
		}
	}
}
}
	
