package it.univr.figures;

public class Circle extends Figure{
	
	private final double raggio;
	
	public Circle(Color color, double raggio) {
		super(color);
		this.raggio = raggio;
	}
	
	public double perimeter() {
		return 2* raggio * Math.PI;
	}
	
	public double area() {
		return raggio * raggio * Math.PI ;
	}
	
	public boolean isConvex() {
		return true;
	}
	
	public String toString() {
		return "Circle of " + super.toString();
	}
	
}
