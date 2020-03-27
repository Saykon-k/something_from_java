package codeWars;
import java.io.*;
import java.util.Scanner; 
public class help {
	 
    public static void main(String[] args) throws IOException {
	
    	File file = new File("C:\\Users\\lenov\\git\\repository2\\codeWars\\src\\codeWars\\number.txt"); 
    	  BufferedReader br = new BufferedReader(new FileReader(file)); 
    	  String st;
    	  String num = null;
    	  while ((st = br.readLine()) != null) 
    	    num = st;
    	  Scanner scn = new Scanner(System.in);
    	  System.out.println("task_"+ num+"_"+scn.nextLine().replace(" ", "_").replace(",", "_" ).replace("-", "_"));
    	  BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\lenov\\git\\repository2\\codeWars\\src\\codeWars\\number.txt"));
    	  writer.write(Integer.toString((Integer.parseInt(num)+1)));
    	  writer.close();
   }
    

}