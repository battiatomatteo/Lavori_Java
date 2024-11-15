package lab_08_11_2024;

public class Defence extends AbstractSoccerPlayer {
	
	public Defence(String name) {
		super(name);
	}
	
	public boolean canUseHands() {
		return false;
	}
}
