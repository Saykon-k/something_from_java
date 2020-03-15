package codeWars;

public class task_11_Persistent_Bugger {

	public static void main(String[] args) {
		persistence(1);

	}
public static int persistence(long n) {
		String s = Long.toString(n);
		n = 1;
		int counter = 0 ;
		while(s.length()!= 1) {
		for(int i = 0 ; i < s.length() ; i++) {
			n*= Integer.parseInt(s.substring(i,i+1));
		}
		s = Long.toString(n);
		n=1;
		counter++;
		}
		System.out.println(counter);

		return counter;
	}

}
