package codeWars;

public class task_26_Range_Extraction {

	public static void main(String[] args) {
		int tet[]  = {-3,-2,-1,2,10,15,16,18,20,22};
		System.out.println(rangeExtraction(tet));

	}
	public static String rangeExtraction(int [] arr) {
		String res = "";
		int rem = -1;
		int not_appropriate = -1;
		for(int i = 0; i < (arr.length-1);) {
			if(Math.abs(arr[i] - arr[i+1]) != 1) {
				res += Integer.toString(arr[i])+",";
				i++;
			}else {
				not_appropriate = neee(arr,i);
				if (not_appropriate==-1) {
					res += Integer.toString(arr[i])+",";
					rem = i;
					i++;
				}else {
					res += Integer.toString(arr[i])+"-"+Integer.toString(arr[not_appropriate])+","; 
					i = not_appropriate+1;
				}
				
			}
		}
		if(Math.abs(arr[arr.length-1] - arr[arr.length-2]) != 1) {
			res += Integer.toString(arr[arr.length-1]); 
		}else {
			if(Math.abs(arr[arr.length-1] - arr[arr.length-2]) == 1 && not_appropriate==-1) {
				res += Integer.toString(arr[arr.length-1]); 
			}
		}
		if (res.subSequence(res.length()-1, res.length()).equals(",")){
			return (String) res.subSequence(0, res.length()-1);
		}else {
			return (String) res.subSequence(0, res.length());
		}
		
	}
	public static int neee(int arr[] , int index_next_myabe) {
		int last_el = index_next_myabe;
		for(int i = index_next_myabe; i < (arr.length-1); i++) {
			if(Math.abs(arr[i]-arr[i+1])!=1) {
				break;
			}else {
				last_el++;
			}
		}
		if(last_el - index_next_myabe==1) {
			 return -1;
		}else {
			return last_el;
		}
		
	}

}
