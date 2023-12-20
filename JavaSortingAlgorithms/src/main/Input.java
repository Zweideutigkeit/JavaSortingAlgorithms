package main;

import java.util.Scanner;

public class Input {
	
	private static Scanner s;
		
	private static void init() {
		s = new Scanner(System.in);
		
	}
	
	public static int readInt(String text) {
		System.out.println(text);
		init();
		return s.nextInt();
	}

}
