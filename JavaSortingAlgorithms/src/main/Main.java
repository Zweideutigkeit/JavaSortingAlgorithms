package main;

import java.util.Arrays;
import java.util.Random;
import algorithms.*;

/*
 * The Main Program is using the InputTools from S.Frenz to ask the User about the length his to-be-sorted Array needs to be
 * It then starts the timer and the respective algorithms in the algorithm package 
 */
public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = 0;
		n = 50; //How big should the List be?
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			int randnr = rand.nextInt(99999);
			arr[i] = randnr;
			randnr += 1;
			
			if (i == 214748347) {
				System.out.println("Zahl zu groß, Array beendet!");
				return;
			}
		}
		System.out.println(Arrays.toString(arr));

		
		long x = System.currentTimeMillis();
		BubbleSort.run(arr);
		long y = System.currentTimeMillis();
		System.out.println((long)y - x);
		
		//x = System.currentTimeMillis();
		//QuickSort.run(arr);
	}

}
