package it.univr;

// ItalianDate è una Date (grazie ad extends)
// conseguentemente i campi e i metodi di Date
// esistono anche in ItalianDate
public class AmericanDate extends Date {

	public AmericanDate(int day, int month, int year) {
		// chiedi a Date di inizializzare tutto con day, month e year
		super(day, month, year);
	}

	private static String[] americanMonths = {
			"January", "February", "March", "April", "May", "June",
			"July", "August", "September", "October", "November", "December"
	};

	public String toString() {
		return americanMonths[getMonth() - 1] + " " + getDay() + ", " + getYear();
	}
}
