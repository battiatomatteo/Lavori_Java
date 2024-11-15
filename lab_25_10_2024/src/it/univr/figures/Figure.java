package it.univr.figures;

//la classe è dichiarata abstract perché ha almeno un metodo abstract
//e conseguentemente è incompleta: non posso eseguire new Figure(....)
public abstract class Figure {
	
	private final  Color c;  // color
	
	public Figure(Color color) {
		this.c = color;
	}
	
	// abstract indica che il metodo esiste in tutte le Figure
	// ma non abbiamo un'implementazione in questa classe
	public abstract double perimeter();
	
	public abstract double area() ;

	public abstract boolean isConvex();
	
	public String toString() {
		return "area : " + area() + ", perimeter :  " + perimeter()  + " color : " + c;
	}
	
	// metodo accessore protected per il colore.
	protected Color getColor() {
		return c;
	}
}
