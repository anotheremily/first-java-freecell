/**
 * @author zyoung
 * A table for the cards in a card game
 */

import java.awt.*;
import javax.swing.*;

public class Table extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Deck d = new Deck();
	
	//MediaTracker tracker;
	
	/* Card Panels */
	private CardPanel [] p = new CardPanel[8];
	private CardPanel [] tL = new CardPanel[4];
	private CardPanel [] tR = new CardPanel[4];
	
	public Strategy s = new Strategy();
		
	/* we don't need this if we are going to pack the frame
	private static final Integer xSize = 600;
	private static final Integer ySize = 400;
	*/
	
	/**
	 * 
	 * @param gameName
	 */
	public Table( String gameName ) {
		
		if( !loadImages() ) {
			System.out.println( "Could not load images..." );
		}
		setTitle( gameName + " version 0.1" );
		/*setSize( xSize, ySize );*/
		setLayout( new GridLayout( 2,8 ) );
		
		loadPanes();
		
		pack();
		return;
	}
	
	/**
	 * 
	 * Preloads the images
	 */
	private boolean loadImages() {
		return true;
	}
	
	/**
	 * 
	 * Loads the card panes
	 */
	private void loadPanes() {
		Integer lcv;
		
		for( lcv = 0; lcv < 4; lcv++ ) { // initialize the top left panel (temp storage)
			tL[lcv] = new CardPanel( 1 );
			getContentPane().add( tL[lcv ] );
		}
		
		for( lcv = 0; lcv < 4; lcv++ ) { // initialize the top right panel (result area)
			tR[lcv] = new CardPanel( 1 );
			getContentPane().add( tR[lcv ] );
		}
		
		for( lcv = 0; lcv < 4; lcv++ ) { // initializes the bottom panel (playing area)
			p[lcv] = new CardPanel( 7 );
			for( int lcv1 = 0; lcv1 < 7; lcv1++ )
				p[lcv].addCard( d.dealCard() );
			getContentPane().add( p[lcv] );
		}
		
		for( lcv = 4; lcv < 8; lcv++ ) { // initializes the bottom panel (playing area)
			p[lcv] = new CardPanel( 6 );
			for( int lcv1 = 0; lcv1 < 6; lcv1++ )
				p[lcv].addCard( d.dealCard() );
			getContentPane().add( p[lcv] );
		}
		return;
	}
}