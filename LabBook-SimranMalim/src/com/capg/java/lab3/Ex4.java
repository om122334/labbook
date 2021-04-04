package com.capg.java.lab3;

import java.util.Scanner;

public class Ex4 {
 
	public int modifyNumber(int n)
	{
		/*String str=Integer.toString(n);
		for(int i=0;i<str.length();i++)
		{
		    int dif=str.charAt(0)-str.charAt(1);
		    System.out.println(dif);
		}
		return n;*/
		
		String str = Integer.toString(n);
		StringBuffer strBuffer = new StringBuffer();
		char[] ch = str.toCharArray();
		int len = ch.length;
		for(int i=0; i < len-1; i++) {
			int n1 = (int)ch[i];
			int n2 = (int)ch[i+1];
			strBuffer.append(Math.abs(n2-n1));
		}
		strBuffer.append(Math.abs(ch[0]-ch[len-1]));
		String s = strBuffer.toString();
		int newNumber = Integer.parseInt(s);
		return newNumber;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		Ex4 e=new Ex4();
		System.out.println("Number : "+e.modifyNumber(no));
	}

}
