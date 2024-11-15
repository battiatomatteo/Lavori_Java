package es_Date;

public class MainInheritance {

	public static void main(String[] args) {
		ItalianDate d1 = new ItalianDate(17, 10, 2024);
		print(d1);
		
		Date d2 = new ItalianDate(13, 1, 2025);
		print(d2);
		
		AmericanDate d3 = new AmericanDate(17, 10, 2024);
		print(d3);
		
		AustralianDate d4 =  new AustralianDate(17, 10, 2024);
		print(d4);
		
		Date d5 =  new AustralianDate(17, 10, 2024);
		print(d5);
	
	}
	
	public static void print(Date date) {
		System.out.println(date.toString()  + " : " + date.getSeason());
	}
}
