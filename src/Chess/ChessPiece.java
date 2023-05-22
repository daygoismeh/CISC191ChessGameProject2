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
 * Version/date: v.2 5/21/2023
 * 
 * Responsibilities of class: Creates the methods and instance variables for the chess pieces
 */
//ChessPiece IS Movable
public abstract class ChessPiece implements Movable
{
	//ChessPiece HAS-A row and column (int), a color (white or black, boolean), a piece (Linked list), and a piece name
	private int row,
				column;
	private boolean isWhite;
	private LinkedList<ChessPiece> piece;
	private String pieceName;
	
	/**
	 * Constructor, sets the instance variables, and adds the class to the linked list instance variable
	 * @param row
	 * @param column
	 * @param whitePiece
	 */
	public ChessPiece(int row, int column, boolean isWhite, LinkedList<ChessPiece> piece, String pieceName)
	{
		this.row = row;
		this.column = column;
		this.isWhite = isWhite;
		this.piece = piece;
		piece.add(this);
		this.pieceName = pieceName;
	}
	
	/**
	 * Sets the new row value
	 * @param newRow
	 */
	public void setRow(int newRow)
	{
		row = newRow;
	}
	
	/**
	 * Returns the value of the row the piece is currently on
	 * @return row
	 */
	public int getRow()
	{
		return row;
	}
	
	/**
	 * Sets the new value for the column
	 * @param newColumn
	 */
	public void setColumn(int newColumn)
	{
		column = newColumn;
	}
	
	/**
	 * Return the value of the column the piece is currently on
	 * @return column
	 */
	public int getColumn()
	{
		return column;
	}
	
	public void capture()
	{
		piece.remove(this);
	}
	
	public void setPieceName(String newPieceName)
	{
		pieceName = newPieceName;
	}
	
	public String getPieceName()
	{
		return pieceName;
	}
	
//	/**
//	 * Checks if the move that is going to be done is valid for the piece
//	 * @param row
//	 * @param colum
//	 * @return if move valid true, otherwise false
//	 */
//	public abstract boolean isValidMove(int row, int colum);
}
