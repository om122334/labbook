package com.capg.java.lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integers::");
		String num=sc.nextLine();
		StringTokenizer tok=new StringTokenizer(num);
		int number=0,sum=0;
		System.out.println("You have entered::");
		while(tok.hasMoreTokens())
		{
			String s=tok.nextToken();
			number=Integer.parseInt(s);
			System.out.println(number+"");
			sum=sum+number;
		}
		System.out.println();
		System.out.println("Sum of all integers is::"+sum);

	}



}
