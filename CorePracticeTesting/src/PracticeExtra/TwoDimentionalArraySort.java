package PracticeExtra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TwoDimentionalArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Insert number of row : ");
		Scanner sc=new Scanner (System.in);
		int row=sc.nextInt();
		System.out.println("Insert number of col : ");
		int col=sc.nextInt();
		System.out.println("Enter 2D data Array dynamically");
		int[][] entryset= new int[100][100];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				entryset[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Print 2D Original Array");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(entryset[i][j]+" ");
			}
			System.out.println();
		}
		
		//Calling the method for 2D array sort
		int[][]resultset =TwoDimentionalArraySortMerthod(entryset,row,col);
		
		//Finally print the 2D Resultset array
		System.out.println("Print sort Two Dimentional Array");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(resultset[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	// Method for sort 2D array using collection
	public static int[][] TwoDimentionalArraySortMerthod(int[][] data, int row,int col) {
		int[][] dataset = data;
		
		//Add data into ArrayList -collection
		ArrayList ls=new ArrayList();
		for(int i=0;i<row;i++) {
			for(int k=0;k<col;k++) {
				ls.add(data[i][k]);
				}
			}
		// Sort data with Utility method
		Collections.sort(ls);
		
		// Insert arraylist data again into 2D array
		int j=0;
		for(int i=0;i<row;i++) {
			for(int k=0;k<col;k++) {
				dataset[i][k]=(int) ls.get(j);
				j++;
				}
			}
		return dataset;
	}

}
