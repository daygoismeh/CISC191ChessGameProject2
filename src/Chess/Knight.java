package Chess;

import java.util.LinkedList;

public class Knight extends ChessPiece
{

	public Knight(int row, int column, boolean isWhite, String pieceName, LinkedList<ChessPiece> piece)
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
