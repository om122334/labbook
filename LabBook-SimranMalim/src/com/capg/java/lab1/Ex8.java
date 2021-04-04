package com.capg.java.lab1;

import java.util.Scanner;

public class Ex8 {
	
	static boolean checkNumber(int n)
	{
		if (n==0)
			return false;
		while(n!=1)
		{
			if(n%2!=0)
				return false;
			n=n/2;
		}
			return true;

	}
	public static void main(String[] args) {
		Scanner myin=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=myin.nextInt();
		Ex8 e=new Ex8();
		boolean res=e.checkNumber(num);
		if(res== true)
				System.out.println(num +" is a power of 2.");
		else
			System.out.println(num +" is not a power of 2.");
				

	}

}
