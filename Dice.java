//Matt Johnston
//CS 110
//Dice

import java.util.Random;

public class Dice {
	//fields
	private int sides; //Number of sides
	private int value; //Value of the dice
	private int dealerValue;
	private int points; //keeps users points
	
	/** 
	 * The constructor performs initial roll
	 * @param numSides The number of sides for this die.
	 */
	
	public Dice (int numSides)
	{
		sides = numSides;
		roll();
	}
	/**
	 * The roll method stimulates a roll using random class
	 */
	public void roll()
	{
		//create random variable
		Random r = new Random();
		
		//Get a random value for the dice
		value = r.nextInt(sides) + 1;
	}
	/**
	 * The dealer roll is the roll for the CPU
	 */
	public void dealerRoll()
	{
		//create random variable
		Random r = new Random();
		
		//Get a random value for the dice
		dealerValue = r.nextInt(sides) + 1;
	}
	/**
	 * The getSides method returns the sides of the dice
	 * @return
	 */
	public int getSides()
	{
		return sides;
	}
	/**
	 * the getValue method returns the value of the dice
	 * @return
	 */
	public int getValue()
	{
		return value;
	}
	/**
	 * the getDealerValue returnst the value of the dice for the dealerRoll
	 * @return
	 */
	public int getDealerValue()
	{
		return dealerValue;
	}
	/**
	 * returns how many points the user and CPU have accumulated
	 * @return
	 */
	public int points()
	{
		return points;
	}

	
}
