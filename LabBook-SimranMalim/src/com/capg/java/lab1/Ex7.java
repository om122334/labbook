package com.capg.java.lab1;

import java.util.Scanner;

public class Ex7 {
	static boolean checkNumber(int n)
	{
		int currentdigit=n%10;
		n=n/10;
		while(n>0)
		{
			if(currentdigit<=n%10)
				return true;
			currentdigit=n%10;
			n=n/10;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner myin=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=myin.nextInt();
		Ex7 e=new Ex7();
		boolean res=e.checkNumber(num);
		if(res== true)
				System.out.println(num +" is not an increasing number.");
		else
			System.out.println(num +" is an increasing number.");
				

	}

}
