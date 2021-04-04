package com.capg.java.lab6;

import java.util.HashMap;
import java.util.Scanner;

public class Ex3 {

	public HashMap<Integer, Integer> getSquares(int[] arr)
	{
		int sq[] = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			sq[i]=arr[i]*arr[i];	
		}
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(sq[i]);
		}*/
		 HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>(); 
		 for(int i=0;i<arr.length;i++)
			 temp.put(arr[i], sq[i]); 
		 return temp;
		
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no of numbers to be entered");
		int num=sc.nextInt();
		int[] n=new int[num];
		System.out.println("Enter the numbers");
		for(int i=0;i<num;i++)
		{
			n[i]=sc.nextInt();
		}
		Ex3 e=new Ex3();
		HashMap<Integer, Integer> res = new HashMap<Integer, Integer>(); 
		res=e.getSquares(n);
		System.out.println(res);
		
		
	}

}
