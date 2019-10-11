package PracticeExtra;

import java.util.Arrays;

public class FindThirdLargestUnsortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  array[]= {30,20,10,40,70};
		if (array.length>0) {
			Arrays.sort(array);
			System.out.println(array[(array.length -3)]);
			System.out.println(Arrays.toString(array));
		}
		else System.out.println("Array is Empty");

	}

}
