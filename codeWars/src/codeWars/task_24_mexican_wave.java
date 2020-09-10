package codeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class task_24_mexican_wave {
	public static void main(String args[]) {
		String s = "awfbbcvbcvb";
		wave("Two words");
		
	}
	  public static String[] wave(String str) {
		  	char[] chars = str.toCharArray();
		  	
		  	String all_word[] = str.split(" ");
		  	ArrayList<String> words_wave = new ArrayList<String>();
			  	for(int i = 0; i<str.length();i++) {
			  		if(Character.isLetter(Character.toUpperCase(chars[i]))) {
				  		String prom = str.substring(0,i).toLowerCase()+Character.toUpperCase(chars[i]) + str.substring(i+1).toLowerCase();
				  		words_wave.add(prom);
				  		} 	
		  	}
			String final_array[] = new String[words_wave.size()];
			for(int i = 0; i< words_wave.size(); i++) final_array[i] = words_wave.get(i);
	        return final_array;
	    }

	  

}
