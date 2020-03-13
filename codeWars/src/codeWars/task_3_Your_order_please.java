package codeWars;

import java.util.ArrayList;

public class task_3_Your_order_please {
	
	public static void main(String[] args) {
		System.out.println(order("1 2 3 4 5 6 7 8 9"));
	}
	
	
	public static String order(String words) {
		String retword[] = {"","","","","","","","","",""};
		int nomer = 0;
		String slovo = "";
		int pred = -1;
		for(int i = 0 ; i < words.length(); i++) {
			
			if(words.substring(i,i+1).equals(" ")) {

				if(nomer != pred) {
					System.out.println(nomer);
					retword[nomer] = slovo;
					pred = nomer;
				}
				
				slovo="";
				
				}else {
					if(Character.isDigit(words.charAt(i))) {
						nomer = Integer.parseInt(words.substring(i,i+1))-1;
						System.out.println(nomer);
					}
					slovo += words.substring(i,i+1);
					
				}
			
			}
		if(nomer != pred) {
			retword[nomer] = slovo;
			pred = nomer;
		}
		slovo = "";
		for(int i = 0 ; i < 9 ; i++) {
			System.out.println(retword[i]);
			if(!retword[i].equals("")) {
				slovo += " " + retword[i];
			}
		}
		if(slovo.equals("")) {
			return "";
		}else {
		
		return slovo.substring(1,slovo.length());
		}
	}
	
	
//	public static String order(String words) {
//		String retword[] = {"","","","","","","","",""};
//		int nomer = 0;
//		int prednomer = 0;
//		String slovo = "";
//		for(int i = 0; i < words.length(); i++) {
//							
//			if(Character.isDigit(words.charAt(i))) {
//				nomer = Integer.parseInt(words.substring(i,i+1));
//			}
//			
//			if(words.substring(i,i+1).equals(" ")) {
//				retword[nomer] = slovo;
//				slovo = "";
//				System.out.println();
//				
//			}else {
//				
//			slovo += words.substring(i,i+1);
//			System.out.println(slovo);
//			}
//		}
//		
//		System.out.println("cicle");
//		for(int i = 0 ; i < 9 ; i++) {
//			System.out.println(retword[i]);
//			if(!retword[i].equals("")) {
//				slovo += " " + retword[i];
//			}
//		}
//		
//		return slovo.substring(1, slovo.length());
//		
//	}

}
