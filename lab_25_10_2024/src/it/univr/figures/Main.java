package it.univr.figures;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Figure f1 = new Figure(Color.ROSSO);
		//System.out.println(f1);
		
		Figure r1 = new Rectangle(Color.BLU, 10.9, 11.3);
		System.out.println(r1);
		
		Figure c1 = new Circle(Color.VERDE, 10);
		System.out.println("\n" +  c1);
		
		Figure s1 = new Square(Color.GIALLO, 10);
		System.out.println("\n" + s1);
		
		Figure g1 = new GreenDot();
		System.out.println("\n" + g1);
		
		Figure cr1= new Crown(Color.BIANCO, 8.34 , 5.06) ;
		System.out.println("\n" + cr1);
	}
}
