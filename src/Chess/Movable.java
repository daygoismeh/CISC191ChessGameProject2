package Chess;

/**
 * Lead Author(s):
 * @author Diego Morales
 * @author Tien Nguyen
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *  
 * Version/date: v.1 5/14/2023
 * 
 * Responsibilities of class: 
 */
public interface Movable
{
	/**
	 * Gets the piece from the location it stands on the board
	 * (Expirimental method...not 100% sure it'll stay)
	 * @param row
	 * @param column
	 */
	public void pieceFrom(int row, int column);
	
	/**
	 * Sets the chess piece to where ever the location is selected
	 * @param row
	 * @param column
	 */
	public void pieceTo(int row, int column);
}