package drevo;

public class method_of_search_elements {

	public static void main(String[] args) {
		int [] for_example = {1,15,15,15,15,15,78,90};
		System.out.println(binarysearch(for_example, 15));	
	}
	public static int binarysearch(int[] massive,int target) {
		int min = 0;
		int max = massive.length-1;
		int k = 0;
		int middel = 0;
		while(min<=max) {
		middel = (min+max)/2;
		
		if(target < massive[middel] ){
			
			max = middel - 1;
		
		}else{ 
			if(target > massive[middel]) {
				
			min = middel + 1;
			
			}else {
				if(middel!=0) {
					if(massive[middel] != massive[middel-1]) {
						System.out.println("Вы нашли элемент индекс " + middel +". Вам потребовалось - " + k +" шагов....,");
				
						return middel;
					}else {
						int m = -1;
						while(massive[middel+m]==target) {
							m--;
						}
						System.out.println("Вы нашли элемент индекс " + middel +". Вам потребовалось - " + (k-m));
						System.out.println("Имеются дубликаты");
						return middel;
					}
					
				}else {
					System.out.println("Вы нашли элемент индекс " + middel +". Вам потребовалось - " + k +" шагов////");
					
					return middel;
				}
			}
			}
		k++;
		}
		System.out.println("Такого элемента нет в списке");
		return -1;
	}

	public static int interpolationsearch(int[] massive, int target) {
		// Возвращает индекс элемента со значением target или -1, если такого элемента не существует
	    int mid;
	    int low = 0;
	    int high = massive.length - 1;

	    while (massive[low] < target && massive[high] > target) {
	        if (massive[high] == massive[low]) 
	            break;
	        mid = low + ((target - massive[low]) * (high - low)) / (massive[high] - massive[low]);

	        if (massive[mid] < target)
	            low = mid + 1;
	        else if (massive[mid] > target)
	            high = mid - 1;
	        else
	            return mid;
	    }

	    if (massive[low] == target)
	        return low;
	    if (massive[high] == target)
	        return high;

	    return -1; // Not found
	    }
}
