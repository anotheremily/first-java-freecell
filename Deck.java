/**
 * @author zyoung
 * A deck of cards
 */

import java.util.*;

public class Deck {
	
	private ArrayList <Card> d;
	
	/**
	 * Constructor for a deck of cards
	 * @param
	 * @return
	 */
	public Deck() {
		d = new ArrayList<Card>();
		buildDeck();
		shuffleDeck();
	}

	/**
	 * Deals a card from the deck
	 * @param
	 * @return Card c
	 */
	public Card dealCard() {
		if( d.size() > 0 ) {
			Card c = d.get( 0 );
			d.remove( 0 );
			return c;
		}
		else {
			return null;
		}
	}
	
	/**
	 * Builds the deck with 52 cards
	 * @param
	 * @return
	 */
	private void buildDeck() {
		for( int lcv1 = 0; lcv1 < 4; lcv1++ ) { /*Fill the deck*/
			for( int lcv2 = 0; lcv2 < 13; lcv2++ ) {
				d.add( new Card( lcv1, lcv2 ) );
			}
		}
		return;
	}
	
	/**
	 * Shuffles the deck
	 * @param
	 * @return
	 */
	private void shuffleDeck() {
		Collections.shuffle( d );
		return;
	}
}