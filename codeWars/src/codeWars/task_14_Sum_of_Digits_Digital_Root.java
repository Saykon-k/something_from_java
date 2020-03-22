package codeWars;

public class task_14_Sum_of_Digits_Digital_Root {

	public static void main(String[] args) {
		digital_root(942);

	}
	public static int digital_root(int n) {
		String[] text = Integer.toString(n).split("");
		int sum = 0;
		int end = n;
		while(text.length != 1) {
			for(int i = 0 ; i < text.length; i++) {
				
				sum += Integer.parseInt(text[i]);

			}
			
			text = Integer.toString(sum).split("");
			end = sum;
			sum = 0;
		}
		return end;

	}
	  }

