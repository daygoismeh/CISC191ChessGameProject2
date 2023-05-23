package Chess;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

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
 * Responsibilities of class: Creates GUI for the Chess Board and the Chess Pieces
 */
//ChessBoard IS-A JPanel
public class ChessBoard extends JPanel
{
	//ChessBoard HAS-A colored squares
	private Color squareColor1,
				  squareColor2;
	private Image[] chessImages;
	private LinkedList<ChessPiece> chessPieces;
	
	/**
	 * Constructor
	 */
	public ChessBoard(LinkedList<ChessPiece> chessPieces)
	{
		squareColor1 = Color.GRAY;
		squareColor2 = Color.WHITE;
		this.chessPieces = chessPieces;
	}
	
	/**
	 * Makes the chess board appear on a panel
	 */
	public void paint(Graphics g)
	{
		boolean firstSquareColor = true;
		
		//Array that will contain the images for the chess pieces
		chessImages = new Image[12];
		
		//For loop that repeats the coloring of the chess board
		for (int y = 0; y < 8; y++)
		{
			for (int x = 0; x < 8; x++)
			{
				//if the first square is true than color the square the square a certain color
				if (firstSquareColor)
				{
					g.setColor(squareColor1);
				}
				//else color the square another color
				else
				{
					g.setColor(squareColor2);
				}
				//Sets the dimensions of the panel to adjust the size of the squares to the size of the dimensions of the panel that is
				//in the frame
				g.fillRect(x*getWidth()/8, y*getHeight()/8, getWidth(), getHeight());
				//Sets the boolean to the opposite of what it is
				firstSquareColor = !firstSquareColor;
			}
			//Sets the boolean to the opposite of what it is
			firstSquareColor = !firstSquareColor;
		}
		
		try
		{
			//Reads the images that are going to be used
			BufferedImage whiteKing = ImageIO.read(new File("WKing.png"));
			BufferedImage whiteQueen = ImageIO.read(new File("WQueen.png"));
			BufferedImage whiteBishop = ImageIO.read(new File("WBishop.png"));
			BufferedImage whiteKnight = ImageIO.read(new File("WKnight.png"));
			BufferedImage whiteRook = ImageIO.read(new File("WRook.png"));
			BufferedImage whitePawn = ImageIO.read(new File("WPawn.png"));
			BufferedImage blackKing = ImageIO.read(new File("BKing.png"));
			BufferedImage blackQueen = ImageIO.read(new File("BQueen.png"));
			BufferedImage blackBishop = ImageIO.read(new File("BBishop.png"));
			BufferedImage blackKnight = ImageIO.read(new File("BKnight.png"));
			BufferedImage blackRook = ImageIO.read(new File("BRook.png"));
			BufferedImage blackPawn = ImageIO.read(new File("BPawn.png"));
			
			//Adds a scaled image of the chess piece to the image array
			chessImages[0] = whiteKing.getScaledInstance(getWidth()/8, getHeight()/8, BufferedImage.SCALE_SMOOTH);
			chessImages[1] = whiteQueen.getScaledInstance(getWidth()/8, getHeight()/8, BufferedImage.SCALE_SMOOTH);
			chessImages[2] = whiteBishop.getScaledInstance(getWidth()/8, getHeight()/8, BufferedImage.SCALE_SMOOTH);
			chessImages[3] = whiteKnight.getScaledInstance(getWidth()/8, getHeight()/8, BufferedImage.SCALE_SMOOTH);
			chessImages[4] = whiteRook.getScaledInstance(getWidth()/8, getHeight()/8, BufferedImage.SCALE_SMOOTH);
			chessImages[5] = whitePawn.getScaledInstance(getWidth()/8, getHeight()/8, BufferedImage.SCALE_SMOOTH);
			chessImages[6] = blackKing.getScaledInstance(getWidth()/8, getHeight()/8, BufferedImage.SCALE_SMOOTH);
			chessImages[7] = blackQueen.getScaledInstance(getWidth()/8, getHeight()/8, BufferedImage.SCALE_SMOOTH);
			chessImages[8] = blackBishop.getScaledInstance(getWidth()/8, getHeight()/8, BufferedImage.SCALE_SMOOTH);
			chessImages[9] = blackKnight.getScaledInstance(getWidth()/8, getHeight()/8, BufferedImage.SCALE_SMOOTH);
			chessImages[10] = blackRook.getScaledInstance(getWidth()/8, getHeight()/8, BufferedImage.SCALE_SMOOTH);
			chessImages[11] = blackPawn.getScaledInstance(getWidth()/8, getHeight()/8, BufferedImage.SCALE_SMOOTH);
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		//This for loop helps get the correct image for each chess piece
		for (ChessPiece pieces : chessPieces)
		{
			//Holder variable
			int chessIndex = 0;
			
			//If the chess name is any of the following, then the counter is assigned a number based on the 
			//chess piece image location for the image chess array.
			if (pieces.getPieceName().equalsIgnoreCase("king"))
			{
				chessIndex = 0;
			}
			else if (pieces.getPieceName().equalsIgnoreCase("queen"))
			{
				chessIndex = 1;
			}
			else if (pieces.getPieceName().equalsIgnoreCase("bishop"))
			{
				chessIndex = 2;
			}
			else if (pieces.getPieceName().equalsIgnoreCase("knight"))
			{
				chessIndex = 3;
			}
			else if (pieces.getPieceName().equalsIgnoreCase("rook"))
			{
				chessIndex = 4;
			}
			else if (pieces.getPieceName().equalsIgnoreCase("pawn"))
			{
				chessIndex = 5;
			}
			
			//If the piece is not white add 6 more to the variable
			if (!pieces.getIsWhite())
			{
				chessIndex += 6;
			}
			
			//Shows the image of the piece on to the part of the board the piece has (row and column)
			g.drawImage(chessImages[chessIndex],(pieces.getColumn())*getWidth()/8, (pieces.getRow()) * getHeight()/8, this);
		}
	}
}
