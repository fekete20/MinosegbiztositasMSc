package main;

import java.util.ArrayList;
import java.util.Scanner;

/* K�sz�ts�nk k�dol� �s dek�dol� f�ggv�nyt az al�bbiak szerint: A k�d fel�p�t�se: az els� karakternek a k�dja a karakter ASCII �rt�ke. A k�vetkez�
 *  sz�mok k�dja az el�z� karakter ASCII k�dj�t�l val� elt�r�s, pl.: A + 2 --> C, vagy z - 1 --> y
 */

public class Run {
	public static void main(String[] args) {

		// v�ltoz�k deklar�l�sa
		String input;							// a dek�doland� sz�veg
		Scanner sc = new Scanner(System.in);	// scanner oszt�ly p�ld�nyos�t�sa a beolvas�shoz
		Encoding encoding = new Encoding();		// enk�dol� oszt�ly p�ld�nyos�t�sa
		Decoding decoding = new Decoding();		// dek�dol� oszt�ly p�ld�nyos�t�sa

		// a dek�doland� sz�veg bek�r�se stdin-r�l �s elt�rol�sa, majd a scanner lez�r�sa
		System.out.println("K�rem az inputot: ");
		input = sc.nextLine();
		sc.close();
		
		// a sz�veg k�dol�sa
		ArrayList<Integer> encodedText = encoding.encode(input);
		
		// a k�dolt sz�veg ki�r�sa space-ekkel elv�lasztva karakterenk�nt
		System.out.println("K�dolt sz�veg:");
		for(int i : encodedText) {
			System.out.printf("%d ", i);
		}
		
		// a sz�veg dek�dol�sa �s a dek�dolt sz�veg ki�r�sa
		System.out.println("\nDek�dolt sz�veg: " + decoding.decode(encodedText));
	}
}