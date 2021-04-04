package com.capg.java.lab2;



import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ex4 {
	public int[] modifyArray(int[] n)
	{
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;i<n.length;j++)
			{
				if(n[i]<n[j])
				{
					int temp=n[i];
					n[i]=n[j];
					n[j]=temp;
							
				}
			}
		}
		
		return n;
	
		
	}
	

	public static void main(String[] args) {
		Ex4 e=new Ex4();
		Scanner myin=new Scanner(System.in);
		System.out.println("Enter total number of elements to be entered : ");
		int num=myin.nextInt();
		int[] n=new int[num];
		System.out.println("Enter the elements");
		for(int i=0;i<num;i++)
		{
			n[i]=myin.nextInt();
			//System.out.println(arr[i]);
		}
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;i<n.length;j++)
			{
				if(n[i]<n[j])
				{
					int temp=n[i];
					n[i]=n[j];
					n[j]=temp;
							
				}
			}
		}
		
		for(int i=0;i<n.length;i++)
			System.out.println(n[i]);
		//Arrays.toString(arr);
		//Arrays.sort(arr);
		//int res[]=e.modifyArray(arr);
				
		//System.out.println("Array"+Arrays.toString(res));
		

	}

}
