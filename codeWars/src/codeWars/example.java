package codeWars;

import java.util.HashSet;
import java.lang.*; 
import java.io.*; 
import java.util.*;
public class example {

	public static void main(String[] args) {
		HashSet<Long> countryHashSet = new HashSet<>();
		countryHashSet.add((long) 100);
		countryHashSet.add((long) 37);
		countryHashSet.add((long) 7);
		countryHashSet.add((long) 3);

		for(Long i : countryHashSet)
			System.out.println(i);
		System.out.println(Integer.parseInt("001"));
		  String input = "001"; 
		  
	        StringBuilder input1 = new StringBuilder(); 
	  
	        // append a string into StringBuilder input1 
	        input1.append(input);//.reverse(); 
	  
	        // reverse StringBuilder input1 
	        input = input1.toString();
	        // print reversed String 
	        System.out.println(Long.valueOf(input1.toString().trim()));
	    } 
	}


