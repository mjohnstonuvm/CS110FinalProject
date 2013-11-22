//Matt Johnston
//CS 110
//Card game class

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CardGame extends JFrame{
	
	//Fields
	private static final long serialVersionUID = 1L;
	JButton flipp1 = new JButton("Flip Card");
	JFrame frame = new JFrame("War");
	JLabel label = new JLabel();
	JPanel pan = new JPanel();
	JPanel board = new JPanel();
	JPanel b2 = new JPanel();
	GuiDeck g = new GuiDeck();
	/**
	 * Contructor
	 */
	public CardGame()
	{
		setTitle("War");
		setBackground(Color.GREEN.darker().darker().darker().darker());
		setAlwaysOnTop(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900,600);
		setLayout(null);
		setVisible(true);
		getBoard();
		
	}
	/**
	 * get board method
	 */
	public void getBoard()
	{
		//player 1
		JLabel player1 = new JLabel("Player 1");
		player1.setForeground(Color.WHITE);
		player1.setBounds(100,0,150,50);
		//player 2
		JLabel player2 = new JLabel("Player 2");
		player2.setForeground(Color.WHITE);
		player2.setBounds(700,0,150,50);
		//Flip button
		JButton flip = new JButton("Flip");
		flip.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				flipCard();
			}
		});
		flip.setBackground(Color.BLACK);
		flip.setBounds(400,230,100,90);
		add(flip);
		//Start button
		JButton start = new JButton("Start");
		start.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent st){
				getCard();
			}
		});
		start.setBounds(400,0,100,90);
		flip.setBackground(Color.BLACK);
		//add items to panel
		add(player1);
		add(player2);
		add(start);
	}
	/**
	 * get card method
	 */
	public void getCard()
	{
		ImageIcon back = new ImageIcon(g.getBack());
		JLabel pic = new JLabel(back);
		JLabel pic2 = new JLabel(back);
		add(pic);
		add(pic2);
		pic.setBounds(0,150,100,160);
		pic2.setBounds(800,150,100,160);
		validate();
	}
	/**
	 * flip card method
	 */
	public void flipCard()
	{
		ImageIcon front = new ImageIcon("/Users/Sir/Desktop/Programming/JAVA/CardGameGui/cardpics/" + g.getFlipCard());
		JLabel f = new JLabel(front);
		add(f);
		f.setBounds(150,110,170,240);
		validate();
	}
	/**
	 * To string method
	 * @param args
	 * @return 
	 */
	public String toString(String s){
		
		return s;
	}
	//Main method
	public static void main(String []args)
	{
		
		new CardGame();

	}
}
