package codeWars;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import org.omg.DynamicAny.NameValuePair;

public class task_10_Find_the_odd_int {
	public static void main(String[] args) {
		int[] ar = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
		findDuplicatesUsingHashMap(ar);
	}
	private static void findDuplicatesUsingHashMap(int[] inputArray)
	{
	    HashMap<Integer, Integer> map = new HashMap<>();
	         
	    for (int element : inputArray) 
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
	         
	    for (Entry<Integer, Integer> entry : entrySet) 
	    {               
	        if(entry.getValue() > 1)
	        {
	            System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
	        }
	    }
	}
}
