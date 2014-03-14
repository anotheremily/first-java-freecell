/**
 * @author zyoung
 * The suit of a card
 */
public class Suit {
	
	private String name;
	private String abbr;
	
	private static final String [] suitNames = { "Spades", "Diamonds", "Clubs", "Hearts" };
	private static final String [] suitAbbr = { "s", "d", "c", "h" };
	/**
	 * Holds the suit of a card
	 * 
	 *  functions
	 *  String getName() - returns suit name
	 **/
	
	/**
	 * Constructor for suit of cards
	 * @param Integer
	 * @return
	 */
	public Suit( Integer s ) {
		name = suitNames[ s ];
		abbr = suitAbbr[ s ];
	}
	
	/**
	 * Returns the name of the suit of the card
	 * @param
	 * @return String name
	 */
	public String getName() { 
		return name;
	}
	
	public String getAbbr() {
		return abbr;
	}
}