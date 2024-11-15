package es_time;

public class AmericanDateAndTime extends AmericanDate implements Time  {
	private final int hours;
	private final int minutes;
	private final int seconds;

	public AmericanDateAndTime(int hours, int minutes, int seconds,
			int day, int month, int year) {
		
		super(day, month, year);

		this.seconds = seconds;
		this.minutes = minutes;
		this.hours = hours;
	}

	public String toString() {
		return hours + ":" + minutes + ":" + seconds + " " + super.toString();
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}
}
