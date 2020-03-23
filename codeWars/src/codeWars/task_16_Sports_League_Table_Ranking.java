package codeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class task_16_Sports_League_Table_Ranking {
	
//неготово
	public static void main(String[] args) {
		int a[] []=  {{0, 5, 2, 2},
                {1, 4, 0, 2},
                {2, 3, 1, 2},
                {1, 5, 2, 2},
                {2, 0, 1, 1},
                {3, 4, 1, 1},
                {2, 5, 0, 2},
                {3, 1, 1, 1},
                {4, 0, 2, 0}};
		computeRanks(6, a);

} 
			
	

	  public static int[] computeRanks(int number, int[][] games) {

		  HashMap<Integer, int[]> map = new HashMap<>();
			
			for(int y = 0 ; y < number;y++) {
				int a[] = {0,0,y};
				map.put(y,a);
			}
			for(int i = 0; i < games.length; i++) {
				int point_gb_1[] =  map.get(games[i][0]);
				int point_gb_2[] =  map.get(games[i][1]);
				
				if(games[i][2] == games[i][3]) {
				
					point_gb_1[1]+=1;
					point_gb_2[1]+=1;
				}else {
					
					if(games[i][2] < games[i][3]) {
						point_gb_2[1]+=2;

						point_gb_1[0] +=  (-games[i][3] +games[i][2]);
						point_gb_2[0] +=  (games[i][3] -games[i][2]);
						
						map.put(games[i][0],point_gb_1);
						map.put(games[i][1],point_gb_2);

				}else {
					point_gb_1[1]+=2;

					point_gb_1[0] +=  (games[i][2] -games[i][3]);
					point_gb_2[0] -=  (games[i][2] -games[i][3]);
					
					map.put(games[i][0],point_gb_1);
					map.put(games[i][1],point_gb_2);
				}
				
				}
			}
			 int all [][] = new int[number][3];
			 for(int i = 0; i < number;i++ ) {
				 all[i] = map.get(i);
				 
					 System.out.print(all[i][0]+" "+all[i][1]+" "+all[i][2]);
					 System.out.println();
					 
				 }
			 sortbyColumn(all,1);
			 System.out.println();
//						for(int i = 0 ; i < number; i++) {
//				int b[] = map.get(i);
//				System.out.print("ключ = " + i +": ");
//				for(int i1 = 0; i1<3;i1++ ) {
//					System.out.print( b[i1]+" ");
//				}
//				System.out.println();
//			}
			 for(int i = 0; i < number;i++ ) {				 
					 System.out.print(all[i][0]+" "+all[i][1]+" "+all[i][2]);
					 System.out.println();
				 }
			 
		  return null;
	  }
	    
	  public static void sortbyColumn(int arr[][], int col) 
	    { 
	        // Using built-in sort function Arrays.sort 
	        Arrays.sort(arr, new Comparator<int[]>() { 
	            
	          @Override              
	          // Compare values according to columns 
	          public int compare(final int[] entry1,  
	                             final int[] entry2) { 
	  
	            // To sort in descending order revert  
	            // the '>' Operator 
	            if (entry1[col] > entry2[col]) 
	                return 1; 
	            else
	                return -1; 
	          } 
	        });  // End of function call sort(). 
	    } 
}
