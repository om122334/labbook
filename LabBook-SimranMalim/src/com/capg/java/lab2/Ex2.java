package com.capg.java.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
	public static String[] sortStrings(String[] arr) {
		
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {
		Scanner myin=new Scanner(System.in);
		System.out.println("Enter total number of elements to be entered : ");
		int num=myin.nextInt();
		String[] arr=new String[num];
		System.out.println("Enter the elements");
		for(int i=0;i<num;i++)
		{
			arr[i]=myin.next();
		}
		System.out.println("Array after sorting: ");
		sortStrings(arr);
		for (int i = 0; i < num; i++) {

		System.out.print(arr[i]+" ");
		}

	}



}
