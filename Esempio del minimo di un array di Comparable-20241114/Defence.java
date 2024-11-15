package it.univr.soccer;

public class Defence extends AbstractSoccerPlayer {

	public Defence(String name) {
		super(name);
	}

	public boolean canUseHands() {
		return false;
	}

}
