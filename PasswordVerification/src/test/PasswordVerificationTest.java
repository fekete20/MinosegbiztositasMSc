package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import main.PasswordVerification;

class PasswordVerificationTest {
	PasswordVerification pw = new PasswordVerification();
	
	@Test
	void testLengthValidator() {
		try {
			assertTrue(pw.lengthValidator("asdasdasd"));
			pw.lengthValidator("asdasdas");
			fail("Kivételt kellett volna dobni.");
		} catch(IllegalArgumentException e) {
			
		}	
	}

	@Test
	void testNullValidator() {
		try {
			assertTrue(pw.nullValidator(""));
			pw.nullValidator(null);
			fail("Kivételt kellett volna dobni.");
		} catch(IllegalArgumentException e) {
			
		}	
	}

	@Test
	void testUpperCaseValidator() {
		try {
			assertTrue(pw.upperCaseValidator("asdasdAsd"));
			pw.upperCaseValidator("asdasdasd");
			fail("Kivételt kellett volna dobni.");
		} catch(IllegalArgumentException e) {
		
		}	
	}

	@Test
	void testLowerCaseValidator() {
		try {
			assertTrue(pw.lowerCaseValidator("ASDASdASD"));
			pw.lowerCaseValidator("ASDASDASD");
			fail("Kivételt kellett volna dobni.");
		} catch(IllegalArgumentException e) {
			
		}	
	}

	@Test
	void testNumberValidator() {
		try{
			assertTrue(pw.numberValidator("asdAs5asd"));
			pw.numberValidator("asdAsd[asd");
			fail("Kivételt kellett volna dobni.");
		} catch(IllegalArgumentException e) {
			
		}	
	}
	
	@Test
	void testthreeConditions() {
		assertTrue(pw.threeConditions("asdAsÐd5ias"));
		assertFalse(pw.threeConditions("asdsdsd"));
		assertFalse(pw.threeConditions("ASDASDS"));
		assertFalse(pw.threeConditions(null));
	}
	
	@Test
	void testthreeConditionsAndLowerCase() {
		assertTrue(pw.threeConditionsAndLowerCase("asdAsÐd5ias"));
		assertFalse(pw.threeConditionsAndLowerCase("ASDAS540SDFA"));
		assertFalse(pw.threeConditionsAndLowerCase("ASDASDS"));
		assertFalse(pw.threeConditionsAndLowerCase("dssssds"));
		assertFalse(pw.threeConditionsAndLowerCase(null));
	}

}
