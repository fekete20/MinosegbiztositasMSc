package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import main.Decoding;

public class DecodingTest {
	Decoding decode = new Decoding();
	ArrayList<Integer> testEncodedText = new ArrayList<>();
	
	@Before
	public void init() {
		testEncodedText.add(83);
		testEncodedText.add(39);
		testEncodedText.add(124);
		testEncodedText.add(-128);
		testEncodedText.add(-17);
		testEncodedText.add(2);
	}

	@Test
	public void testDecode() {
		assertEquals(decode.decode(testEncodedText), "Szöveg");
		assertNotEquals(decode.decode(testEncodedText), "szöveg");
	}

}
