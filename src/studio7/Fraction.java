package studio7;

public class Fraction {
	
	private int numerator; 
	private int denominator;
	
	public Fraction (int inputnumerator, int inputdenominator) { 
		this.numerator = inputnumerator; 
		this.denominator = inputdenominator; 
	}
	
	public Fraction multiply(Fraction otherFraction) { 
		return new Fraction(numerator*otherFraction.getNumerator(), denominator*otherFraction.getDenominator()); 
	}
	
	public int getNumerator() { 
		return numerator; 
	}
	
	public int getDenominator() { 
		return denominator; 
	}
	public String toString() { 
		return numerator + "/" + denominator; 
	}
	public static void main(String[] args) {
		Fraction addition = new Fraction (4,2); 
		Fraction addition1 = new Fraction (4,2);  
		System.out.println(addition.multiply(addition1));
		

	}

}
