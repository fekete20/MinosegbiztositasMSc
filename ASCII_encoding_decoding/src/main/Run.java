package main;

import java.util.ArrayList;
import java.util.Scanner;

/* Készítsünk kódoló és dekódoló függvényt az alábbiak szerint: A kód felépítése: az elsõ karakternek a kódja a karakter ASCII értéke. A következõ
 *  számok kódja az elõzõ karakter ASCII kódjától való eltérés, pl.: A + 2 --> C, vagy z - 1 --> y
 */

public class Run {
	public static void main(String[] args) {

		// változók deklarálása
		String input;							// a dekódolandó szöveg
		Scanner sc = new Scanner(System.in);	// scanner osztály példányosítása a beolvasáshoz
		Encoding encoding = new Encoding();		// enkódoló osztály példányosítása
		Decoding decoding = new Decoding();		// dekódoló osztály példányosítása

		// a dekódolandó szöveg bekérése stdin-rõl és eltárolása, majd a scanner lezárása
		System.out.println("Kérem az inputot: ");
		input = sc.nextLine();
		sc.close();
		
		// a szöveg kódolása
		ArrayList<Integer> encodedText = encoding.encode(input);
		
		// a kódolt szöveg kiírása space-ekkel elválasztva karakterenként
		System.out.println("Kódolt szöveg:");
		for(int i : encodedText) {
			System.out.printf("%d ", i);
		}
		
		// a szöveg dekódolása és a dekódolt szöveg kiírása
		System.out.println("\nDekódolt szöveg: " + decoding.decode(encodedText));
	}
}