package it.univr.figures;

public class Rectangle extends Figure{
	
	private final double base;
	private final  double altezza;
	
	public Rectangle (Color color , double base , double altezza) {
		super(color);
		
		this.base = base;
		this.altezza = altezza;
	}
	
	public double perimeter() {
		return 2*(base + altezza);
	}
	
	public double area() {
		return base * altezza;
	}

	public boolean isConvex() {
		return true;
	}
	
	public String toString() {
		return "Rectangle of " + super.toString() ;
	}
}
