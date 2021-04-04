package com.capg.java.lab7;

import java.util.Scanner;

public class Maincontroller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int eid;
		String name;
		double salary;
		String designation;
		String insuranceScheme;
		
		Scanner s=new Scanner(System.in);   //2
		System.out.println("Enter employee id");
		eid=s.nextInt();
		System.out.println("Enter employee name");
		name=s.next();
		System.out.println("Enter employee salary");
		salary=s.nextDouble();
		System.out.println("Enter employee insurance scheme");
		insuranceScheme=s.next();
		
		Serviceimpl service=new Serviceimpl();
		
				

	}

}
