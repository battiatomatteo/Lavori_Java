package it.univr;

import it.univr.dates.Date;
import it.univr.soccer.SoccerPlayer;

// coppia SoccerPlayer, Date
public class Pair2 {
	private final SoccerPlayer first;
	private final Date second;

	public Pair2(SoccerPlayer first, Date second) {
		this.first = first;
		this.second = second;
	}

	public SoccerPlayer getFirst() {
		return first;
	}

	public Date getSecond() {
		return second;
	}
}
