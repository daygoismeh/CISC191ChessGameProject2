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
 * Version/date: v.2 5/22/2023
 * 
 * Responsibilities of class: Hold methods that will be used to eliminate chess pieces from the game
 */
public interface Eliminable
{
	/**
	 * Eliminates a chess piece
	 */
	public void eliminated();
}
