package codeWars;

import java.util.HashMap;
import java.util.Map;

public class task_19_Vasya___Clerk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tickets(new int []{25, 100});
		} 
	public static String Tickets(int[] peopleInLine){
		Map<Integer , Integer> bank = new HashMap<Integer , Integer>();
  		bank.put(25, 0);
  		bank.put(50, 0);
  		bank.put(100, 0);
  		int n25 = 0 , n50 = 0, n100 = 0;
  		String res = "YES";
  		for(int i : peopleInLine) {
  			if(i == 25 ) {
  				n25++;
  				bank.put(25, n25);
  			}
  			if(i == 50 ) {
  				if(n25 != 0) {
  				n50++;
  			  	bank.put(50, n50);
  				n25--;
  			  	bank.put(25, n25);
  			}else {
  				res = "NO";
  				break;		
  			}
  			}
  			if(i == 100) {
  				if(n50 >= 1 && n25>=1) {
  	  				n50--;
  	  				n25--;
  	  				n100++;
  	  			  	bank.put(50, n50);
  	  			  	bank.put(25, n25);
  	  			  	bank.put(100, n100);
  				}else {
  					if(n25>=3) {
  	  	  				n100++;
  	  	  				n25-=3;
  	  	  			  	bank.put(25, n25);
  	  	  			  	bank.put(100, n100);
  					}else {
  	  					res = "NO";
  	  	  				break;	
  				}
  				}
  			}
  			  			
  		}
		return res;
  }

}
