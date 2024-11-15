package it.univr;

import it.univr.dates.AmericanDate;
import it.univr.dates.AustralianDateAndTime;
import it.univr.dates.Date;
import it.univr.dates.ItalianDate;

public class Main2 {

	public static void main(String[] args) {
		String[] arr1 = { "come va?", "ciao", "bella", "giornata" };
		Date[] arr2 = { new ItalianDate(13, 11, 2024), new AmericanDate(14, 12, 2025),
				new AustralianDateAndTime(12, 20, 45, 31, 12, 2024) };

		String m1 = min(arr1);
		Date d1 = min(arr2);
		System.out.println(m1);
		System.out.println(d1);
	}

	private static <T extends Comparable<T>> T min(T[] array) {
		T result = array[0];
		for (int pos = 1; pos < array.length; pos++)
			if (array[pos].compareTo(result) < 0)
				result = array[pos];

		return result;
	}
}
