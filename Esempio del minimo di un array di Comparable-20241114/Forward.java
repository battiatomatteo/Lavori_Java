package it.univr.soccer;

public class Forward extends AbstractSoccerPlayer {

	public Forward(String name) {
		super(name);
	}

	public boolean canUseHands() {
		return false;
	}
}
