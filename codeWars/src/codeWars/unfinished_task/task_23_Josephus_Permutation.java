package codeWars.unfinished_task;

import java.util.ArrayList;
import java.util.List;

public class task_23_Josephus_Permutation {

	public static void main(String[] args){
		  List<Integer> copitmes = new ArrayList<Integer>();
		  for(int i = 1 ; i<11;i++) copitmes.add(i);
		  //josephusPermutation(copitmes, 2);
		  copitmes.add(1);
		  System.out.println(copitmes.indexOf(1));
	}

	  public static <T> List<T> josephusPermutation(final List items, final int k) {
		  int a = items.size()/k; 
		  List<Object> copitmes = new ArrayList<Object>();
		  if(a>0) {
			  for(int i=0;i<a;i++) {
				  copitmes.add(items.get(k*i));
			  }
		  }
		  for(Object i : copitmes) {
			  items.remove(items.indexOf(i));
		  }
		  for(Object i :items ) {
			  System.out.println(i);
		  }
			  
		  return null;

	  }
}
