package es_Date;

import java.util.Arrays;

public class mainDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1;
		d1 = new Date(9, 10, 2024);
		System.out.println("d1 = " + d1.toString());
		Date xmas = new Date(25, 12, 2024);
		//xmas.setAmerican();
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
		System.out.println("d1 è uguale a d2? " + d1.equals(d2));
		System.out.println("xmas è uguale a xmas2? " + xmas.equals(xmas2));
		System.out.println("xmas è uguale a d1? " + xmas.equals(d1));
		System.out.println("d1 viene prima di xmas? " + d1.compareTo(xmas));
		System.out.println("xmas viene prima di d1? " + xmas.compareTo(d1));
		System.out.println("xmas viene prima di xmas? " + xmas.compareTo(xmas));
		System.out.println("la stagione di  " + d1 + " è " + d1.getSeason());
		System.out.println("La stagione di   " + xmas + " è " + xmas.getSeason());
		
		//creazione esplicita per enumerazione degli elementi
		Date[] dates = {
				d1, xmas, d2, d3,d4, xmas2, new Date(13, 1, 2025) 
		};

		//System.out.println(dates);
		System.out.println(Arrays.toString(dates));
		
		//Arrays.sort(dates);  //riodina in modo crescente 
		//Arrays.fill(dates, new Date(20, 1, 2024)); //riempie l'array con il secondo parametro 
		System.out.println(Arrays.toString(dates));
		//Arrays.compare(dates, NULL);
		
		Date[] dates2 = new Date[3];   // creo un array vuoto 
		dates2[1] = d1;
		dates2[0] = d2;
		dates2[2] = new Date(11, 2, 2004);
		
		System.out.println("dates ha dimensione di : " + dates.length);
		
		/*for(int pos = 0 ; pos < dates.length ; pos++ ) {
			System.out.println(dates[pos] + ": " + dates[pos].getSeason());
		}*/
		
		int[] frequencies = new int[Season.values().length];
		
		for(Date date:dates) { //for each
			//System.out.println(date + ": " + date.getSeason());
			frequencies[date.getSeason().ordinal()]++;
		}
		
		System.out.println(Arrays.toString(frequencies));
		
		System.out.println("Finora sono state create : " + Date.count() + " date");
		System.out.println("Primo giorno del 2025: " + Date.firstDay(2025) + " date");
		System.out.println("Ultimo giorno del 2025: " + Date.lastDay(2025) + " date");
	}
}









