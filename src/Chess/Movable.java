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
 * Responsibilities of class: Holds methods that will be used to move pieces
 */
public interface Movable
{	
	/**
	 * Sets the chess piece to where ever the location is selected
	 * @param row
	 * @param column
	 */
	public void movePieceTo(int row, int column);
}