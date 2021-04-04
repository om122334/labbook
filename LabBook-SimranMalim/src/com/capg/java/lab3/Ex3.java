package com.capg.java.lab3;

import java.util.Scanner;

public class Ex3 {
	
	 static boolean isVowel(char ch) 
	    { 
	        if (ch != 'a' && ch != 'e' && ch != 'i'
	                && ch != 'o' && ch != 'u')  
	        { 
	            return false; 
	        } 
	        return true; 
	    } 
	 
	public String alterString (String n)
	{
		char[] s=n.toCharArray();
		// Start traversing the string 
        for (int i = 0; i < s.length; i++) 
        { 
            if (!isVowel(s[i])) 
            { 
  
                // if character is z, 
                // than replace it with character b 
                if (s[i] == 'z')  
                { 
                    s[i] = 'b'; 
                } 
                  
                // if the alphabet is not z 
                else
                { 
  
                    // replace the element with 
                    // next immediate alphabet 
                    s[i] = (char) (s[i] + 1); 
  
                    // if next immediate alphabet is vowel, 
                    // than take next 2nd immediate alphabet 
                    // (since no two vowels occurs consecutively 
                    // in alphabets) hence no further 
                    // checking is required 
                    if (isVowel(s[i]))  
                    { 
                        s[i] = (char) (s[i] + 1); 
                    } 
                } 
            } 
        } 
        return String.valueOf(s); 

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sting");
		String name=sc.nextLine();
		
		Ex3 e=new Ex3();
		System.out.println(e.alterString(name));

	}

}
