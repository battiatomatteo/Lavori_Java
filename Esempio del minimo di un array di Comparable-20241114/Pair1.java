package it.univr;

import it.univr.soccer.SoccerPlayer;

// coppia String, SoccerPlayer
public class Pair1 {
	private final String first;
	private final SoccerPlayer second;

	public Pair1(String first, SoccerPlayer second) {
		this.first = first;
		this.second = second;
	}

	public String getFirst() {
		return first;
	}

	public SoccerPlayer getSecond() {
		return second;
	}
}
