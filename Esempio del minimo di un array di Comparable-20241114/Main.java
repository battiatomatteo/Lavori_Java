package it.univr;

import it.univr.dates.Date;
import it.univr.dates.ItalianDate;
import it.univr.soccer.Defence;
import it.univr.soccer.GoalKeeper;
import it.univr.soccer.SoccerPlayer;

public class Main {

	public static void main(String[] args) {
		
		// classe Integer --> contiene un intero int 
		
		Pair<String, Integer > p1 = new Pair<String, Integer>
			("bravissimo", new Integer(42));
		String s1 = p1.getFirst();
		SoccerPlayer sp1 = p1.getSecond();
		
		Pair<SoccerPlayer, Date> p2 = new Pair<SoccerPlayer, Date>
			(new GoalKeeper("Roberto"), new ItalianDate(13, 11, 2024));
		SoccerPlayer sp2 = p2.getFirst();
		Date d2 = p2.getSecond();
		
		// codice legacy
		Pair3 p3 = new Pair3("bravissimo", new Defence("Gianni"));
		String s3 = (String) p3.getFirst();
		SoccerPlayer sp3 = (SoccerPlayer) p3.getSecond();
	}

}
