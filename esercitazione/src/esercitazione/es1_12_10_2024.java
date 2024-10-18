package esercitazione;
public class es1_12_10_2024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* @param valore carta ammissibile : 2 3 4 5 6 7 8 9 10 J Q K 1.
		* @param numero tra 0 e 12 ed un tipo : suit (spades (♠), clubs (♣), diamonds (♦) e hearts (♥)).
		*/
		
		// main -> collegato al file Card.java
		
		
		Card card1 = new Card();
		Card card2;
		
		do {
			card2 = new Card();
			System.out.println(card1 + " vs " + card2);
		}while(!card1.equals(card2));

	}
}
