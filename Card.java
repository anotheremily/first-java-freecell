/**
 * @author zyoung
 * A playing card
 */

public class Card {

	private FaceValue f;
	private Suit s;

	/**
	 * @param s - Suit of the card
	 * @param f - Face value of the card
	 */
	public Card( Integer s, Integer f ) {
		this.f = new FaceValue( f );
		this.s = new Suit( s );		
	}
	
	/**
	 * @return The name of this card
	 */
	public String getCardName() { 
		return f.getName() + " of " + s.getName();
	}
	
	public String getCardImage() {
		return s.getAbbr() + f.getAbbr() + ".gif";
	}
	

}