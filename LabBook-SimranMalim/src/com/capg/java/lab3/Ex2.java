package com.capg.java.lab3;

import java.util.Scanner;

public class Ex2 {

	public String getImage(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		//String nom=s.toString();
		String res=sb.append("|").toString();
		String rev=sb.reverse().toString();
		String res1=res.concat(rev);
		return res1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2 e=new Ex2();
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sting");
		name=sc.nextLine();
		String ab=e.getImage(name);
		System.out.println(ab);

	}

}
