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
//Knight IS-A ChessPiece
public class Knight extends ChessPiece
{
	/**
	 * Constructor, sets the input parameters to the super class instances fields
	 * @param row
	 * @param column
	 * @param isWhitePiece
	 */
	public Knight(int row, int column, boolean isWhitePiece)
	{
		super(row, column, isWhitePiece);
	}

	@Override //from the ChessPiece class
	public boolean isValidMove(int toRow, int toColumn)
	{
		return false;
	}
	
	//Still working on class

}
