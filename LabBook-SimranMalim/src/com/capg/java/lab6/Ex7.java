package com.capg.java.lab6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex7 {

		static void getSorted(int[] array) {
		List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println("Reversed array list: " + list);
		
		Collections.sort(list);
		System.out.println("Sorted array list: " + list);
		
		}
		
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Count of numbers you wish to enter:");
		int count = sc.nextInt();
		int[] array = new int[count];
		
		System.out.println("Enter " + count + " numbers");
		
		for (int i = 0; i < count; i++) {
			array[i] = sc.nextInt();
		}
		
		getSorted(array);
		sc.close();

}

}

