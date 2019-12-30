/*
 * Team Two: PJ Martin, Daniel Park, and William Chow
 * Project Name: Action Park Simulator
 * Class Purpose: Creates the amusement park used in game
 * Date: 6/9/2019
 * Period: 5
 * Revision #: 1
 * 
 */

public class AmusementPark
{
	// private variables initialized
	private int Cost;
	private String explantion;
	private int bossE;
	private int hungerE;
	private String result;
	private int actionNumber;
	
	// creates AmusementPark CLass
	public AmusementPark(int C, String e, int bE, int hE, String r, int aN)
	{
		Cost = C;
		explantion = e;
		bossE = bE;
		hungerE = hE;
		result = r;
		actionNumber = aN;
	}
	
	// gets cost of each point
	public int getCost()
	{
		return Cost;
	}
	
	// returns explanation
	public String getExplain()
	{
		return explantion;
		
	}

	// gets the number of actions called
	public int getNumber() 
	{
		return actionNumber;
	}

	// prints out the result 
	public void doIt() 
	{
		System.out.print(result);
	}

	// returns the result
	public String getResult() 
	{
		return result;
	}
	
	// gets hunger of the player
	public int getHungerE()
	{
		return hungerE;
	}

	// gets the happiness points of the boss
	public int getBossE() 
	{
		return bossE;
	}
}