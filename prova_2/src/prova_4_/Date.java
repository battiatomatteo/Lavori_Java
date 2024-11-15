package prova_4_;

public class Date {
	// campi (field) degli oggetti di classe Date
	// stato di un oggetto Date
	private int day;
	private int month;
	private int year;

	// costruttore
	public Date(int day, int month, int year) {
		// this contiene un puntatore all'oggetto che si sta inizializzando
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	// metodi
	public String toString() {
		// this contiene un puntatore al ricevitore del metodo
		return this.day + "/" + this.month + "/" + this.year;
	}
}
