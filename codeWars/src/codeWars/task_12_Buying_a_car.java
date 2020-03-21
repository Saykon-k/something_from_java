package codeWars;

public class task_12_Buying_a_car {

	public static void main(String[] args) {
		nbMonths(12000, 8000, 1000, 1.5);

	}
	public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
		if(startPriceOld < startPriceNew ) {
		int n = 1;
		double proc =  ((100- percentLossByMonth)/100) ;
		
		double sum_of_old_car = startPriceOld * proc;
		int saving_mon = savingperMonth *n;
		double sum_of_new_car = startPriceNew*proc;
		
		double kontrol_sum = sum_of_old_car + saving_mon - sum_of_new_car;
		
		while(kontrol_sum < 0) {
			n++;
			percentLossByMonth += 0.5;
			proc =  ((100- percentLossByMonth)/100) ;
			sum_of_old_car = sum_of_old_car * proc;
			sum_of_new_car = sum_of_new_car *proc;
			saving_mon = savingperMonth *n;
			kontrol_sum = sum_of_old_car + saving_mon - sum_of_new_car;
		

			if(kontrol_sum > 0 ) {
				break;
			}
			n++;
			sum_of_old_car = sum_of_old_car * proc;
			sum_of_new_car = sum_of_new_car *proc;
			saving_mon = savingperMonth *n;
			kontrol_sum = sum_of_old_car + saving_mon - sum_of_new_car;
			
		}
		long res1 = Math.round(kontrol_sum);
		int res[] = {n, (int)res1};
		System.out.println(res[1]);
		System.out.println(res[0]);

			return res;
		}else {
			int res[] = {0,startPriceOld - startPriceNew };
			return res;

			
		}
	}
}
