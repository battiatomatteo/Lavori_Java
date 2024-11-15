package lab_08_11_2024;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AbstractSoccerPlayer p1 = new AbstractSoccerPlayer("Mario");
		SoccerPlayer[] players = {
				new Defence("Bremer"),
				new Defence("Cambiaso"),
				new Defence("Chiellini"),
				new Defence("Dani Alves"),
				new Midfield("Iniesta"),
				new Midfield("Xavi"),
				new Midfield("Pjanic"),
				new Forward("Dybala"),
				new Forward("Higuain"),
				new Forward("Ronaldo"),
				new GoalKeeper("Szczesny")
		};

		System.out.println(new Formation433(players));
		
	}

}
