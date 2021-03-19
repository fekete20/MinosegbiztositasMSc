package main;

public class PasswordVerification {
	// Task: https://osherove.com/tdd-kata-3
	
	public boolean lengthValidator(String password) {
		if((password == null) || !(password.length() > 8)) {
			throw new IllegalArgumentException("A jelsz�nak 8 karaktern�l hosszabbnak kell lenni.");
		} else return true;
	}
	
	public boolean nullValidator(String password) {
		if(password == null) {
			throw new IllegalArgumentException("A jelsz� nem lehet �res.");
		} else return true;
	}
	
	public boolean upperCaseValidator(String password) {
		if(password != null && password.matches(".*[A-Z].*")) {
			return true;
		} else throw new IllegalArgumentException("A jelsz�nak tartalmaznia kell nagybet�t.");
	}
	
	public boolean lowerCaseValidator(String password) {
		if(password != null && password.matches(".*[a-z].*")) {
			return true;
		} else throw new IllegalArgumentException("A jelsz�nak tartalmaznia kell kisbet�t.");
	}
	
	public boolean numberValidator(String password) {
		if(password != null && password.matches(".*[0-9].*")) {
			return true;
		} else throw new IllegalArgumentException("A jelsz�nak tartalmaznia kell sz�mjegyet.");
	}
	
	//Add feature: Password is OK if at least three of the previous conditions is true
	public boolean threeConditions(String password) {
		int counter = 0;
		
		try {
			lengthValidator(password);
			counter++;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		try {
			nullValidator(password);
			counter++;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		try {
			upperCaseValidator(password);
			counter++;
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		}

		try {
			lowerCaseValidator(password);
			counter++;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		try {
			numberValidator(password);
			counter++;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		if(counter < 3) {
			return false;
		} else return true;
	}
	
	//Add feature: password is never OK if item 1.4 is not true.
	public boolean threeConditionsAndLowerCase(String password) {
		int counter = 0;
		
		try {
			lengthValidator(password);
			counter++;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		try {
			nullValidator(password);
			counter++;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		try {
			upperCaseValidator(password);
			counter++;
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		}

		try {
			lowerCaseValidator(password);
			counter++;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return false;
		}

		try {
			numberValidator(password);
			counter++;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		if(counter < 3) {
			return false;
		} else return true;
	}
}
