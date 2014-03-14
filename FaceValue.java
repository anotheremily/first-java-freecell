/**
 * @author zyoung
 * The face value of a playing card
 */
public class FaceValue {
		
	private String name;
	private Integer value;
	private String abbr;
	private static final String [] faceValueNames = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	private static final String [] faceValueAbbr = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k" };
	
	/**
	 * @param args integer id for the face value of the card
	 * @return none
	 */
	public FaceValue( Integer f ) {
		value = f;
		name = faceValueNames[f];
		abbr = faceValueAbbr[f];
	}
	
	/**
	 * @param args none
	 * @return name of the face value of the card ( eg "one" or "king" )
	 */
	public String getName() { 
		return name;
	}
	
	public String getAbbr() {
		return abbr;
	}

	/**
	 * @param args none
	 * @return integer value of the card
	 */
	public Integer getValue() {
		return value;
	}
}