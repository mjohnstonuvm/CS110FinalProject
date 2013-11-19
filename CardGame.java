//Matt Johnston
//CS 110
//Card game class

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.*;

public class CardGame extends JFrame{
	
	//Variables
	private static final long serialVersionUID = 1L;
	JFrame player1 = new JFrame("Player 1");
	JFrame player2 = new JFrame("Player 2");
	JFrame p2Frame1 = new JFrame();
	JFrame p2Frame2 = new JFrame();
	JButton rollp1 = new JButton("Flip Card Player 1");
	JButton rollp2 = new JButton("Flip Card Player 2");
	private ArrayList<Object> cards = new ArrayList<Object>();
	
	/**
	 * Constructor
	 */
	public CardGame(){

		//Set title
		super.setTitle("War!");
		
		//What close button does
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Size of screen
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//Set background color of screen
		this.setBackground(Color.BLUE.darker().darker().darker().darker().darker());
		
		//Sets visibility
		this.setVisible(true);
		
		//Get player 1 and player 2 window
		Player1();
		Player2();
	
	}
	//Get player 1 window
	public void Player1()
	{
		//Set size and x and y
		player1.setBounds(100, 150, 500, 600);
		//set color
		player1.setBackground(Color.WHITE);
		//set always on top
		player1.setAlwaysOnTop(true);
		//set resizable
		player1.setResizable(false);
		//set visibillity
		player1.setVisible(true);
		
		//add roll button to player 1
		rollp1.setBounds(170, 0, 150, 60);
		player1.add(rollp1);

	}
	//Get player 2 window
	public void Player2()
	{
		//set size and x and y
		player2.setBounds(800, 150, 500, 600);
		//set color
		player2.setBackground(Color.WHITE);
		//set always on top
		player2.setAlwaysOnTop(true);
		//set resizable
		player2.setResizable(false);
		//set visibilty
		player2.setVisible(true);
		rollp2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				flipP2();
			}
		});
		//add roll button to player 1
		rollp2.setBounds(170, 0, 150, 60);
		player2.add(rollp2);
	}
	//fliip method
	public void flipP2()
	{
		//Declare variables
		int card;
		//Add cards to list
		cards.add("2c.jpg");cards.add("2d.jpg");cards.add("2h.jpg");cards.add("2s.jpg");
		cards.add("3c.jpg");cards.add("3d.jpg");cards.add("3h.jpg");cards.add("3s.jpg");
		cards.add("4c.jpg");cards.add("4d.jpg");cards.add("4h.jpg");cards.add("4s.jpg");
		cards.add("5c.jpg");cards.add("5d.jpg");cards.add("5h.jpg");cards.add("5s.jpg");
		cards.add("6c.jpg");cards.add("6d.jpg");cards.add("6h.jpg");cards.add("6s.jpg");
		cards.add("7c.jpg");cards.add("7d.jpg");cards.add("7h.jpg");cards.add("7s.jpg");
		cards.add("8c.jpg");cards.add("8d.jpg");cards.add("8h.jpg");cards.add("8s.jpg");
		cards.add("9c.jpg");cards.add("9d.jpg");cards.add("9h.jpg");cards.add("9s.jpg");
		cards.add("10c.jpg");cards.add("10d.jpg");cards.add("10h.jpg");cards.add("10s.jpg");
		cards.add("acec.jpg");cards.add("aced.jpg");cards.add("aceh.jpg");cards.add("aces.jpg");
		cards.add("back.jpg");
		

		p2Frame1.setBounds(800, 300, 190,270);
		p2Frame1.setAlwaysOnTop(true);
		p2Frame1.setResizable(false);
		
		p2Frame2.setBounds(1110, 300, 190,270);
		p2Frame2.setAlwaysOnTop(true);
		p2Frame2.setResizable(false);

		for(int i = 0; i < cards.size(); i++){
			
			Random r = new Random();
			card = r.nextInt(1)+1;
			if(card == 1){
				try {
					p2Frame1.setContentPane(new JLabel(new ImageIcon
							(ImageIO.read(new File("/Users/Sir/Desktop/Programming/JAVA/CardGameGui/cardpics/back.jpg")))));
					p2Frame2.setContentPane(new JLabel(new ImageIcon
							(ImageIO.read(new File("/Users/Sir/Desktop/Programming/JAVA/CardGameGui/cardpics/2c.jpg")))));
				} catch (IOException e) {
					e.printStackTrace();
				}
				p2Frame2.pack();
				p2Frame1.pack();
				p2Frame1.setVisible(true);
				p2Frame2.setVisible(true);
			}
		}


		
	}
	//Main method
	public static void main(String []args){
		
		new CardGame();
	}
}
