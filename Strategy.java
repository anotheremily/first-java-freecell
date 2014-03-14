/**
 * @author zyoung
 * Strategy for a free cell game
 */
public class Strategy {
	/**
	 * 
	 *
	 */
	public Strategy() {
		Card curCard = null;
	}
	
	/*
	 * selects a card
	 * @param Card
	 * @return boolean status
	 */
	public boolean selectCard( Card c ) {
		boolean status = false;
		
		if( c != null ) { /*if selected card has a value*/
			if( c == curCard ) { /*if cards are same, deselect cards*/
				curCard = null;
			}
			else if( curCard == null ) { /*if selected card has a value and no curcard*/
				curCard = c;
				status = true;
			}
			else { /*check the move*/ 
				status = checkMove( c );
				if( status = false ) {
					/*eventually print up a little popup*/
					System.out.println( "Invalid move!\n" );
				}
			}
		}
		return status;
	}
		
	/*
	 * checks a move in the game returns if valid or not
	 * 
	 */
	public boolean checkMove( Card c ) {
		boolean validMove = false;
		return validMove;
	}
	
	Card curCard;
}