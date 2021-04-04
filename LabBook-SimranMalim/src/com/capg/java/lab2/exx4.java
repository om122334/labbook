package com.capg.java.lab2;
import java.util.Arrays;
import java.util.Scanner;

public class exx4 {
	static int modifyArray (int arr[],int n)
	{
		if (n==0||n==1)
			return n;
		int[] temp=new int[n];
		int j=0;
		for (int i=0; i<n-1;i++)
			if (arr[i]!=arr[i+1])
				temp[j++] =arr[i];
				temp[j++]=arr[n-1];
			for(int i=0;i<j;i++)
				arr[i]=temp[i];
				return j;
	}

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter? ");
		int count=scan.nextInt();
		Scanner scan2 = new Scanner(System.in);
		int arr[] = new int[count];
		System.out.print("Enter the numbers: ");
		for (int i=0; i<count;i++)
		{
			arr[i] = scan2.nextInt();
		}
		scan.close();
		scan2.close();
//int arr[] = {29,74,37,29,78,37};
		Arrays.sort(arr);

		int n = arr.length;
		for(int m=0;m<n;m++)
			for(int j=m+1;j<n;j++)
				if(arr[m]<arr[j]){
					int temp = arr[m];
					arr[m]=arr[j];
					arr[j]=temp;
				}
		n = modifyArray(arr, n);
		System.out.println("After removing duplicates: ");
		for (int i =0;i<n;i++)
			System.out.print(arr[i]+" ");
}
}
