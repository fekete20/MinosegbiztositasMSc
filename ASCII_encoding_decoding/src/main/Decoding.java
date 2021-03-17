package main;

import java.util.ArrayList;

public class Decoding {
	
	// dekódolás
	public String decode(ArrayList<Integer> encodedText) {
		int sum = 0;					// összegzõ változó a dekódoláshoz (az ASCII kód offset-bõl a tényleges ASCII kód kiszámolása)
		char decoded[] = new char[255];	// dekódolt szöveg karakterenként
		String decodedText ="";			// dedolt szöveg egyben (string-ként)
		for (int i = 0; i < encodedText.size(); i++) {
			sum = 0;
			if (i == 0) {
				 decoded[i] = (char) (Integer.parseInt(encodedText.get(i).toString()));
			} else {
				for (int j = 0; j <= i; j++) {
					sum += encodedText.get(j);
				}
				decoded[i] = (char) (sum);
			}
		}
		
		for (char c : decoded) {
			decodedText += c;
		}
		return decodedText.trim();
	}
}
