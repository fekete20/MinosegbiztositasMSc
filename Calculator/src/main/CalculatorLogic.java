package main;

public class CalculatorLogic {
	
	public double add(double a, double b) {
		return a + b;
	}
	
	public double subtract(double a, double b) {
		return a - b;
	}
	
	public double multiply(double a, double b) {
		return a * b;
	}
	
	public double divide(double a, double b) {
		if(b == 0) {
			throw new IllegalArgumentException("Null�val nem k�ne osztani");
		} else {
			return a / b;
		}
	}

}
