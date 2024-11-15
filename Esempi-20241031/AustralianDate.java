package it.univr;

// ItalianDate è una Date (grazie ad extends)
// conseguentemente i campi e i metodi di Date
// esistono anche in ItalianDate
public class AustralianDate extends Date {

	public AustralianDate(int day, int month, int year) {
		// chiedi a Date di inizializzare tutto con day, month e year
		super(day, month, year);
	}

	private static String[] australianMonths = {
			"January", "February", "March", "April", "May", "June",
			"July", "August", "September", "October", "November", "December"
	};

	public String toString() {
		return australianMonths[getMonth() - 1] + " " + getDay() + ", " + getYear();
	}
	
	public Season getSeason() {
		if (this.compareTo(new Date(1, 3, getYear())) < 0)
			return Season.SUMMER;
		else if (this.compareTo(new Date(1, 6, getYear())) < 0)
			return Season.AUTUMN;
		else if (this.compareTo(new Date(1, 9, getYear())) < 0)
			return Season.WINTER;
		else if (this.compareTo(new Date(1, 12, getYear())) < 0)
			return Season.SPRING;
		else
			return Season.SUMMER;
	}
}
