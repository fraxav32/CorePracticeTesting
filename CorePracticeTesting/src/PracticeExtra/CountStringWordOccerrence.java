package PracticeExtra;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountStringWordOccerrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string value");
		Scanner sc=new Scanner (System.in);
		String s = sc.nextLine();
		String s1[]= s.split(" ");
		System.out.println(s);
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		for(String i: s1) 
		{
			Integer j=hm.get(i);
			hm.put(i, (j==null)?1:j+1);				
		}
		
		System.out.println("Print the occurence");
		for(Map.Entry<String, Integer> val:hm.entrySet()) 
		{
			System.out.println("Word: "+ val.getKey()+" ,Occerrence: "+val.getValue());
		}
	}

}
