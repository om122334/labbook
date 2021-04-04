package com.capg.java.lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex5
{  
    public static void main(String[] args) throws IOException
    {
        int n1=1, nw=0;
        char ch;
        System.out.println("Enter text");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        char[] c=str.toCharArray();
        for(int i=0;i<n;i++){
        	if(c[i]=='\n')
        		n1++;
        	else if (c[i]==' ')
        		nw++;
        }
        System.out.println("Number of lines : " +n1);
        System.out.println("Number of words : "+n1+nw);
        System.out.println("Number of characters : "+n);
    }    
}
