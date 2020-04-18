package codeWars;
import java.math.*;
import java.util.Arrays;
public class task_22_Number_Zoo_Patrol {

	public static void main(String[] args) {
		int u[] = {2, 3, 4};
		System.out.println(findMissingNumber(u));

	}
	public static int findMissingNumber_secut(int[] numbers) {
		BigInteger sum_dig = BigInteger.valueOf(0);
        BigInteger a ;
        BigInteger b ;
        for(int u = 0; u < numbers.length;u++) sum_dig = sum_dig.add(BigInteger.valueOf(numbers[u]));
        a = BigInteger.valueOf(numbers.length+1);
        b = BigInteger.valueOf(numbers.length+2);
        a = a.multiply(b);
        a = a.divide(BigInteger.valueOf(2));
        a = a.subtract(sum_dig);
        return a.intValue(); 
    }
	  public static int findMissingNumber_memory_out(int[] numbers) {
	        return  (int)((numbers.length+1)*(numbers.length+2) / 2 - Arrays.stream(numbers).sum());
	    }
	    public static int findMissingNumber(int[] numbers) {
	        long sum = numbers.length + 1;
	        return (int)(sum * (sum+1) / 2 - Arrays.stream(numbers).sum());
	    }
	    
	    
	    
	    
}
