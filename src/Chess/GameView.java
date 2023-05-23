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
 * Version/date: v.2 5/22/2023
 * 
 * Responsibilities of class: Helps create the GUI for the chess game
 */
//GameBoard IS-A JFrame
public class GameView extends JFrame
{
	//GameBoard HAS-A white chess ChessPiece score board, with chess ChessPiece fields, and chess ChessPiece labels for King, Queen, Rooks, Bishops, Knights and Pawns.
	private JPanel whiteScoreBoardPanel;
	private JLabel whiteChessPiecesTableLabel;
	private JPanel whiteChessPiecesRemaining;
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
	
	//GameBoard HAS-A black chess ChessPiece score board, with chess ChessPiece fields, and chess ChessPiece labels for King, Queen, Rooks, Bishops, Knights and Pawns.
	private JPanel blackScoreBoardPanel;
	private JLabel blackChessPiecesTableLabel;
	private JPanel blackChessPiecesRemaining;
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
	
	//GameBoard HAS-A chess board UI and chess pieces
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
		
		//Still experimenting with this class
		addMouseListener(new ChessPieceListener());
		
		setVisible(true);
	}

	/**
	 * Creates a panel that will track the number of ChessPieces they have on the board, along with what those ChessPieces are for the white
	 * chess ChessPieces.
	 */
	public void createWhiteScoreBoardPanel()
	{
		whiteScoreBoardPanel = new JPanel();
		whiteScoreBoardPanel.setLayout(new GridLayout(2,1,10,10));
		whiteScoreBoardPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		//Sets the label for the panels
		whiteChessPiecesTableLabel = new JLabel("White ChessPieces", JLabel.CENTER);
		whiteChessPiecesTableLabel.setFont(new Font("Monospaced", Font.BOLD, 22));
		//Adds label to grid location row 1 column 1
		whiteScoreBoardPanel.add(whiteChessPiecesTableLabel);
		
		//New panel for the table that will contain the info for the white team
		whiteChessPiecesRemaining = new JPanel();
		whiteChessPiecesRemaining.setLayout(new GridLayout(6,2));
		
		whiteKingLabel = new JLabel("King Remaining: ");
		whiteKingField = new JTextField(); 
		whiteKingField.setEnabled(false);
		whiteChessPiecesRemaining.add(whiteKingLabel);
		whiteChessPiecesRemaining.add(whiteKingField);
		
		whiteQueenLabel = new JLabel("Queen(s) Remaining: ");
		whiteQueenField = new JTextField();
		whiteQueenField.setEnabled(false);
		whiteChessPiecesRemaining.add(whiteQueenLabel);
		whiteChessPiecesRemaining.add(whiteQueenField);
		
		whiteRookLabel = new JLabel("Rooks Remaining: ");
		whiteRookField = new JTextField();
		whiteRookField.setEnabled(false);
		whiteChessPiecesRemaining.add(whiteRookLabel);
		whiteChessPiecesRemaining.add(whiteRookField);
		
		whiteBishopLabel = new JLabel("Bishops Remaining: ");
		whiteBishopField = new JTextField();
		whiteBishopField.setEnabled(false);
		whiteChessPiecesRemaining.add(whiteBishopLabel);
		whiteChessPiecesRemaining.add(whiteBishopField);
		
		whiteKnightLabel = new JLabel("Knights Remaining: ");
		whiteKnightField = new JTextField();
		whiteKnightField.setEnabled(false);
		whiteChessPiecesRemaining.add(whiteKnightLabel);
		whiteChessPiecesRemaining.add(whiteKnightField);
		
		whitePawnLabel = new JLabel("Pawns Remaining: ");
		whitePawnField = new JTextField();
		whitePawnField.setEnabled(false);
		whiteChessPiecesRemaining.add(whitePawnLabel);
		whiteChessPiecesRemaining.add(whitePawnField);
		
		//adds the panel to the grid location row 2 column 1
		whiteScoreBoardPanel.add(whiteChessPiecesRemaining);
		//Then adds the score board panel to the left side of the frame
		add(whiteScoreBoardPanel, BorderLayout.WEST);
	}
	
	/**
	 * Creates a panel that will track the number of ChessPieces they have on the board, along with what those ChessPieces are for the black
	 * chess ChessPieces.
	 */
	public void createBlackScoreBoardPanel()
	{
		//Creates a grid panel that contains all the black ChessPieces that are not captured and what those ChessPieces are
		blackScoreBoardPanel = new JPanel();
		blackScoreBoardPanel.setLayout(new GridLayout(2,1,10,10));
		blackScoreBoardPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				
		blackChessPiecesTableLabel = new JLabel("Black ChessPieces", JLabel.CENTER);
		blackChessPiecesTableLabel.setFont(new Font("Monospaced", Font.BOLD, 22));
		//Adds the title label to grid location row 1 column 1
		blackScoreBoardPanel.add(blackChessPiecesTableLabel);
		
		//New panel that will contain the table for the black team chess ChessPiece info
		blackChessPiecesRemaining = new JPanel();
		blackChessPiecesRemaining.setLayout(new GridLayout(6,2));
		
		//Elements that will create the table for the black chess ChessPieces
		blackKingLabel = new JLabel("King Remaining: ");
		blackKingField = new JTextField();
		blackKingField.setEnabled(false);
		blackChessPiecesRemaining.add(blackKingLabel);
		blackChessPiecesRemaining.add(blackKingField);
				
		blackQueenLabel = new JLabel("Queen(s) Remaining: ");
		blackQueenField = new JTextField();
		blackQueenField.setEnabled(false);
		blackChessPiecesRemaining.add(blackQueenLabel);
		blackChessPiecesRemaining.add(blackQueenField);
				
		blackRookLabel = new JLabel("Rooks Remaining: ");
		blackRookField = new JTextField();
		blackRookField.setEnabled(false);
		blackChessPiecesRemaining.add(blackRookLabel);
		blackChessPiecesRemaining.add(blackRookField);
				
		blackBishopLabel = new JLabel("Bishops Remaining: ");
		blackBishopField = new JTextField();
		blackBishopField.setEnabled(false);
		blackChessPiecesRemaining.add(blackBishopLabel);
		blackChessPiecesRemaining.add(blackBishopField);
				
		blackKnightLabel = new JLabel("Knights Remaining: ");
		blackKnightField = new JTextField();
		blackKnightField.setEnabled(false);
		blackChessPiecesRemaining.add(blackKnightLabel);
		blackChessPiecesRemaining.add(blackKnightField);
				
		blackPawnLabel = new JLabel("Pawns Remaining: ");
		blackPawnField = new JTextField();
		blackPawnField.setEnabled(false);
		blackChessPiecesRemaining.add(blackPawnLabel);
		blackChessPiecesRemaining.add(blackPawnField);
		
		//Adds panel to panel grid location row 2 column 1
		blackScoreBoardPanel.add(blackChessPiecesRemaining);
		
		//Adds the whole panel to the right side of the frame
		add(blackScoreBoardPanel, BorderLayout.EAST);
	}
	
	/**
	 * Creates the panel for the chess board, will be in the center of the frame
	 */
	public void createChessBoardPanel()
	{
		//Initiates the linked list
		chessPieces = new LinkedList<ChessPiece>();
		
		//Creates all the pieces on the board
		Rook blackRook=new Rook(0, 0, false, "rook", chessPieces);
        Knight blackKinght=new Knight(0, 1, false, "knight", chessPieces);
        Bishop blackBishop=new Bishop(0, 2, false, "bishop", chessPieces);
        Queen blackQueen=new Queen(0, 3, false, "queen", chessPieces);
        King blackKing=new King(0, 4, false, "king", chessPieces);
        Bishop blackBishop2=new Bishop(0, 5, false, "bishop", chessPieces);
        Knight blackKight2=new Knight(0, 6, false, "knight", chessPieces);
        Rook blackRook2=new Rook(0, 7, false, "rook", chessPieces);
        Pawn blackPawn1=new Pawn(1, 0, false, "pawn", chessPieces);
        Pawn blackPawn2=new Pawn(1, 1, false, "pawn", chessPieces);
        Pawn blackPawn3=new Pawn(1, 2, false, "pawn", chessPieces);
        Pawn blackPawn4=new Pawn(1, 3, false, "pawn", chessPieces);
        Pawn blackPawn5=new Pawn(1, 4, false, "pawn", chessPieces);
        Pawn blackPawn6=new Pawn(1, 5, false, "pawn", chessPieces);
        Pawn blackPawn7=new Pawn(1, 6, false, "pawn", chessPieces);
        Pawn blackPawn8=new Pawn(1, 7, false, "pawn", chessPieces);
        
        Rook whiteRook=new Rook(7, 0, true, "rook", chessPieces);
        Knight whiteKnight=new Knight(7, 1, true, "knight", chessPieces);
        Bishop whiteBishop=new Bishop(7, 2, true, "bishop", chessPieces);
        Queen whiteQueen=new Queen(7, 3, true, "queen", chessPieces);
        King whiteKing=new King(7, 4, true, "king", chessPieces);
        Bishop whiteBishop2=new Bishop(7, 5, true, "bishop", chessPieces);
        Knight whiteKnight2=new Knight(7, 6, true, "knight", chessPieces);
        Rook whiteRook2=new Rook(7, 7, true, "rook", chessPieces);
        Pawn whitePawn1=new Pawn(6, 0, true, "pawn", chessPieces);
        Pawn whitePawn2=new Pawn(6, 1, true, "pawn", chessPieces);
        Pawn whitePawn3=new Pawn(6, 2, true, "pawn", chessPieces);
        Pawn whitePawn4=new Pawn(6, 3, true, "pawn", chessPieces);
        Pawn whitePawn5=new Pawn(6, 4, true, "pawn", chessPieces);
        Pawn whitePawn6=new Pawn(6, 5, true, "pawn", chessPieces);
        Pawn whitePawn7=new Pawn(6, 6, true, "pawn", chessPieces);
        Pawn whitePawn8=new Pawn(6, 7, true, "pawn", chessPieces);
		
        //Creates the board panel, with an input parameter chess pieces
		chessBoardUI = new ChessBoard(chessPieces);
		
		//adds the panel to the center border layout
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
