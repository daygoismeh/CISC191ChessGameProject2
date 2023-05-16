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
 * Version/date: v.1 5/12/2023
 * 
 * Responsibilities of class: 
 */
public abstract class ChessPiece
{
	//ChessPiece HAS-A row and column, and possibly a white chess piece
	private int row,
				column;
	private boolean isWhitePiece;
    
	/**
	 * Constructor
	 * @param row
	 * @param column
	 * @param isWhitePiece
	 */
    public ChessPiece(int row, int column, boolean isWhitePiece) 
    {
        this.row = row;
        this.column = column;
        this.isWhitePiece = isWhitePiece;
    }
    
    /**
     * Abstract method, determines if the chess piece made a valid move
     * @param toRow
     * @param toColumn
     * @return true if move is valid, false if invalid move 
     * 
     * (NOTE: possible implementation of exception for false move)
     */
    public abstract boolean isValidMove(int toRow, int toColumn);
    
    /**
     * Sets the row for the chess piece
     * @param row
     */
    public void setRow(int row) 
    {
        this.row = row;
    }
    
    /**
     * Gets the row of the chess piece
     * @return row (int)
     */
    public int getRow() 
    {
        return row;
    }
    
    /**
     * Sets the column of the chess piece
     * @param column
     */
    public void setColumn(int column) 
    {
        this.column = column;
    }
    
    /**
     * Gets the column of the chess piece
     * @return
     */
    public int getColumn() 
    {
        return column;
    }
    
    /**
     * Returns boolean if the chess piece is the white
     * @return true if chess piece is white, false if not
     */
    public boolean getWhitePiece()
    {
    	return isWhitePiece;
    }
}
