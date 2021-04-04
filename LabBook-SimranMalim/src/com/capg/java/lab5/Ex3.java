package com.capg.java.lab5;

import java.util.Scanner;
//lab 5 Ex no 3

class EmployeeException extends Exception{
	public EmployeeException(String str)
	{
		System.out.println(str);
	}
}
public class Ex3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ur name :: ");
		String name = s.nextLine();
		System.out.print("Enter ur salary :: ");
		int sal = s.nextInt();
		
		try {
			   if(sal < 3000) 
			    throw new EmployeeException("Your salary cannot be less than 3000");
			   else
			    System.out.println(name+" your salary is "+sal);
			  }
			  catch (EmployeeException a) {
			   System.out.println(a);
			  }
			 
	}

}
