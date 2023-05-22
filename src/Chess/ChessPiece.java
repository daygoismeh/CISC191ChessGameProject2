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
 * Version/date: v.2 5/21/2023
 * 
 * Responsibilities of class: Creates the methods and instance variables for the chess pieces
 */
//ChessPiece IS Movable and Eliminable
public abstract class ChessPiece implements Movable
{
	//ChessPiece HAS-A row and column (int), probable white piece (boolean), and a piece name (String)
	private int row,
				column;
	private boolean whitePiece,
					pieceStatus;
	private String pieceName;
	
	/**
	 * Constructor
	 * @param row
	 * @param column
	 * @param whitePiece
	 */
	public ChessPiece(int row, int column, boolean whitePiece)
	{
		this.row = row;
		this.column = column;
		this.whitePiece = whitePiece;
		pieceStatus = true;
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
	
	/**
	 * Returns true if the piece is white, false if the pieces are black
	 * @return whitePiece
	 */
	public boolean getIsWhitePiece()
	{
		return whitePiece;
	}
	
	/**
	 * Returns the status of the piece, true if the piece isn't eliminated
	 * @return pieceStatus
	 */
	public boolean getPieceStatus()
	{
		return pieceStatus;
	}
	
	/**
	 * Sets the name of the chess piece
	 */
	public void setPieceName(String newPieceName)
	{
		if (whitePiece)
		{
			pieceName = "White " + newPieceName;
		}
		else
		{
			pieceName = "Black " + newPieceName;
		}
	}
	
	/**
	 * Returns the name of the chess piece
	 * @return pieceName
	 */
	public String getPieceName()
	{
		return pieceName;
	}
	
	/**
	 * Checks if the move that is going to be done is valid for the piece
	 * @param row
	 * @param colum
	 * @return if move valid true, otherwise false
	 */
	public abstract boolean isValidMove(int row, int colum);
}
