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
//Rook IS-A ChessPiece
public class Rook extends ChessPiece
{
	/**
	 * Constructor, sets some variables from the input parameter to the super class instance fields
	 * @param row
	 * @param column
	 * @param isWhitePiece
	 */
	public Rook(int row, int column, boolean isWhitePiece)
	{
		super(row, column, isWhitePiece);
	}

	@Override //from ChessPiece class
	public boolean isValidMove(int toRow, int toColumn)
	{
		return false;
	}
	
	//Class is still being worked on

}
