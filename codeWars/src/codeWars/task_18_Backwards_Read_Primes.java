package codeWars;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.TreeSet;

public class task_18_Backwards_Read_Primes {
    public static void main(String[] args) throws IOException {

    	backwardsPrime(9900,10000);
    }
	public static String backwardsPrime(long start, long end) {
		TreeSet<Long> fil = new TreeSet<Long>();
		StringBuilder input1 = new StringBuilder(); 
		long s1 = 0;
		for(long i = start; i < end; i++) {
			s1 = i;
	        input1.append(Long.toString(s1)).reverse(); 
			if(isPrime(i) && isPrime(Long.valueOf(input1.toString().trim())) && !fil.contains(i) && !fil.contains(Long.valueOf(input1.toString().trim())) && (i != Long.valueOf(input1.toString().trim())) 
				 ) {
					fil.add(i);
					if(start<=Long.valueOf(input1.toString().trim()) && Long.valueOf(input1.toString().trim())<=end)
					fil.add(Long.valueOf(input1.toString().trim()));
				
			}
			input1.delete(0, input1.length());
		}
		String s = "";
		for(Long i : fil) s+= Long.toString(i)+" ";
		System.out.println(s);
		if(!s.isEmpty()) {
		return s.substring(0, s.length()-1);
		}else {
			return "";
		}
	}
	public static boolean isPrime(long number) {
	  	if(number > 0 ) {
	    BigInteger bigInt = BigInteger.valueOf(number);
	    return bigInt.isProbablePrime(100);
	  	}else {
	  		return false;
	  	}
	}

}
