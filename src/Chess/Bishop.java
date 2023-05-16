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
//Bishop IS-A ChessPiece
public class Bishop extends ChessPiece
{
	/**
	 * Constructor, sets the input parameters to the super class instance fields
	 * @param row
	 * @param column
	 * @param isWhitePiece
	 */
	public Bishop(int row, int column, boolean isWhitePiece)
	{
		super(row, column, isWhitePiece);
	}

	@Override //from ChessPiece class
	public boolean isValidMove(int toRow, int toColumn)
	{
		return false;
	}
	
	//Still being worked on

}
