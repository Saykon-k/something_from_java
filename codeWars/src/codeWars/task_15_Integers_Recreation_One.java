package codeWars;

import java.util.ArrayList;
import java.util.Scanner;

public class task_15_Integers_Recreation_One {

	public static void main(String[] args) {
//		  int a;
//	        Scanner scn=new Scanner(System.in);
//	        System.out.println("¬ведите натуральное число");
//	        if(scn.hasNextInt()){
//	            a=scn.nextInt();
//	            System.out.print("ƒелител€ми числа "+a+" €вл€ютс€ ");
//	            for(int i=a;i>0;i--){
//	                int b=a%i;
//	                if(b==0)
//	                    System.out.print(i+" ");
//	            }
//	        }
//	        else System.out.println("ќшибка. ¬ведено не число");
//	        
		listSquared(1,250);
		
	    }// TODO Auto-generated method stub

	
public static String listSquared(long m, long n) {
	ArrayList<Long> dep = new ArrayList<Long>();
	String res = "[";
	long sum = 0;
	for(long i = m; i <= n; i++) {
		for(long i1 = i; i1>0; i1--) {
			long b = i % i1;
			if(b == 0) {				
				dep.add(i1);
			}
			
		}
		for(long i2 : dep) {
		sum += Math.pow(i2,2);
		}
		if(Math.sqrt(sum) % 1 == 0) {
			
			res+="[" +Long.toString(i)+", "+Long.toString(sum) +"] ,";
		}
		sum=0;
		dep.clear();
	}
	String[] res1 = res.split(" ,");
	res="";
	
	for(int i = 0; i < res1.length-1;i++) res +=res1[i]+", ";
	res += res1[res1.length-1]+"]";
	System.out.println(res);
	 return null;
}
}

