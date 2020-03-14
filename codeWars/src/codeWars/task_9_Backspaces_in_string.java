package codeWars;

import java.util.ArrayList;

public class task_9_Backspaces_in_string {

	public static void main(String[] args) {
		System.out.println(cleanString("abc#d##c"));
		System.out.println(cleanString("abc##d######"));
		System.out.println(cleanString("O##pEZ#FH#z#Eaj"));
	}
	 public static String cleanString(String s) {
		 	int kop = 0;
		 	int last_kop = 0;
		 	int kol_qer = 0;
		 	String res ="";
		 	int i_inner = 0;
		 	for(int i = 0 ; i < s.length() ;i++) {
		 		if(!s.substring(i, i+1).equals("#")) {
		 			kop++;
		 		}else {
		 			
		 			while(i < s.length() && s.substring(i, i+1).equals("#") ) {
		 				kol_qer++;
		 				i++;
		 			}
		 			if(kol_qer > kop) {
		 				
		 				if(res.length()-(kol_qer-kop)>=0) {
				 			res = res.substring(0,res.length()-(kol_qer-kop));
				 		}else {
				 			res ="";
				 		}
		 				kop = 0;
		 				kol_qer = 0 ;
		 			}else {
		 				
		 				res += s.substring(last_kop, kop - kol_qer+last_kop);
		 				
		 				kop = 0;
		 				kol_qer = 0;
		 			}
		 			last_kop = i;
		 			i--;
		 		}
		 	}
		 	
		 	if(kol_qer > kop) {
		 		if(res.length()-(kol_qer-kop)>=0) {
		 			res = res.substring(0,res.length()-(kol_qer-kop));
		 		}else {
		 			res ="";
		 		}
 			}else {

 				res +=  s.subSequence(s.length()-kop, s.length());
 			}
		    return res;
		  }
	 
	 
	 
	 static ArrayList<Integer> indexsCharO(String str){
		 	ArrayList<Integer> res = new ArrayList<Integer>();
;		    for(int i=0; i< str.length(); i++){
		        if(str.charAt(i) == '#') res.add(i);
		    }
		    return res;
		}
	 public String cleanString_v2(String p) {
		    char[] s=p.toCharArray();
		    String prev="",a="";
		  for(int i=0;i<s.length;i++){
		    if(s[i]=='#'){
		      if(prev.length()==0) continue;
		    
		    
		    a=prev.substring(0,prev.length()-1);
		    prev=a;
		    } else{
		      prev+=s[i];}}
		      
		          
		    return prev;

		    
		    
		    
		  }

}
