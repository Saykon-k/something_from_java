package codeWars;
import java.math.BigInteger;  

public class task_6_a_number_prime {
	  public static void main(String args[])  
	    {  
	      System.out.println(isPrime(-5));
	    }  
	  public static boolean isPrime(int number) {
		  	if(number > 0 ) {
		    BigInteger bigInt = BigInteger.valueOf(number);
		    return bigInt.isProbablePrime(100);
		  	}else {
		  		return false;
		  	}
		}

}
