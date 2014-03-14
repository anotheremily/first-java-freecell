/**
 * @author zyoung
 * A free cell game
 */
public class FreeCellGame {
	
	private static Table t;
	
	/**
	 * Initiates the game
	 * @param args
	 */
	public static void main(String[] args) {
		loadTable();
		return;
	}
	
	/**
	 * Loads the card table
	 *
	 */
	private static void loadTable() {
		t = new Table( "Free Cell" );
		t.setVisible( true );
	}
	
	
}