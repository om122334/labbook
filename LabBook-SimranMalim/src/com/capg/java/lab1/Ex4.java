package com.capg.java.lab1;

import java.util.Scanner;

public class Ex4{
	private static int j;

	

	public static void main(String[] args) {
		Scanner myin=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int max=myin.nextInt();
		for(int num=2;num<=max;num++)
		{
			int isprime=1;
			for(int i=2; i<=num/2;i++)
			{
				if(num % i == 0)
				{
					isprime=0;
					break;
				}
			}
			if(isprime==1)
			{
				System.out.println(num);
			}
		}
		

	}

}
