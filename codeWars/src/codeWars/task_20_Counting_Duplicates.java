package codeWars;

import java.util.ArrayList;

public class task_20_Counting_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public static int duplicateCount(String text) {
		  ArrayList<Character> res = new ArrayList<Character>();
		  ArrayList<Character> res1 = new ArrayList<Character>();

		  char words[] = text.toLowerCase().toCharArray();
		  int num = 0;
		  for(char word : words) {
			  if(res.contains(word)) {
				  if(res1.contains(word)) {
					  
				  }else {
					  num++;
					  res1.add(word);
				  }
			  }else {
				  res.add(word);
			  }
		  }
		  return num;  
	  }
}
