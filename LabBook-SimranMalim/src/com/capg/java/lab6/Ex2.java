package com.capg.java.lab6;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Ex2 {
	
	
	public static void countChars(String inputString){
	HashMap<Character, Integer>map=new HashMap<>();
	char[] arr=inputString.toCharArray();
	for(char a:arr){
		if(map.containsKey(a))
		{
			map.put(a, map.get(a)+1);
		}
		else
		{
			map.put(a, 1);
		}
	}
		System.out.println(inputString+":"+map);
		
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a character :: ");
		String ab = s.nextLine();
		countChars(ab);
		

	}

}
