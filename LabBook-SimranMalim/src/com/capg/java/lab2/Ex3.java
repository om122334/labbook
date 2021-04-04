package com.capg.java.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
	
	public static int[] getSorted(int[] n) {
		
		Arrays.sort(n);
		n.toString();
		for(int i=n.length-1;i>=0;i--)
			System.out.println(n[i]);
		return n;
		
	}


public static void main (String[] args) {

	Scanner myin=new Scanner(System.in);
	System.out.println("Enter total number of elements to be entered : ");
	int num=myin.nextInt();
	int[] n=new int[num];
	System.out.println("Enter the numbers");
	for(int i=0;i<num;i++)
	{
		n[i]=myin.nextInt();
	}
	
	System.out.println("Array after sorting: ");
	getSorted(n);
	for(int i=n.length-1;i>=0;i--)
		System.out.print(n[i]);
	
	
	

     
}
}

