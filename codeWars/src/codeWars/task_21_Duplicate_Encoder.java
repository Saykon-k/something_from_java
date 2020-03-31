package codeWars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task_21_Duplicate_Encoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static String encode(String word){
		char word1[] = word.toLowerCase().toCharArray();
		Map<Character , Integer> bank = new HashMap<Character , Integer>();
		String s ="";
		for(char i : word1) if(bank.containsKey(i)) { bank.put(i,bank.get(i)+1);}else {bank.put(i,1);}
		for(char i :word1) if(bank.get(i)==1) { s+="(";}else {s+=")";}
		return s;

	  }
}
