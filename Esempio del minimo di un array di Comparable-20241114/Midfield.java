package it.univr.soccer;

public class Midfield extends AbstractSoccerPlayer {

	public Midfield(String name) {
		super(name);
	}

	public boolean canUseHands() {
		return false;
	}

}
