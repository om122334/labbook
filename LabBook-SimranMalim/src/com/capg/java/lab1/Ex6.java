package com.capg.java.lab1;

import java.util.Scanner;

public class Ex6 {

static int calculatedifference(int n)  
{
int sumSq = (n * (n + 1) * (2 * n + 1)) / 6;
 
     int sumN = (n * (n + 1)) / 2;

     int sqSum = sumN * sumN;
   
     return Math.abs(sumSq - sqSum);
}

public static void main (String[] args) {

   int number;
Scanner n=new Scanner(System.in);
System.out.println("Enter number : ");
number=n.nextInt();

   System.out.print("Difference is : "+calculatedifference(number));  
}
}
