package codeWars;

public class task_4_Sum_of_the_first_nth_term_of_Series {

	public static void main(String[] args) {
			System.out.println(seriesSum(60));
	}
	public static String seriesSum(int n) {
		double sum = 0.0;
		for(int i = 0 ; i<n ;i++) {
			sum += (double) 1/(1+i*3);
		}
		
		if(n == 0 ) {
			return "0.00";
		}else {
			if(Double.toString((double)Math.round(sum * 100d) / 100d).length()==4) {
			return Double.toString((double)Math.round(sum * 100d) / 100d);
			}else {
				
				return Double.toString((double)Math.round(sum * 100d) / 100d)+"0";
			}
		}

}
}
