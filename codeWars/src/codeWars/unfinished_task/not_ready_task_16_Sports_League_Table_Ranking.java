package codeWars.unfinished_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class     not_ready_task_16_Sports_League_Table_Ranking{
 
	
//неготово и не будет готова в ближайшее время и нет сравнения по количеству забитых голов  
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
		
		int b[][] =  {{0, 5, 2, 0},
                {1, 4, 2, 2},
                {2, 3, 1, 3},
                {1, 5, 0, 0},
                {2, 0, 2, 1},
                {3, 4, 3, 1}};
		int c [][] = {{0, 3, 1, 1},
        {1, 2, 2, 2},
        {1, 3, 2, 0},
        {2, 0, 2, 0}};
		int c1 [][]= {{0, 7, 2, 0}};
		//computeRanks(6, a);
		computeRanks(8, c1);
		//computeRanks(4, c);


//3-ая сортировка фигня
} 
	public static int[] computeRanks(int number, int[][] games) {

		  HashMap<Integer, int[]> map = new HashMap<>();
			//a структура 0 - разница в очка 1 - количество выйгранных матчей 2 - номер комманды 3 забитые голы
			for(int y = 0 ; y < number;y++) {
				int a[] = {0,0,y,0};
				map.put(y,a);
			}
			for(int i = 0; i < games.length; i++) {
				int point_gb_1[] =  map.get(games[i][0]);
				int point_gb_2[] =  map.get(games[i][1]);
				
				if(games[i][2] == games[i][3]) {
				
					point_gb_1[1]+=1;
					point_gb_2[1]+=1;
					
					point_gb_1[3] +=  games[i][2];
					point_gb_2[3] +=  games[i][3] ;
				}else {
					
					if(games[i][2] < games[i][3]) {
						point_gb_2[1]+=2;

						point_gb_1[0] +=  (-games[i][3] +games[i][2]);
						point_gb_2[0] +=  (games[i][3] -games[i][2]);
						
						point_gb_1[3] +=  games[i][2];
						point_gb_2[3] +=  games[i][3] ;
						
						map.put(games[i][0],point_gb_1);
						map.put(games[i][1],point_gb_2);

				}else {
					point_gb_1[1]+=2;

					point_gb_1[0] +=  (games[i][2] -games[i][3]);
					point_gb_2[0] -=  (games[i][2] -games[i][3]);
					
					point_gb_1[3] += games[i][2] ;
					point_gb_2[3] += games[i][3];
					
					map.put(games[i][0],point_gb_1);
					map.put(games[i][1],point_gb_2);
				}
				
				}
			}			 

			int all [][] = new int[number][2];
			 for(int i = 0; i < number;i++ ) {
				 all[i] = map.get(i);
				 }
			 sortbyColumn(all,1);
			 int p = 1;
			 ArrayList<int[]> fin2 = new ArrayList<int[]>();
			 ArrayList<int[]> fin3 = new ArrayList<int[]>();
			 boolean wow = false;
			

			
			 for(int i = 0 ; i < all.length-1;i++) {
				 while(all[i][1] == all[i+p][1]) {
					 if( p == 1 ) {
					 fin2.add(all[i]);						
					 fin2.add(all[i+p]);
					 p++;
					 }else {
						 fin2.add(all[i+p]);
						 p++;
						 if(p+i > all.length-1) {
						 	 wow = true;
							 break;
						 }
					 }
					 if(p+i > all.length-1) {
					 	 wow = true;
						 break;
					 }

				 }
			 	 if(p != 1) {
					 int xc = 0;
					 int u[][] = new int[fin2.size()][3];
					 for(int[] kek : fin2) {
						 u[xc] = kek;
						 xc++;
					 }
					 sortbyColumn(u,0);
					 for(int i1 = 0; i1 < p; i1++) {
						 fin3.add(u[i1]);
					 }
					 i += p-1;
					 if (!wow) {
					 p = 1;
					 }

				 }else {
					 fin3.add(all[i]);
				 } 
				 if( wow ) {
					 break;
				 }
				 fin2.clear();
			 }
			 if(p == 1) {
				 fin3.add(all[all.length-1]);
			 }


			 for(int i = 0; i < fin3.size(); i++) {
				 all[i] = fin3.get(i);
			 }

			 p = 1;
			 fin2.clear();
			 fin3.clear();
			  wow = false;
			for(int i = 0; i< all.length;i++) {
				System.out.println(+all[i][0]+" "+all[i][1]+" "+all[i][2]+" "+all[i][3]+" ");
			}
			 for(int i = 0 ; i < all.length-1;i++) {
				 while(all[i][0] == all[i+p][0]) {
					 if( p == 1 ) {
					 fin2.add(all[i]);						
					 fin2.add(all[i+p]);

					 p++;
					 }else {
						 fin2.add(all[i+p]);
						 p++;
						 if(p+i > all.length-1) {
						 	 wow = true;
							 break;
						 }
					 }
					 if(p+i > all.length-1) {
					 	 wow = true;
						 break;
					 }
				 }
			 	 if(p != 1) {
					 int xc = 0;
					 int u[][] = new int[fin2.size()][3];
					 for(int[] kek : fin2) {
						 u[xc] = kek;
						 xc++;
					 }
					 sortbyColumn(u,3);
					 for(int i1 = 0; i1 < p; i1++) {
						 fin3.add(u[i1]);
					 }
					 i += p-1;
					 if (!wow) {
					 p = 1;
					 }
				 }else {
					 fin3.add(all[i]);
				 } 
				 if( wow ) {
					 break;
				 }
				 fin2.clear();
			 }
			 if(p == 1) {
				 fin3.add(all[all.length-1]);
			 }
			 for(int i = 0; i < fin3.size(); i++) {
				 all[i] = fin3.get(i);
			 }
			 int mem[] = new int[fin3.size()];
			 p=1;
			 int cor = 0;
			 for(int i = fin3.size()-1; i > 0;i--) {
				 if(all[i][1] > all[i-1][1]) {
					 if(cor ==  0) {
					 mem[all[i][2]]=p;
					 p+=1;
					 }else {
						 mem[all[i][2]]=p;
						 mem[all[i-1][2]]=p+1+cor;
						 p+=1+cor;
						 cor=0;
					 }
				 }else {
					 if(all[i][0] > all[i-1][0]) {
						 if(cor ==  0) {
						 mem[all[i][2]]=p;
						 p+=1;
						 }else {
							 mem[all[i][2]]=p;
							 mem[all[i-1][2]]=p+1+cor;
							 p+=1+cor;
							 cor=0;
						 }	 
				 }else{
					 if(all[i][3] > all[i-1][3]) {
						 if(cor ==  0) {
							 mem[all[i][2]]=p;
							 p+=1;
							 }else {
								 mem[all[i][2]]=p;
								 mem[all[i-1][2]]=p+1+cor;
								 p+=1+cor;
								 cor=0;
							 }	 
			 }else {
				 mem[all[i][2]] = p;
				 mem[all[i-1][2]] = p;
				 cor +=1;
			 }
			 }
			 }
			 }
			 if(cor == 0) {
				 mem[all[0][2]] = p;
			 }
			 for(int i : mem )System.out.print (i+" ");
		  return mem;
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
//0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81
//60 73 10 43 42 3 66 6 24 1 81 79 51 17 36 57 41 2 38 19 74 34 12 56 16 26 18 44 58 29 72 11 15 67 40 69 28 80 46 37 59 4 49 52 78 47 65 13 48 33 82 61 77 