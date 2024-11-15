package it.univr.figures;

public class Crown extends Figure{
	
	private double radius;
	private double innerRadius;
	
	public Crown(Color color , double radius, double innerRadius) {
		super(color);
		
		this.radius = radius;
		this.innerRadius = innerRadius;
	}
	
	public double perimeter() {
		return 2 * radius * Math.PI + 2 * innerRadius * Math.PI;  
	}
	
	public double area() {
		return radius * radius * Math.PI - innerRadius * innerRadius * Math.PI;
	}
	
	public boolean isConvex() {
		return innerRadius == 0;
	}
	
	public String toString() {
		return "Crown of radius " + radius +
			" and inner radius " + innerRadius + " " + super.toString();
	}

}
