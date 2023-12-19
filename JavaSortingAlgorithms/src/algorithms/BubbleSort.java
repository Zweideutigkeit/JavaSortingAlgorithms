package algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
	static boolean konsistent = true;

	public static void run(int[] a) {
		
		int i = 0; // starte bei erstem Paar
		
		while (i + 1 < a.length) { // +1: benötige ein Paar
			if (a[i] <= a[i + 1]) { // richtig sortiert
				i++; // weiter mit nächstem
			} else { // falsch sortiert
				int tmp = a[i]; // vertausche
				a[i] = a[i + 1]; // Element a[i]
				a[i + 1] = tmp; // gegen a[i + 1]
				if (i > 0) // nicht bei erstem Paar?
					i--; // weiter mit vorigem
				else
					i++; // weiter mit nächstem
			}
		}
		
		System.out.println(Arrays.toString(a));
		return;
	}
}
