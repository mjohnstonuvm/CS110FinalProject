//Matt Johston
//Deck class
//CS 110
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GuiDeck {

	/**
	 * Constructor
	 */
	public GuiDeck()
	{
		
	}
	public String getFlipCard()
	{
		Scanner inputFile = null;
		String inputLine = "";
		Random r = new Random();
		ArrayList<String> lines = new ArrayList<String>();
		
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
		System.out.println(rc);
		return rc;
	}
	
	public String getBack(){
		
		File file = new File("back.jpg");
		String bs = file.toString();
		return bs;
	}
}
