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
		computeRanks(4, c);
		//computeRanks(4, c);


//первый и второй тесты окей ,третий провалился на сортировке 
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
					 if(p+i > all.length-1) {
						 break;
					 }
					 }else {
						 fin2.add(all[i+p]);
						 p++;

					 }
					 if(p+i > all.length) {
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
					 p = 1;

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
			
			 for(int i = 0 ; i < all.length-1;i++) {
				 while(all[i][0] == all[i+p][0]) {
					 if( p == 1 ) {
					 fin2.add(all[i]);						
					 fin2.add(all[i+p]);
					 p++;
					 if(p+i > all.length-1) {
						 break;
					 }
					 }else {
						 fin2.add(all[i+p]);
						 p++;

					 }
					 if(p+i > all.length) {
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
					 p = 1;

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
					 mem[all[i-1][2]]=p+1;
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
						 mem[all[i-1][2]]=p+1;
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
							 mem[all[i-1][2]]=p+1;
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
