package main;

import java.util.ArrayList;

public class Encoding {
	private ArrayList<Character> characters = new ArrayList<>(); 	// a szöveg karakterekre bontva
	private ArrayList<Integer> ascii = new ArrayList<>(); ; 		// a szöveg egyes karaktereinek ASCII kódja
	private ArrayList<Integer> ascii_offset = new ArrayList<>(); ; 	// a szöveg egyes karaktereinek az elõzõ karakter ASCII kódjától való eltérése
	
	// a szöveg karakterekre bontása, a karakterek ASCII kódjainak eltárolása, majd az elõzõ karakter ASCII kódjától való eltérés számítása, tárolása
	public ArrayList<Integer> encode(String text) {	
		for (int i = 0; i < text.length(); i++) {
			characters.add(text.charAt(i));
			ascii.add((int) characters.get(i));
			if (i == 0) {
				ascii_offset.add(ascii.get(i));
			} else {
				ascii_offset.add(ascii.get(i) - ascii.get(i -1));			
				}
		}
		return ascii_offset;
	}
}
