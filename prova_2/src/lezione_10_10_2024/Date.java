package lezione_10_10_2024;

public class Date {

	// campi (field) degli oggetti di classe Date
	// stato di un oggetto Date
	private final int day;
	private final int month;
	private final int year;
	private int language; // 0 = italiano, 1 = americano

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
		this.language = 1;
	}

	public void setItalian() {
		this.language = 0;
	}

// metodi
	public String toString() {
		if (language == 0)
			return day + " " + months[month - 1] + " " + year;
		else
			return americanMonths[month - 1] + " " + day + ", " + year;
	}

}
