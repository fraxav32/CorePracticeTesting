package PracticeExtra;

import java.util.Scanner;

public class StringToIntegerArray {
	
	// take an array of numbers input from system and print.
	public static void main(String[] args) {
		System.out.println("enter the string value");
		Scanner sc=new Scanner (System.in);
		String s = sc.nextLine();
		String sp[]= s.split(" ");
		int num[]=new int[sp.length];
		for(int i=0;i<sp.length;i++) {
			num[i]= Integer.parseInt(sp[i]);
		}
		System.out.println(num.length);
		int sum=0;
		for(int i=0;i<num.length; i++)
			sum += num[i];
		System.out.println(sum);
	}
}
