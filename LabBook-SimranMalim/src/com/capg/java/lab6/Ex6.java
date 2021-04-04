package com.capg.java.lab6;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex6 {

	public static ArrayList<Integer> voterList(HashMap<Integer, Integer> map) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < map.size()+1; i++) {
			if(map.get(i) >= 18){
				System.out.println("Eligible for vote");
				list.add(i);
			}

			else
				System.out.println("Not Eligible for vote");
		}
		return list;
}


	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			map.put(1, 18);
			map.put(2, 16);
			map.put(3, 23);
			map.put(4, 10);
			System.out.println("Valid voters id are: "+voterList(map));
			}


}

