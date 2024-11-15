package lab_08_11_2024;

public abstract class AbstractSoccerPlayer implements SoccerPlayer{

	private final String name;

	protected AbstractSoccerPlayer(String name) {
		this.name = name;
	}

	public final String toString() {
		return name ;
	}
}
