//Matt Johston
//Deck class
//CS 110
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GuiDeck {

	/**
	 * Fields
	 */
	ArrayList<String> lines = new ArrayList<String>();
	ArrayList<String> lines2 = new ArrayList<String>();
	ArrayList<String> player1 = new ArrayList<String>();
	ArrayList<String> player2 = new ArrayList<String>();
	String rc1, rc2, w;
	final int MAXCARDS = 10;
	/**
	 * Constructor
	 */
	public GuiDeck()
	{
		
	}
	/**
	 * flip card method
	 * @return
	 */
	public String getFlipCardP1()
	{
		Scanner inputFile = null;
		String inputLine = "";
		Random r = new Random();
		
		//Open the pop up
		File cards = new File("cards.txt");
		//Try catch clause
		try 
		{
			inputFile = new Scanner(cards);
		} 
		catch (FileNotFoundException e) 
		{
			e.getMessage();
		}
		//Read the file line by line
		while(inputFile.hasNext())
		{
			for(int i = 0; i < 52; i++){
			inputLine = inputFile.nextLine();
			lines.add(inputLine);
			}
		}
		rc1 = lines.get(r.nextInt(lines.size()));
		System.out.println("Player 1: " + rc1);
		return rc1;
	}
	/**
	 * flip card method
	 * @return
	 */
	public String getFlipCardP2()
	{
		Scanner inputFile = null;
		String inputLine = "";
		Random r = new Random();
		
		//Open the pop up
		File cards = new File("cards2.txt");
		//Try catch clause
		try 
		{
			inputFile = new Scanner(cards);
		} 
		catch (FileNotFoundException e) 
		{
			e.getMessage();
		}
		//Read the file line by line
		while(inputFile.hasNext())
		{
			inputLine = inputFile.nextLine();
			lines2.add(inputLine);
		}
		rc2 = lines2.get(r.nextInt(lines.size()));
		System.out.println("Player 2: " + rc2);
		return rc2;
	}
	/**
	 * determines winner
	 */
	public String getWinnerP1(){
		
		if(rc1.compareTo(rc2) > 0 && player1.size() != MAXCARDS){
			player1.add(rc1);
			player1.add(rc2);
			System.out.println("P1" + player1);
			w = "Player 1 Wins!";
		}
		else if(rc1.compareTo(rc2) < 0 && player2.size() != MAXCARDS)
		{
			player2.add(rc1);
			player2.add(rc2);
			System.out.println("P2" + player2);
			w = "Player 2 Wins!";
		}
		else if(rc1.equals(rc2)){
			lines.remove(rc1);
			lines2.remove(rc2);
		}
		
		return w;
	}
	/**
	 * determines winner
	 */
	public String getWinnerP2(){
		
		if(rc1.compareTo(rc2) > 0 && player2.size() != MAXCARDS){
			player1.add(rc1);
			player1.add(rc2);
		}
		else if(rc2.compareTo(rc1) > 0 && player2.size() != MAXCARDS)
		{
			player2.add(rc1);
			player2.add(rc2);
		}
		else if(rc1.equals(rc2)){
			lines.remove(rc1);
			lines2.remove(rc2);
		}
		else if(player1.size() == MAXCARDS){
			w ="Player 1 Wins!";
		}
		else if(player2.size() == MAXCARDS){
			w ="Player 2 Wins!";
		}
		return w;
	}

	/**
	 * displayes back of card
	 * @return
	 */
	public String getBack(){
		
		File file = new File("back.jpg");
		String bs = file.toString();
		return bs;
	}
}
