package studio7;

public class Die {
	
	private int sides; 
	
	public Die (int n ) { // constructor 
		this.sides = n; 
	}
	
	public double thrown() { 
		return (int)(Math.random() * sides); 
	
	}
	public static void main(String[] args) {
		Die Roll = new Die (4); 
		Roll.thrown();
		System.out.println(Roll.thrown());
		

	}

}
