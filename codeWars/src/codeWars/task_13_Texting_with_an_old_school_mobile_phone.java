package codeWars;

import java.nio.charset.Charset;
import java.util.HashMap;

public class task_13_Texting_with_an_old_school_mobile_phone {

	public static void main(String[] args) {
	}
	///неготов....
	public static String sendMessage(String message) {
		HashMap<String, String> map = new HashMap<>();

		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char t = 'a';
		//Character.toUpperCase(t);
		String s;
		for(int i = 2 ; i < 5;i++) {
			s = String.valueOf(alphabet[i]);
			for(int i1 = 0 ; i1<3; i1++) {
				map.put(s, Integer.toString(i));
				s += String.valueOf(alphabet[i]);
			}
			}
		map.put("p", Integer.toString(7));
		map.put("q", Integer.toString(77));
		map.put("r", Integer.toString(777));
		map.put("s", Integer.toString(7777));
		
		map.put("t", Integer.toString(8));
		map.put("u", Integer.toString(88));
		map.put("v", Integer.toString(888));
		
		map.put("w", Integer.toString(9));
		map.put("x", Integer.toString(99));
		map.put("y", Integer.toString(999));
		map.put("z", Integer.toString(9999));
		
		map.put("'", "*");
		map.put("-", "**");
		map.put("+", "***");
		map.put("=", "****");
		
		String[] text = message.split("");
		String res ="";
		
	    return message;
	  }

}
