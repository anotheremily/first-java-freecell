/**
 * @author zyoung
 * A card panel
 */

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.*;

public class CardPanel extends JPanel implements MouseListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private JButton topCard; 
	private ArrayList <Card> cards;
	private int capacity;
	private Image topCard;
	
	/**
	 * 
	 * @param c - int - capacity of the card panel
	 */
	public CardPanel( int c ) {
		cards = new ArrayList<Card>();
		//topCard = new Image(); //new JButton( "-empty-" );
		//add( topCard );
		
		capacity = c;
	}
	
	/**
	 * Adds a card to this panel
	 * @param c - the card to be added to this panel
	 */
	public void addCard( Card c ) {
		if( c != null ) {
			cards.add( c );
			//System.out.println( cards.get( cards.size()-1 ).getCardName() );
			//topCard.setText( cards.get( cards.size()-1 ).getCardName() );
			// topCard = getImage( cards.get( cards.size()-1 ).getCardImage() );
			repaint();
		}
	}
	
	/**
	 * 
	 * @return top card on the panel
	 */
	public Card getCard() {
		Card c;
		if( !cards.isEmpty() ) {
			c = cards.get( 0 );
			cards.remove( 0 );
			return c;
		}
		else {
			c = new Card( 0, 0 ); // create a blank card if there are none
			return c;
		}
	}
	
	public void mouseClicked(MouseEvent arg0) {
		Card c = getCard();
		/*if( selectCard( c ) ) {
			System.out.println( "Card selected successfully" );
		}
		else {
			addCard( c );
		}*/
	}

	/*don't need these, so they are empty*/
	public void mousePressed(MouseEvent arg0) {
	}

	public void mouseReleased(MouseEvent arg0) {
	}

	public void mouseEntered(MouseEvent arg0) {
	}

	public void mouseExited(MouseEvent arg0) {
	}
}
