package codeWars;

import java.util.ArrayList;

public class task_1 {

	public static void main(String[] args) {
		System.out.println(disemvowel("This website is for losers LOL!"));
	}
	public static String disemvowel(String str) {
		ArrayList<String> massiv = new ArrayList <String>();
		String word = "";
		massiv.add("a");
		massiv.add("e");
		massiv.add("y");
		massiv.add("i");
		massiv.add("o");
		massiv.add("u");
		String a;
		for(int i = 0; i < str.length(); i++) {
			
			a = str.substring(i, i+1);
			if(massiv.contains(a.toLowerCase())) {
				
			}else {
				System.out.println(a);
				word += a;
			}
		}
		return word;
		
	}

}
