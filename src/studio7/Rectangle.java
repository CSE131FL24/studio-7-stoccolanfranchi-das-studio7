package studio7;

public class Rectangle {
	
	private double length; // instance variables 
	private double width; 
	
	public Rectangle (double inputlength, double inputwidth) { //constructor 
		this.length = inputlength; 
		this.width = inputwidth;
	}
	
	public double area() { //method
		return length * width;
	}

	public static void main(String[] args) {
		Rectangle Susie = new Rectangle (2.0, 3.0); 
		System.out.println (Susie.area()); 
		

	}

}
