package it.univr.soccer;

public class GoalKeeper extends AbstractSoccerPlayer {

	public GoalKeeper(String name) {
		super(name);
	}

	public boolean canUseHands() {
		return true;
	}

}
