package PracticeExtra;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountStringCharacterOccerrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string value");
		Scanner sc=new Scanner (System.in);
		String s = sc.nextLine();
		char s1[]= s.toCharArray();
		System.out.println(s);
		HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
		for(Character i: s1) 
		{
			Integer j=hm.get(i);
			hm.put(i, (j==null)?1:j+1);				
		}
		
		System.out.println("Print the occurence");
		for(Map.Entry<Character, Integer> val:hm.entrySet()) 
		{
			System.out.println("Character: "+ val.getKey()+" ,Occerrence: "+val.getValue());
		}
	}

}
