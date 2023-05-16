package Chess;

import java.awt.Color;
import java.awt.Graphics;
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
 * Version/date: v.1 5/15/2023
 * 
 * Responsibilities of class: 
 */
//ChessBoard IS-A JPanel
public class ChessBoard extends JPanel
{
	//ChessBoard HAS-A colored squares
	private Color squareColor1,
				  squareColor2;
	
	/**
	 * Constructor
	 */
	public ChessBoard()
	{
		squareColor1 = Color.GRAY;
		squareColor2 = Color.BLACK;
	}
	
	/**
	 * Makes the chess board appear on a panel
	 */
	public void paint(Graphics g)
	{
		boolean firstSquareColor = true;
		
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
	}
}
