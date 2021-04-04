package com.capg.java.lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date");
		int date=sc.nextInt();
		System.out.println("Enter month");
		int mnth=sc.nextInt();
		System.out.println("Enter year");
		int year=sc.nextInt();
		LocalDate pdate = LocalDate.of(year, mnth, date);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
        System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());

	}

}
