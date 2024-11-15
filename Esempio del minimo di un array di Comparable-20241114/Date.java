package it.univr.dates;

/**
 * Classe per implementare una data del calendario.
 * 
 * @author Fausto Spoto
 */
public class Date implements Comparable<Date> {
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
	
	protected final int getDay() {
		return day;
	}

	protected final int getMonth() {
		return month;
	}

	protected final int getYear() {
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

	public boolean equals(Object other) {
		if (!(other instanceof Date))
			return false;

		// se due date hanno giorno, mese o anno diversi, non sono equals;
		Date otherAsDate = (Date) other;
		if (day != otherAsDate.day || month != otherAsDate.month
				|| year != otherAsDate.year)
			return false;

		// altrimenti, se una data ha anche il tempo e l'altra non ha il tempo,
		// non sono equals;
		boolean thisHasTime = this instanceof Time;
		boolean otherHasTime = other instanceof Time;
		if (thisHasTime != otherHasTime)
			return false;

		// altrimenti, se nessuna delle due date ha il tempo, sono equals;
		if (!thisHasTime && !otherHasTime)
			return true;

		// altrimenti, le due date sono equals se e solo se
		// hanno lo stesso tempo (secondi, minuti e ore uguali)
		Time thisAsIDAT = (Time) this;
		Time otherAsIDAT = (Time) other;

		return thisAsIDAT.getSeconds() == otherAsIDAT.getSeconds() &&
				thisAsIDAT.getMinutes() == otherAsIDAT.getMinutes() &&
				thisAsIDAT.getHours() == otherAsIDAT.getHours();
	}

	public int compareTo(Date other) {
		int diff = this.year - other.year;
		if (diff != 0)
			return diff;
		
		diff = this.month - other.month;
		if (diff != 0)
			return diff;

		diff = this.day - other.day;
		if (diff != 0)
			return diff;

		boolean thisHasTime = this instanceof Time;
		boolean otherHasTime = other instanceof Time;
	
		// nessuna delle due ha informazione di tempo: sono uguali
		if (!thisHasTime && !otherHasTime)
			return 0;

		if (!thisHasTime && otherHasTime)
			return -1; // prima this

		if (thisHasTime && !otherHasTime)
			return 1; // prima other

		// a questo punto vuol dire che entrambe hanno informazione di tempo
		Time thisAsTime = (Time) this;
		Time otherAsTime = (Time) other;
		
		// prima confronto le ore
		diff = thisAsTime.getHours() - otherAsTime.getHours();
		if (diff != 0)
			return diff;

		// poi confronto i minuti
		diff = thisAsTime.getMinutes() - otherAsTime.getMinutes();
		if (diff != 0)
			return diff;

		// infine confronto i secondi
		return thisAsTime.getSeconds() - otherAsTime.getSeconds();
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












