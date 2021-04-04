package com.capg.java.lab1;

import java.util.Scanner;

public class Ex3usingRecursion {

public static int fibo(int n)
{
	if(n<=1)
	{
		return n;
	}
	return fibo(n-1)+fibo(n-2);

}

public static void main(String[] args) {

	Scanner myin=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num=myin.nextInt();
	Ex3usingRecursion e=new Ex3usingRecursion();
	int d=e.fibo(num);
	for(int i=1;i<=num;i++)
	{
			System.out.println(fibo(i) + " ");
	}

	}
}




