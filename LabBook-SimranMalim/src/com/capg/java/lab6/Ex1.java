package com.capg.java.lab6;

import java.util.HashMap;
import java.util.Map;
public class Ex1 {
	
	public void getValues(){
	Map<Integer,String> map=new HashMap<>();	
	map.put(1, "thane");
	map.put(9, "capgemini");
	map.put(5, "mumbai");
	map.put(2, "chembur");
	map.keySet().forEach(values ->{
	System.out.println(values + "->"+map.get(values));
	});	
	}
	public static void main(String[] args) {
    Ex1 ex=new Ex1();
    ex.getValues();
	}

}
