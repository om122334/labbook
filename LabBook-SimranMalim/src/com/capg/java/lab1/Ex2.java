package com.capg.java.lab1;

import java.util.Scanner;

public class Ex2 {
	
	public void signal(String xyz)
	{
      switch (xyz) {
		
	    case "red":
	      System.out.println("stop");
	      break;
	    case "yellow":
		      System.out.println("ready");
		      break;
	    case "green":
		      System.out.println("go");
		      break;
		      default:
		    	  System.out.println("nnnn");
      }
	    
	}

	public static void main(String[] args) {
		
		Scanner myin=new Scanner(System.in);
		System.out.println("Select the value from red yelow green : ");
		String value=myin.next().toLowerCase();
		Ex2 e=new Ex2();
		e.signal(value);
				
	
	}

}
