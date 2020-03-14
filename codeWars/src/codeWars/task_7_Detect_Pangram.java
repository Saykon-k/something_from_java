package codeWars;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class task_7_Detect_Pangram {

	public static void main(String[] args)
    {
     check("saD , ");
          
               
    }
	public static boolean check(String sentence){
		 
         String[] list = IntStream.concat(
                 IntStream.rangeClosed('0', '9'),
                 IntStream.rangeClosed('a', 'z')
         ).mapToObj(c -> (char) c+",").collect(Collectors.joining()).split(",");
         
         boolean res = true;
         sentence = sentence.toLowerCase();
         sentence = sentence.replace(" ", "");
         sentence  = sentence.replace(",","");
         sentence = sentence.replace(".", "");
         for (int i = 0 ; i < 9; i++)  sentence = sentence.replace(Integer.toString(i) ,"");
         
         for(int i = 10 ; i < 36 ;i++)  {
        	 if(sentence.indexOf(list[i].charAt(0)) != -1 ) {
        	 }else {
        		 res = false;
        		 break;
        		 
        	 }
         }
		return res;
		}
	public boolean check_2(String sentence){
        String x = sentence.toLowerCase();
        if(x.contains("a") && x.contains("b") && x.contains("c") && x.contains("d")
                && x.contains("e") && x.contains("f") && x.contains("g")
                && x.contains("h") && x.contains("i") && x.contains("j")
                && x.contains("k") && x.contains("l") && x.contains("m")
                && x.contains("n") && x.contains("o") && x.contains("p")
                && x.contains("q") && x.contains("r") && x.contains("s")
                && x.contains("t") && x.contains("u") && x.contains("v")
                && x.contains("w") && x.contains("x") && x.contains("y")
                && x.contains("z")){
            return true;
        }else{
            return false;
        }
}
}