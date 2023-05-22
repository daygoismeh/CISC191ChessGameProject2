package Chess;

import java.awt.*;
import java.util.LinkedList;

import javax.swing.*;

/**
 * Lead Author(s):
 * @author Diego Morales
 * @author Tien Nguyen
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *  
 * Version/date: v.1 5/13/2023
 * 
 * Responsibilities of class: 
 */
//GameBoard IS-A JFrame
public class GameView extends JFrame
{
	//GameBoard HAS-A white chess piece score board, with chess piece fields, and chess piece labels for King, Queen, Rooks, Bishops, Knights and Pawns.
	private JPanel whiteScoreBoardPanel;
	private JLabel whitePiecesTableLabel;
	private JPanel whitePiecesRemaining;
	private JLabel whiteKingLabel;
	private JTextField whiteKingField;
	private JLabel whiteQueenLabel;
	private JTextField whiteQueenField;
	private JLabel whiteRookLabel;
	private JTextField whiteRookField;
	private JLabel whiteBishopLabel;
	private JTextField whiteBishopField;
	private JLabel whiteKnightLabel;
	private JTextField whiteKnightField;
	private JLabel whitePawnLabel;
	private JTextField whitePawnField;
	
	//GameBoard HAS-A black chess piece score board, with chess piece fields, and chess piece labels for King, Queen, Rooks, Bishops, Knights and Pawns.
	private JPanel blackScoreBoardPanel;
	private JLabel blackPiecesTableLabel;
	private JPanel blackPiecesRemaining;
	private JLabel blackKingLabel;
	private JTextField blackKingField;
	private JLabel blackQueenLabel;
	private JTextField blackQueenField;
	private JLabel blackRookLabel;
	private JTextField blackRookField;
	private JLabel blackBishopLabel;
	private JTextField blackBishopField;
	private JLabel blackKnightLabel;
	private JTextField blackKnightField;
	private JLabel blackPawnLabel;
	private JTextField blackPawnField;
	
	//GameBoard HAS-A chess board UI
	private ChessBoard chessBoardUI;
	private LinkedList<ChessPiece> chessPieces;
	
	public GameView()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setSize(1025,600);
		setTitle("Chess Game");
		setLayout(new BorderLayout());
		
		createWhiteScoreBoardPanel();
		createBlackScoreBoardPanel();
		createChessBoardPanel();
		
		setVisible(true);
	}

	/**
	 * Creates a panel that will track the number of pieces they have on the board, along with what those pieces are for the white
	 * chess pieces.
	 */
	public void createWhiteScoreBoardPanel()
	{
		whiteScoreBoardPanel = new JPanel();
		whiteScoreBoardPanel.setLayout(new GridLayout(2,1,10,10));
		whiteScoreBoardPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		//Sets the label for the panels
		whitePiecesTableLabel = new JLabel("White Pieces", JLabel.CENTER);
		whitePiecesTableLabel.setFont(new Font("Monospaced", Font.BOLD, 22));
		//Adds label to grid location row 1 column 1
		whiteScoreBoardPanel.add(whitePiecesTableLabel);
		
		//New panel for the table that will contain the info for the white team
		whitePiecesRemaining = new JPanel();
		whitePiecesRemaining.setLayout(new GridLayout(6,2));
		
		whiteKingLabel = new JLabel("King Remaining: ");
		whiteKingField = new JTextField(); 
		whiteKingField.setEnabled(false);
		whitePiecesRemaining.add(whiteKingLabel);
		whitePiecesRemaining.add(whiteKingField);
		
		whiteQueenLabel = new JLabel("Queen(s) Remaining: ");
		whiteQueenField = new JTextField();
		whiteQueenField.setEnabled(false);
		whitePiecesRemaining.add(whiteQueenLabel);
		whitePiecesRemaining.add(whiteQueenField);
		
		whiteRookLabel = new JLabel("Rooks Remaining: ");
		whiteRookField = new JTextField();
		whiteRookField.setEnabled(false);
		whitePiecesRemaining.add(whiteRookLabel);
		whitePiecesRemaining.add(whiteRookField);
		
		whiteBishopLabel = new JLabel("Bishops Remaining: ");
		whiteBishopField = new JTextField();
		whiteBishopField.setEnabled(false);
		whitePiecesRemaining.add(whiteBishopLabel);
		whitePiecesRemaining.add(whiteBishopField);
		
		whiteKnightLabel = new JLabel("Knights Remaining: ");
		whiteKnightField = new JTextField();
		whiteKnightField.setEnabled(false);
		whitePiecesRemaining.add(whiteKnightLabel);
		whitePiecesRemaining.add(whiteKnightField);
		
		whitePawnLabel = new JLabel("Pawns Remaining: ");
		whitePawnField = new JTextField();
		whitePawnField.setEnabled(false);
		whitePiecesRemaining.add(whitePawnLabel);
		whitePiecesRemaining.add(whitePawnField);
		
		//adds the panel to the grid location row 2 column 1
		whiteScoreBoardPanel.add(whitePiecesRemaining);
		//Then adds the score board panel to the left side of the frame
		add(whiteScoreBoardPanel, BorderLayout.WEST);
	}
	
	/**
	 * Creates a panel that will track the number of pieces they have on the board, along with what those pieces are for the black
	 * chess pieces.
	 */
	public void createBlackScoreBoardPanel()
	{
		//Creates a grid panel that contains all the black pieces that are not captured and what those pieces are
		blackScoreBoardPanel = new JPanel();
		blackScoreBoardPanel.setLayout(new GridLayout(2,1,10,10));
		blackScoreBoardPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				
		blackPiecesTableLabel = new JLabel("Black Pieces", JLabel.CENTER);
		blackPiecesTableLabel.setFont(new Font("Monospaced", Font.BOLD, 22));
		//Adds the title label to grid location row 1 column 1
		blackScoreBoardPanel.add(blackPiecesTableLabel);
		
		//New panel that will contain the table for the black team chess piece info
		blackPiecesRemaining = new JPanel();
		blackPiecesRemaining.setLayout(new GridLayout(6,2));
		
		//Elements that will create the table for the black chess pieces
		blackKingLabel = new JLabel("King Remaining: ");
		blackKingField = new JTextField();
		blackKingField.setEnabled(false);
		blackPiecesRemaining.add(blackKingLabel);
		blackPiecesRemaining.add(blackKingField);
				
		blackQueenLabel = new JLabel("Queen(s) Remaining: ");
		blackQueenField = new JTextField();
		blackQueenField.setEnabled(false);
		blackPiecesRemaining.add(blackQueenLabel);
		blackPiecesRemaining.add(blackQueenField);
				
		blackRookLabel = new JLabel("Rooks Remaining: ");
		blackRookField = new JTextField();
		blackRookField.setEnabled(false);
		blackPiecesRemaining.add(blackRookLabel);
		blackPiecesRemaining.add(blackRookField);
				
		blackBishopLabel = new JLabel("Bishops Remaining: ");
		blackBishopField = new JTextField();
		blackBishopField.setEnabled(false);
		blackPiecesRemaining.add(blackBishopLabel);
		blackPiecesRemaining.add(blackBishopField);
				
		blackKnightLabel = new JLabel("Knights Remaining: ");
		blackKnightField = new JTextField();
		blackKnightField.setEnabled(false);
		blackPiecesRemaining.add(blackKnightLabel);
		blackPiecesRemaining.add(blackKnightField);
				
		blackPawnLabel = new JLabel("Pawns Remaining: ");
		blackPawnField = new JTextField();
		blackPawnField.setEnabled(false);
		blackPiecesRemaining.add(blackPawnLabel);
		blackPiecesRemaining.add(blackPawnField);
		
		//Adds panel to panel grid location row 2 column 1
		blackScoreBoardPanel.add(blackPiecesRemaining);
		
		//Adds the whole panel to the right side of the frame
		add(blackScoreBoardPanel, BorderLayout.EAST);
	}
	
	/**
	 * Creates the panel for the chess board, will be in the center of the frame
	 */
	public void createChessBoardPanel()
	{
		chessBoardUI = new ChessBoard();
		
		chessPieces = new LinkedList<ChessPiece>();
		
		add(chessBoardUI, BorderLayout.CENTER);
	}

	/**
	 * Runs the chess game view
	 * @param args
	 */
	public static void main(String[] args)
	{
		new GameView();
	}
}
