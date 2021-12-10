package com.hcl.outputstream;

import java.io.*;

class FileOoutputSteamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream(
					"C:\\\\Users\\\\shaiknayabrasool.s\\\\Desktop\\\\FileIO\\Sample1.txt");
			fout.write(60);
			String s = "welcome to hcl";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Data write to document");

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
