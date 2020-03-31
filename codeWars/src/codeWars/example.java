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
if(all[i][1] > all[i-1][1]) {
	 if(cor ==  0) {
	 mem[all[i][2]]=p;
	 p+=1;
	 }else {
		 mem[all[i][2]]=p;
		 mem[all[i-1][2]]=p+1+cor;
		 p+=1+cor;
		 cor=0;
	 }
}else {
	 if(all[i][0] > all[i-1][0]) {
		 if(cor ==  0) {
		 mem[all[i][2]]=p;
		 p+=1;
		 }else {
			 mem[all[i][2]]=p;
			 mem[all[i-1][2]]=p+1+cor;
			 p+=1+cor;
			 cor=0;
		 }	 
}else{
	 System.out.println(all[i][3]);
	 if(all[i][3] > all[i-1][3]) {
		 if(cor ==  0) {
			 mem[all[i][2]]=p;
			 p+=1;
			 }else {
				 mem[all[i][2]]=p;
				 mem[all[i-1][2]]=p+1+cor;
				 p+=1+cor;
				 cor=0;
			 }	 
}else {
mem[all[i][2]] = p;
mem[all[i-1][2]] = p;
cor +=1;
}
}
}
}

