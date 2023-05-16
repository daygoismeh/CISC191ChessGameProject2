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
public interface Eliminable
{
	/**
	 * Eliminates the chess piece if it gets captured
	 * @param row
	 * @param column
	 */
	public void eliminate(int row, int column);
}
