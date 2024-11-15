package it.univr.soccer;

public class Formation433 extends Formation {

	public Formation433(SoccerPlayer... players) { // 0 o più SoccerPlayer
		super(players);
	}

	protected boolean isValid() {
		// comportati come nella superclasse e in più
		// controlla che ci siano 4-3-3
		return super.isValid()
			&& countDefences() == 4 && countMidfields() == 3
				&& countForwards() == 3;
	}
	
	private int countDefences() {
		int counter = 0;
		for (SoccerPlayer player: getPlayers())
			if (player instanceof Defence)
				counter++;

		return counter;
	}


	private int countForwards() {
		int counter = 0;
		for (SoccerPlayer player: getPlayers())
			if (player instanceof Forward)
				counter++;

		return counter;
	}

	private int countMidfields() {
		int counter = 0;
		for (SoccerPlayer player: getPlayers())
			if (player instanceof Midfield)
				counter++;

		return counter;
	}
}
