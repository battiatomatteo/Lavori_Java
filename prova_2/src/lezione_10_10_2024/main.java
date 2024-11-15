package lezione_10_10_2024;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1;
		d1 = new Date(9, 10, 2024);
		System.out.println("d1 = " + d1.toString());
		Date xmas = new Date(25, 12, 2024);
		xmas.setAmerican();
		System.out.println("xmas = " + xmas.toString());
		System.out.println("d1 = " + d1.toString());
		Date d2 = new Date(9, 10);
		System.out.println("d2 = " + d2);
		Date xmas2 = new Date();
		System.out.println("xmas2 = " + xmas2);
		Date d3 = new Date(29, 2, 2025);
		Date d4 = new Date(-5, 4, 2023);
		System.out.println("d3 = " + d3);
		System.out.println("d4 = " + d4);
	}

}
