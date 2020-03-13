package codeWars;

import java.util.Scanner;

public class help {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name = scn.nextLine();
		System.out.println("_"+name.replace(" ", "_"));
	}

}
