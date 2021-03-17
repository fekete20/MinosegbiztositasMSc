package main;

import java.util.ArrayList;

public class Decoding {
	
	// dek�dol�s
	public String decode(ArrayList<Integer> encodedText) {
		int sum = 0;					// �sszegz� v�ltoz� a dek�dol�shoz (az ASCII k�d offset-b�l a t�nyleges ASCII k�d kisz�mol�sa)
		char decoded[] = new char[255];	// dek�dolt sz�veg karakterenk�nt
		String decodedText ="";			// dedolt sz�veg egyben (string-k�nt)
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
