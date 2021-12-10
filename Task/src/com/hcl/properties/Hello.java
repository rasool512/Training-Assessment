package com.hcl.properties;

import java.util.*;

class Hello {

	public void CountVowels(String s) {

		int i = 0;

		for (char c : s.toCharArray()) {

			i++;

		}
		System.out.println("Total vowels:" + i);

	}

}

class Welcome {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter vowels :");

		String s1 = sc.nextLine();
		Hello h = new Hello();
		h.CountVowels(s1);
	}
}
