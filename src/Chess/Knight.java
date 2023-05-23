package Chess;

import java.util.LinkedList;

/**
 * Lead Author(s):
 * @author Diego Morales
 * @author Tien Nguyen
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *  
 * Version/date: v.1 5/22/2023
 * 
 * Responsibilities of class: Sub-class to the ChessPiece class that will contain its own movements
 */
//Knight IS-A ChessPiece
public class Knight extends ChessPiece
{
	/**
	 * Constructor, sends the input parameters to the super class
	 * @param row
	 * @param column
	 * @param isWhite
	 * @param pieceName
	 * @param piece
	 */
	public Knight(int row, int column, boolean isWhite, String pieceName, LinkedList<ChessPiece> piece)
	{
		super(row, column, isWhite, pieceName, piece);
	}
	
	@Override //from Movable class
	public void movePieceTo(int row, int column)
	{
		//Tries to find every iteration of the linked list
		for (ChessPiece piece : getPiece())
		{
			//When it finds an object, if the object is in the path of the current piece then the object will be eliminated
			if (piece.getRow() == row && piece.getColumn() == column)
			{
				piece.eliminated();
			}
		}
		
		//Sets the new location for the moved piece
		setRow(row);
		setColumn(column);
	}

	@Override //from Eliminable class
	public void eliminated()
	{
		//removes the current chess piece
		getPiece().remove(this);
	}
}
