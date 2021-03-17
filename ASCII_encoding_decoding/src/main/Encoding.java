package main;

import java.util.ArrayList;

public class Encoding {
	private ArrayList<Character> characters = new ArrayList<>(); 	// a sz�veg karakterekre bontva
	private ArrayList<Integer> ascii = new ArrayList<>(); ; 		// a sz�veg egyes karaktereinek ASCII k�dja
	private ArrayList<Integer> ascii_offset = new ArrayList<>(); ; 	// a sz�veg egyes karaktereinek az el�z� karakter ASCII k�dj�t�l val� elt�r�se
	
	// a sz�veg karakterekre bont�sa, a karakterek ASCII k�djainak elt�rol�sa, majd az el�z� karakter ASCII k�dj�t�l val� elt�r�s sz�m�t�sa, t�rol�sa
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
