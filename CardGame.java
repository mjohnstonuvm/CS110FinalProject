//Matt Johnston
//CS 110
//Card game class

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CardGame extends JFrame{
	
	//Variables
	private static final long serialVersionUID = 1L;
	JButton flipp1 = new JButton("Flip Card");
	JFrame frame = new JFrame("War");
	JLabel label = new JLabel();
	JPanel pan = new JPanel();
	/**
	 * Contructor
	 */
	public CardGame()
	{
		
	}
	//Main method
	public static void main(String []args){
		
		new CardGame();
	}
}
