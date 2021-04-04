package com.capg.java.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
	
	public int getSecondSmallest(int[] n)
	{
		Arrays.sort(n);
		return n[1];
		
	}

	public static void main(String[] args) {
		Ex1 e=new Ex1();
		int num[]=new int[5];
		Scanner myin=new Scanner(System.in);
		System.out.println("Enter 5 numbers : ");
		for(int i=0;i<5;i++)
		{
			num[i]=myin.nextInt();
		}
		
		int res=e.getSecondSmallest(num);
		System.out.println("the second smallest element in the array is "+res);
		

	}

}
