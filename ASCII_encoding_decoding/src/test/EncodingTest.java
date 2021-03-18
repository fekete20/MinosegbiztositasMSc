package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import main.Encoding;

public class EncodingTest {
	Encoding encoding = new Encoding();
	ArrayList<Integer> encoded = new ArrayList<>();
	
	@Before
	public void init() {
		encoded.add(83);
		encoded.add(39);
		encoded.add(124);
		encoded.add(-128);
		encoded.add(-17);
		encoded.add(2);
	}

	@Test
	public void testEncode() {
		assertEquals(encoded, encoding.encode("Szöveg"));
		assertNotEquals(encoded, encoding.encode("szöveg"));
	}

}
