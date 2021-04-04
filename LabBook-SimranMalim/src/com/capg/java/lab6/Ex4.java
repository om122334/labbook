package com.capg.java.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ex4 {
	
	public static HashMap<Integer, String> getStudents (HashMap<Integer, Integer> map)
	{
		HashMap<Integer, String> filterMap = new HashMap<Integer, String>();
		for (int i = 1; i < map.size()+1; i++) {
		if(map.get(i) >= 90){
		filterMap.put(i, "Gold");
		}
		else if(map.get(i) >= 80 && map.get(i) < 90){
		filterMap.put(i, "Silver");
		}
		else if(map.get(i) >= 70 && map.get(i) < 80){
		filterMap.put(i, "Bronze");
		}
		}
		return filterMap;
	}

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		HashMap<Integer, Integer> temp= new HashMap<Integer, Integer>(); 
		System.out.println("Enter student registration key ");
		int skey=sc.nextInt();
		System.out.println("Enter student marks key ");
		int smarks=sc.nextInt();
		temp.put(skey, smarks);
		Ex4 e=new Ex4();
		e.getStudents(temp);
		System.out.println(temp);*/
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 33);
		map.put(2, 85);
		map.put(3, 95);
		map.put(4, 75);
		System.out.println(map.get(map));
		System.out.println("List of student who got medals: "+ getStudents(map));
	}

}
