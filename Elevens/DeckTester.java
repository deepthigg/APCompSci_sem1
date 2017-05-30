/**
 * This is a class that tests the Deck class.
 */
public class DeckTester
 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		public static void main(String[] args) {
		String[] ranks = {"Jacks", "Queen", "King"};
		String[] suits = {"Clubs", "Spades", "Diamonds"};
		int[] values = {11, 12, 13};
	    Deck decka = new Deck(ranks, suits, values);
	    System.out.println("Decka size should be 3: " + decka.size());
	    
	    String[] ranks1 = {"10", "Jack", "King"};
	    String[] suits1 = {"Heart", "Clubs", "Diamonds"};
	    int[] values2 = {10, 12, 13};
	    Deck deckb = new Deck(ranks1, suits2, value2);
	    System.out.println("Deckb should not be empty: " + !deckb.isEmpty());
	    
	    String[] ranks2 = {"4", "8", "King"};
	    String[] suits2 = {"Clubs", "Spades", "Hearts"};
	    int[] values3 = {4, 8, 13};
	    Deck deckc = new Deck(ranks2, suits2, values2);
	    System.out.println("Deckc dealt card is: " + deckb.deal());

	}

}