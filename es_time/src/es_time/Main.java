package es_time;

public class Main {

	public static void main(String[] args) {
		ItalianDateAndTime d1 = new ItalianDateAndTime(17, 48, 30, 24, 10, 2024);
		ItalianDate d2 = new ItalianDate(24, 10, 2024);
		ItalianDate d3 = new ItalianDate(24, 10, 2024);
		ItalianDateAndTime d4 = new ItalianDateAndTime(18, 48, 30, 24, 10, 2024);
		ItalianDateAndTime d5 = new ItalianDateAndTime(18, 48, 30, 24, 10, 2024);
		AustralianDateAndTime  d6 = new AustralianDateAndTime(18, 48, 30, 24, 10, 2024);
		AmericanDateAndTime d7 = new AmericanDateAndTime(18, 48, 30, 24, 10, 2024);
		System.out.println(d1.equals(d2));
		System.out.println(d2.equals(d1));
		System.out.println(d1.equals(d4));
		System.out.println(d2.equals(d3));
		System.out.println(d4.equals(d5));
		System.out.println(d5.equals(d7));
		System.out.println(d6.equals(d7));
	}
}

