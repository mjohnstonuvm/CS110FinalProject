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
	ArrayList<String> player1 = new ArrayList<String>();
	ArrayList<String> player2 = new ArrayList<String>();
	
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
	public String getFlipCard()
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
			inputLine = inputFile.nextLine();
			lines.add(inputLine);
		}
		String rc = lines.get(r.nextInt(lines.size()));
		return rc;
	}
	/**
	 * determines winner
	 */
	public void winner(){
		
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
