package codeWars;

import java.util.ArrayList;
import java.util.HashMap;

public class task_8_Delete_occurrences_of_an_element_if_it_occurs_more_than_n_times {

	public static void main(String[] args) {
		int a[] = { 20, 37, 20, 21 };
 		deleteNth(a,1);
 	
	}
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		HashMap<Integer, Integer> povtor_el = new HashMap<>();
		ArrayList<Integer> massiv = new ArrayList<Integer>();
		int prom;
		if(maxOccurrences > 0 ) {
		for(int i = 0; i < elements.length; i++) {
			
			if(povtor_el.containsKey(elements[i])) {
				prom = povtor_el.get(elements[i]);
				if(prom+1 < maxOccurrences) {
					povtor_el.put(elements[i], prom+1);
					massiv.add(elements[i]);
				}else {
					povtor_el.put(elements[i], prom+1);
				}
			}else {
				povtor_el.put(elements[i], 0);
				massiv.add(elements[i]);
			}
		}
		int[] ret = new int[massiv.size()];
	   
		 for (int i=0; i < ret.length; i++)
		    {
		        ret[i] = massiv.get(i).intValue();
		    }
		    return ret;
		}else {
			
			return new int[] {};
		}
	}
}
