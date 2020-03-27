package codeWars;

import java.util.Arrays;

public class task_17_Sums_of_Parts {

	public static void main(String[] args) {
		
		sumParts((new int[] {1, 2, 3, 4, 5, 6}));
	}
	  public static int[] sumParts(int[] ls) {
		  int k[] = new int[ls.length+1];
		  int sum =0;
		  k[ls.length]= 0;
		  for(int i = ls.length-1;i>-1;i--) {
			  sum += ls[i];
			  k[i] = sum;
		  }
		  //System.out.println(Arrays.toString(k));
	      return k;
	  }

}
