package PracticeExtra;

import java.util.Scanner;

public class StringReverse {

	// reverse a string or print in backward orders
	public static void main(String[] args) {
		System.out.println("enter the string value");
		Scanner sc=new Scanner (System.in);
		String s = sc.nextLine();
		System.out.println(s);
		String rev="";
		for(int i=s.length()-1;i>=0; i--)
			rev=rev+s.charAt(i);
			System.out.println(rev);

	}

}
