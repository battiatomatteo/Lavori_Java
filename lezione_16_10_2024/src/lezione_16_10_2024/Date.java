package lezione_16_10_2024;

import lezione_16_10_2024.Language;

public class Date {
	// campi (field) degli oggetti di classe Date
	// stato di un oggetto Date
	private final int day;
	private final int month;
	private final int year;
	private Language language;

	// da usare solo per campi costanti
	private static String[] months = {
			"gennaio", "febbraio", "marzo", "aprile", "maggio", "giugno",
			"luglio", "agosto", "settembre", "ottobre", "novembre", "dicembre"
	};

	private static String[] americanMonths = {
			"January", "February", "March", "April", "May", "June",
			"July", "August", "September", "October", "November", "December"
	};

	// costruttore
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.language = Language.ITALIAN;
		verify();
	}
	
	public Date(int day, int month) {
		// chiama il primo costruttore con year fissato a 2024
		this(day, month, 2024);
	}

	public Date() {
		this(25, 12);
		//this(25, 12, 2024);
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

	public void setAmerican() {
		this.language = Language.AMERICAN;
	}

	public void setItalian() {
		this.language = Language.ITALIAN;
	}

// metodi
	public String toString() {
		if (language == Language.ITALIAN)
			return day + " " + months[month - 1] + " " + year;
		else
			return americanMonths[month - 1] + " " + day + ", " + year;
	}

	// testa l'uguaglianza semantica tra this e other
	/*public boolean equals(Date other) {
		if (this.day == other.day &&
			this.month == other.month &&
			this.year == other.year)
			return true;
		else
			return false;
	}*/
	public boolean equals(Date other) {
		return day == other.day &&
			month == other.month &&
			year == other.year;
	}
	
	// confronta cronologicamente this con other
	// ritorna < 0 se this viene prima
	// ritorna > 0 se other viene prima
	// ritorna == 0 se this ed other sono semanticamente uguali
	/*public int compareTo(Date other) {
		if (this.year < other.year)
			return -1;
		else if (this.year > other.year)
			return 13;
		else if (this.month < other.month)
			return -2;
		else if (this.month > other.month)
			return 5;
		else if (this.day < other.day)
			return -1;
		else if (this.day > other.day)
			return 1;
		else
			return 0; // sono semanticamente uguali
	}*/

	public int compareTo(Date other) {
		int diff = this.year - other.year;
		if (diff != 0)
			return diff;
		
		diff = this.month - other.month;
		if (diff != 0)
			return diff;

		return this.day - other.day;
	}
	
	public Season getSeason(){
		if (this.compareTo(new Date(21, 3, year)) <0 ) 
			return Season.WINTER;
		else if (this.compareTo(new Date(21, 6, year)) <0 )
			return Season.SPRING;
		else if (this.compareTo(new Date(23, 9, year)) <0 )
			return Season.SUMMER;
		else if (this.compareTo(new Date(21, 12, year)) < 0 )
			return Season.AUTUMN;
		else 
			return Season.WINTER;  //ULTIMI GIORNI DI DICEMBRE
	}
}
