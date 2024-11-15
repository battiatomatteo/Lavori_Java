package es_Date;

/**
 * Classe per implementare una data del calendario.
 * 
 * @author Fausto Spoto
 */
public class Date {
	private final int day;
	private final int month;
	private final int year;

	// ce n'è uno per tutta la classe
	private static int counter;

	/**
	 * Costruisce una data con i parametri indicati.
	 * 
	 * @param day il giorno
	 * @param month il mese
	 * @param year l'anno
	 */
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		verify();
		counter++;
	}
	
	public Date(int day, int month) {
		// chiama il primo costruttore con year fissato a 2024
		this(day, month, 2024);
	}

	public Date() {
		this(25, 12);
		//this(25, 12, 2024);
	}
	
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	/**
	 * Ritorna il numero di oggetti Date creati
	 * fino a questo momento.
	 * 
	 * @return il numero di oggetti creati
	 */
	public static int count() {
		return counter;
	}

	/**
	 * Ritorna il primo giorno dell'anno indicato.
	 * 
	 * @param year l'anno
	 * @return il primo giorno di year
	 */
	public static Date firstDay(int year) {
		return new Date(1, 1, year);
	}

	public static Date lastDay(int year) {
		return new Date(31, 12, year);
	}

	private void verify() {
		if (month < 1 || month > 12 || day < 1 || day > daysInMonth())
			System.out.println("Data illegale!");
	}

	private static int[] daysInMonth = {
		31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31	
	};

	private int daysInMonth() {
		if (month == 2 && isLeapYear())
			return 29;
		else
			return daysInMonth[month - 1];
	}

	private boolean isLeapYear() {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	public boolean equals(Date other) {
		return day == other.day &&
			month == other.month &&
			year == other.year;
	}

	public int compareTo(Date other) {
		int diff = this.year - other.year;
		if (diff != 0)
			return diff;
		
		diff = this.month - other.month;
		if (diff != 0)
			return diff;

		return this.day - other.day;
	}

	public Season getSeason() {
		if (this.compareTo(new Date(21, 3, year)) < 0)
			return Season.WINTER;
		else if (this.compareTo(new Date(21, 6, year)) < 0)
			return Season.SPRING;
		else if (this.compareTo(new Date(23, 9, year)) < 0)
			return Season.SUMMER;
		else if (this.compareTo(new Date(21, 12, year)) < 0)
			return Season.AUTUMN;
		else
			return Season.WINTER; // ultimi giorni di dicembre
	}
}












