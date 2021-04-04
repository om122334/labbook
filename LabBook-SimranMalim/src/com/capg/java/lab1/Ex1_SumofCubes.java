package com.capg.java.lab1;
import java.util.Scanner;
public class Ex1_SumofCubes {
	
	

	public static void main(String[] args) {
		Scanner myin=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=myin.nextInt();
		int sum=0;
		while(num!=0)
		{
			int d=num%10;
			sum=sum+d*d*d;
			num=num/10;
		}
		System.out.println("The sum of cubes of digits of given number is "+sum);

	}

}
