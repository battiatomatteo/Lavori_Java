package it.univr.soccer;

public class MainFormations {

	public static void main(String[] args) {
		// 4 difensori (Alex Sandro, Rugani, Chiellini e Dani Alves)
		// 3 centrocampisti (Fabinho, Iniesta, Pjanic)
		// 3 attaccanti (Dybala, Higuain, Bernardeschi) e un portiere (Szczesny). 
		System.out.println(new Formation433(
				new Defence("Alex Sandro"),
				new Defence("Rugani"),
				new Defence("Chiellini"),
				new Defence("Dani Alves"),
				new Midfield("Fabinho"),
				new Midfield("Iniesta"),
				new Midfield("Pjanic"),
				new Forward("Dybala"),
				new Forward("Higuain"),
				new Forward("Bernardeschi"),
				new Forward("Fausto"),
				new GoalKeeper("Szczesny")));
		
		System.out.println(new Formation433(
				new Defence("Alex Sandro"),
				new Forward("Bernardeschi")));
		
		System.out.println(new Formation433(
				new Defence("Alex Sandro"),
				new Forward("Bernardeschi"),
				new GoalKeeper("Giovanni")));

		System.out.println(new Formation433());
	}
}