/**
 * This is a class that tests the Card class.
 */
public class CardTester 
{

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Diamond", "4", 4);
		Card card2 = new Card("Diamond", "4", 4);
		Card card3 = new Card("Diamond", "Queen", 12);
		
		System.out.println(card3.toString());
		
		System.out.println("1 and 2 match: " + card2.matches(card1));
		System.out.println("2 and 3 no match: " + !card2.matches(card3));
	}

}