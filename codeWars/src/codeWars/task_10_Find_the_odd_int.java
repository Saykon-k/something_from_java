package codeWars;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.List;

public class task_10_Find_the_odd_int {
	public static void main(String[] args) {
	}
	public static int findIt(int[] a) {
		HashMap<Integer, Integer> map = new HashMap<>();
	    
	    for (int element : a) 
	    {   
	        if(map.get(element) == null)
	        {
	            map.put(element, 1);
	        }
	        else
	        {
	            map.put(element, map.get(element)+1);
	        }
	    }
	         
	    Set<Entry<Integer, Integer>> entrySet = map.entrySet();
	    int ciclo = 0 ; //)))))
	    for (Entry<Integer, Integer> entry : entrySet) 
	    {               
	        if(entry.getValue() %2 == 1)
	        {
	            ciclo = entry.getKey();
	          break;
	        }
	      
	    }
	  return ciclo;
		}
}
