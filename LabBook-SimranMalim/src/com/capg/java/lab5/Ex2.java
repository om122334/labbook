package com.capg.java.lab5;
import java.util.Scanner;

class NameException extends Exception {
	 
	 public NameException(String str) { 
	  System.out.println(str);
	 }
	}
	public class Ex2 {
	  public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter ur first name :: ");
	  String fname = s.nextLine();
	  System.out.print("Enter ur last name :: ");
	  String lname = s.nextLine();
	  try {
	   if(fname.length()==0 && lname.length()==0) 
	    throw new NameException("Please enter your full name");
	   else
	    System.out.println("Name entered successfully");
	  }
	  catch (NameException a) {
	   System.out.println(a);
	  }
	 }

}
