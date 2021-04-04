package com.capg.java.lab1;

import java.util.Scanner;

public class Ex5 {
	
	public int calculateSum(int n)
	{
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner myin=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=myin.nextInt();
		Ex5 e=new Ex5();
		int res=e.calculateSum(num);
		System.out.println("sum of first n natural numbers which are divisible by 3 or 5 ="+res);

	}

}
