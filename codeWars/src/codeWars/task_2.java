package codeWars;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task_2 {

	public static void main(String[] args) {
		System.out.println(sortDesc(15));// TODO Auto-generated method stub

	}
	public static int sortDesc(final int num) {
		  String digit = Integer.toString(num);
		   ArrayList<Integer> massiv = new ArrayList<Integer>();
		
		  String res = "";
		  for(int i = 0 ; i < digit.length(); i++) {
			  res = digit.substring(i,i+1);
			  massiv.add(Integer.parseInt(res));
		  }
		  res = "";
		  Collections.sort(massiv);
		  for(int i = massiv.size()-1; i > -1 ;i--) {
			  res += massiv.get(i).toString();
		  }
		  
		  return Integer.parseInt(res);
		  }

}
