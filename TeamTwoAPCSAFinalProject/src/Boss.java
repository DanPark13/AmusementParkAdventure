/*
 * Team Two: PJ Martin, Daniel Park, and William Chow
 * Project Name: Action Park Simulator
 * Class Purpose: Constructs the boss
 * Date: 6/9/2019
 * Period: 5
 * Revision #: 1
 * 
 */

public class Boss extends AmusementPark
{
	
	public Boss(int C, String e, int bE, int hE, String r, int aN) {
		super(C, e, bE, hE, r, aN);
		// TODO Auto-generated constructor stub
	}
	
	private int fondnessOfYou = 2;

	public int getLikeness()
	{
		return fondnessOfYou;
	}
	
	public void changeLikeness(int change)
	{
		fondnessOfYou += change;
	}
}

