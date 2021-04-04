package com.capg.java.lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Ex5 {
       public static void getSecondSmallest(int[] arr){
    List<Integer> list =  Arrays.stream(arr).boxed().collect(Collectors.toList());      
       System.out.println(list);
       Collections.sort(list);
       System.out.println("Second Smallest Element: "+list.get(1));
       }
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("How many numbers do you want to count:");
 int c=sc.nextInt();
 int[] arr=new int[c];
 System.out.println("Enter "+c+" numbers");
     for(int i=0;i<c;i++)
     {
     arr[i]=sc.nextInt();
     }
     getSecondSmallest(arr);
  }  

}
