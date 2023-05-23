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
//Queen IS-A ChessPiece
public class Queen extends ChessPiece
{

	public Queen(int row, int column, boolean isWhite, String pieceName, LinkedList<ChessPiece> piece)
	{
		super(row, column, isWhite, pieceName, piece);
	}

	@Override
	public void movePieceTo(int row, int column)
	{
		for (ChessPiece piece : getPiece())
		{
			if (piece.getRow() == row && piece.getColumn() == column)
			{
				piece.eliminated();
			}
		}
		
		setRow(row);
		setColumn(column);
	}

	@Override
	public void eliminated()
	{
		getPiece().remove(this);
	}

}
