package com.capg.java.lab1;

import java.util.Scanner;

public class Ex3 {
	static int n1=1;
	static int n2=1;
	int n3=0;
	public void fib(int c)
	{
		
		if(c>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" " + n3);
			fib(c-1);
		}
		
	}

	public static void main(String[] args) {
		Scanner myin=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=myin.nextInt();
		Ex3 e=new Ex3();
		System.out.print(n1 + " " +n2);
		e.fib(num-2);

	}

}
