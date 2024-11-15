package it.univr.figures;

public class Square extends Rectangle {
	
	public Square(Color color, double lato) {
		super(color, lato, lato);
	}
	
	public String toString() {
		return "Square , a " + super.toString();
	}
}
