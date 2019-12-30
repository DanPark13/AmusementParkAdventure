/*
 * Team Two: PJ Martin, Daniel Park, and William Chow
 * Project Name: Action Park Simulator
 * Class Purpose: Runs all the code on the console
 * Date: 6/9/2019
 * Period: 5
 * Revision #: 1
 * 
 */

// import all necessary libraries needed for code
import java.util.ArrayList;
import java.util.Scanner;

public class Team2_Final_2019_Pd5 extends Boss
{

	// constructs the object
	public Team2_Final_2019_Pd5(int C, String e, int bE, int hE, String r, int aN) 
	{
		super(C, e, bE, hE, r, aN);
	}

	// all the private variables initialized
	private static String Name;
	private static int Hunger = 3;
	private static double Money;
	private static int Ap = 7;
	
	// creates the boss into the main
	static Boss boss = new Boss(Hunger, Name, Hunger, Hunger, Name, Hunger);
	
	// creates all the situations necessary for program to run
	static AmusementPark act1; // tutorial
	static AmusementPark act2;
	
	static AmusementPark act3; // day one
	static AmusementPark act4;
	
	static AmusementPark act5; // day two
	static AmusementPark act6;
	
	static AmusementPark act7; // day three
	static AmusementPark act8;
	
	static AmusementPark act9; // day four
	static AmusementPark act10;
	
	static AmusementPark act11; // day five
	static AmusementPark act12;
	
	static AmusementPark act13; // day six
	static AmusementPark act14;
	
	static AmusementPark act15; // day seven
	static AmusementPark act16;

	// creates scanner object to scan next use
	static Scanner scan = new Scanner(System.in);
	
	//  creates an arraylist of amusement park scenarios
	public static ArrayList<AmusementPark> AmusementParkList  = new ArrayList<AmusementPark>(); 
	
	// main method
	public static void main(String[] args) throws InterruptedException
	{
		Introduction();
		InitializeAmusementParks();
		
		choiceTime(1,2, AmusementParkList.get(0), AmusementParkList.get(1));
		
		System.out.println("\nDAY ONE\n");	
		
		System.out.println("  .--'\"\"\"\"\"\"\"\"\"\"`--. ");
		System.out.println(",'     .------.     `,");
		System.out.println(":     (        )     :");
		System.out.println("|\\     `------'     /|");
		System.out.println("| `--.__________,--' |");
		System.out.println("|          /         |");
		System.out.println("|          \\         |");
		System.out.println("|          /         |");
		System.out.println("|          \\         |");
		System.out.println("|          /         |");
		System.out.println("|          /         |");
		System.out.println("|          \\         |");
		System.out.println("|          /         |");
		System.out.println("|          \\         |");
		System.out.println("|          /         |");
		System.out.println("|          \\         |");
		System.out.println("`.         /        .'");
		System.out.println("  `--._____\\____,--' ");
		
		System.out.println("\nYou walk into work on your first day and your boss goes up to you and asks you to clean the toilets.");
		System.out.println("However, you did not eat breakfast that morning.");
		System.out.println("Do you...\n");
		
		choiceTime(1,2,AmusementParkList.get(2), AmusementParkList.get(3) );
		
		System.out.println("\nDAY TWO\n");
		
		System.out.println("           _ _ _ _ _ _ _ _ _ _ _ ");
		System.out.println("          (-(-(-(-(-(-(-(-(-(-(-() ");
		System.out.println("          /¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ /|| ");
		System.out.println("         /                    /_|| ");
		System.out.println("        /                    /__|| ");
		System.out.println("       //|  /               /___|| ");
		System.out.println("      // | / ___/_ _  _    /____|| ");
		System.out.println("     //  |/(_) (__(/_/_)_ /_____|| ");
		System.out.println("    /( _ _ _ _ _ _ _ _ _ /______|| ");
		System.out.println("   /  ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ /_______|| ");
		System.out.println("  /                    /________|| ");
		System.out.println(" /                    /_________|| ");
		System.out.println("(____________________(__________|| ");
		System.out.println("           |____________________|| ");
		System.out.println("           |____________________|| ");
		System.out.println("           |____________________|| ");
		System.out.println("           |____________________|| ");
		System.out.println("           |____________________|| ");
		System.out.println("           |____________________|/ ");
		
		System.out.println("\nNow your boss wants your help filing a mountain of paperwork");	
		System.out.println("But you also see a ride that you haven't tried yet.");
		System.out.println("Do you...\n");
		
		choiceTime(1,2,AmusementParkList.get(4), AmusementParkList.get(5) );
		
		System.out.println("\nDAY THREE");
		
		System.out.println("         _______");
		System.out.println("        |.-----.|");
		System.out.println("        ||o . o||");
		System.out.println("        ||_.-._||");
		System.out.println("        `--)-(--`");
		System.out.println("       __[=== o]___");
		System.out.println("      |:::::::::::|\\");
		System.out.println("      `-=========-`()");
		
		System.out.println("\nYou are on your lunch break when you notice your boss left an important file open on his desk.");	
		System.out.println("You see that it is the game script that controls the ratings...");
		System.out.println("Do you...\n");
		
		choiceTime(1,2,AmusementParkList.get(6), AmusementParkList.get(7) );
		
		System.out.println("\nDAY FOUR");
		
		System.out.println("                     __  __");
		System.out.println("                   __ [_|]'_|] __");
		System.out.println("                  [_|].-'-_-_'-._]");
		System.out.println("                _.'.'-.-''   '-.-'__");
		System.out.println("               [_|]-.'.  '   ' .'.-_]");
		System.out.println("              _/ /_/ '.'. ' ' .  .' -_");
		System.out.println("             [_|]_'    '.'_'_. .'  '._]");
		System.out.println("              |_|_| = = (.-_o) = = :-_'");
		System.out.println("             [_|] _    .//\\/_\\.    .-_]");
		System.out.println("               \\_\\_\\ .'//_//_\\\\'. .-.");
		System.out.println("               [_|]_`./.-/.-.-.\\_'-_]");
		System.out.println("                 '.'.-'-//__.\\.\\\\.'");
		System.out.println("                  [_|]-/.-_ .-[_\\\\");
		System.out.println("                   // // [_|]  \\.\\\\");
		System.out.println("            _____//_//_________\\.\\\\_____ ");
		
		System.out.println("\nYou are working as a ride personnel on the Ferris Wheel today.");
		System.out.println("Suddenly, you notice a kid on the highest point on the Ferris Wheel, holding onto the car for dear life.");	
		System.out.println("Falling would mean certain death");
		System.out.println("Do you...\n");
		
		choiceTime(1,2,AmusementParkList.get(8), AmusementParkList.get(9) );
		
		System.out.println("\nDAY FIVE");
		
		System.out.println("    ________________");
		System.out.println("  _/_______________/|");
		System.out.println(" /___________/___//||");
		System.out.println("|===        |----| ||");
		System.out.println("|           |   ô| ||");
		System.out.println("|___________|   ô| ||");
		System.out.println("| ||/.´---.||    | ||");
		System.out.println("|-||/_____\\||-.  | |´");
		System.out.println("|_||=======||_|__|/   ");
		
		System.out.println("\nYou go to print something from your boss when you realize the printer is out of toner");	
		System.out.println("Your boss wants you to travel to a store thirty minutes away and purchase some more toner");
		System.out.println("However, there is a movie theater near this store.");
		System.out.println("Do you...\n");
		
		choiceTime(1,2,AmusementParkList.get(10), AmusementParkList.get(11) );
		
		System.out.println("\nDAY SIX");
		
		System.out.println("                   //			");
		System.out.println(" ww_          ___.///			");
		System.out.println("o__ `._.-'''''    //			");
		System.out.println("|/  \\   ,     /   //			");
		System.out.println("     \\  ``,,,' _//			");
		System.out.println("      `-.  \\--'      			");
		System.out.println("         \\_/_/      			");
		System.out.println("          \\\\\\\\				 ");
		System.out.println("         ,,','`    			 ");
		
		System.out.println("\nYour boss tells you that you will be working at the fried chicken parlor for today");	
		System.out.println("You work harder all day, selling fried chicken to happy amusement park guests");
		System.out.println("While you are working, you see somebody throw away all of their food, saying that the food was \"a disgrace to chicken\"");	
		System.out.println("You go to the garbage can, and you see the perfectly good chicken in the trash.");
		System.out.println("You are VERY hungry, but you know it is not ethical to eat the chicken");	
		System.out.println("Do you...\n");
		
		choiceTime(1,2,AmusementParkList.get(12), AmusementParkList.get(13) );
		
		System.out.println("\nDAY SEVEN");
		
		System.out.println("                                           o");
		System.out.println("                                         o |");
		System.out.println("                                         |");
		System.out.println("      .       .           ._._.    _                     .===.");
		System.out.println("      |`      |`        ..'\\ /`.. |H|        .--.      .:'   `:.");
		System.out.println("     //\\-...-/|\\         |- o -|  |H|`.     /||||\\     ||     ||");
		System.out.println(" ._.'//////,'|||`._.    '`./|\\.'` |\\\\||:. .'||||||`.   `:.   .:'");
		System.out.println(" ||||||||||||[ ]||||      /_T_\\   |:`:.--'||||||||||`--..`=:='...    ");
		
		System.out.println("\nIt's the end of the day now, and the boss has told you to close down all the rides ");	
		System.out.println("Your boss however has already left, and your supposed to meet some people for dinner very soon");
		System.out.println("Do you...\n");
		
		choiceTime(1,2,AmusementParkList.get(14), AmusementParkList.get(15) );
		
		checkSuccess();
		
		System.out.println("\nShame, you didn't impress your boss enough to recieve a raise");
		System.out.println("At least you didn't die or get fired, so good job");
		System.out.println("Give it another shot next week, I bet you'll get it soon");
		System.out.println("For now, get some rest...");
		System.out.println("YOU DESERVE IT!\n");
		
		System.out.println("                            z");
		System.out.println("                           z");
		System.out.println("                             Z");
		System.out.println("                    .--.  Z Z");
		System.out.println("                   / _(c\\   .-.     __");
		System.out.println("                  | / /  '-;   \\'-'`  `\\______");
		System.out.println("                  \\_\\/'/ __/ )  /  )   |      \\--,");
		System.out.println("                  | \\`\"\"`__-/ .'--/   /--------\\  \\");
		System.out.println("                   \\\\`  ///-\\/   /   /---;-.    '-'");
		System.out.println("                               (________\\  \\");
		System.out.println("                                          '-'");
		
		
	}
	
	// first runs when running the program. asks whether user would like to do a tutorial
	private static void Introduction()
	{
		System.out.println(" __      __       .__                                  __              _____          __  .__                __________               __       _________.__              .__          __                ");
		System.out.println("/  \\    /  \\ ____ |  |   ____  ____   _____   ____   _/  |_  ____     /  _  \\   _____/  |_|__| ____   ____   \\______   \\_____ _______|  | __  /   _____/|__| _____  __ __|  | _____ _/  |_  ___________ ");
		System.out.println("\\   \\/\\/   // __ \\|  | _/ ___\\/  _ \\ /     \\_/ __ \\  \\   __\\/  _ \\   /  /_\\  \\_/ ___\\   __\\  |/  _ \\ /    \\   |     ___/\\__  \\\\_  __ \\  |/ /  \\_____  \\ |  |/     \\|  |  \\  | \\__  \\\\   __\\/  _ \\_  __ \\");
		System.out.println(" \\        /\\  ___/|  |_\\  \\__(  <_> )  Y Y  \\  ___/   |  | (  <_> ) /    |    \\  \\___|  | |  (  <_> )   |  \\  |    |     / __ \\|  | \\/    <   /        \\|  |  Y Y  \\  |  /  |__/ __ \\|  | (  <_> )  | \\/");
		System.out.println("  \\__/\\  /  \\___  >____/\\___  >____/|__|_|  /\\___  >  |__|  \\____/  \\____|__  /\\___  >__| |__|\\____/|___|  /  |____|    (____  /__|  |__|_ \\ /_______  /|__|__|_|  /____/|____(____  /__|  \\____/|__|   ");
		System.out.println("      \\/       \\/          \\/            \\/     \\/                         \\/     \\/                    \\/                  \\/           \\/         \\/          \\/                \\/                   ");
		System.out.println("\nBefore we start, would you like a tutorial on how to play the game?\n");
				
	}
	
	// controls when the user clicks '1' or '2' to choose the path they want to do
	private static void choiceTime(int choice1, int choice2, AmusementPark A1, AmusementPark A2)
	{
       System.out.println("(" + choice1 + ") "  + A1.getExplain());
		
		System.out.println("(" + choice2 + ") "  + A2.getExplain());
		
		int scanit = scan.nextInt();
		String rA1 = A1.getResult();
		String rA2 = A2.getResult();
		
		if (scanit == choice1)
		{
			System.out.print(rA1);
			boss.changeLikeness(A1.getBossE());
			changeHunger(A1.getHungerE());
			Ap -= A1.getCost();
		}
		
		if(scanit == choice2)
		{
			System.out.print(rA2);
			boss.changeLikeness(A2.getBossE());
			changeHunger(A2.getHungerE());
			Ap -= A1.getCost();
		}
		
		showStats();
		checkHunger();
		if(checkStatus() <= 0)
		{
			System.out.println("\nYOU WERE FIRED BY YOUR BOSS\n");
			
			System.out.println("    ,.   (   .      )        .      \"");
			System.out.println("   (\"     )  )'     ,'        )  . (`     '`");
			System.out.println(" .; )  ' (( (\" )    ;(,     ((  (  ;)  \"  )\"");
			System.out.println(" _\"., ,._'_.,)_(..,( . )_  _' )_') (. _..( '..");
			
			System.out.println("\nPlease try to please your boss as much as possible next time...\n");
			
			System.exit(0);
		}
		
	}
	
	// initializes all the code for the amusement park
	private static void InitializeAmusementParks()
	{
		// tutorial selection
		act1 = new AmusementPark(0, "I would like to skip the tutorial", 0, 0, "\nOkay then, have fun playing ACTION PARK SIMULATOR!\n", 1);
		AmusementParkList.add(act1);
		act2 = new AmusementPark(0, "I would like a tutorial\n", 0, 0, "\n--------------------------\n"
				+ "\nIn this game, you work at Action Park where your boss makes you do some odd jobs."
				+ "\nYour goal is to impress your boss enough in order to earn a promotion within one week"
				+ "\nBe careful however! Your choices will affect how much your boss appreciates your presense! "
				+ "\nAlso be wary of your hunger! If it hits zero, you will die!"
				+ "\nGood luck!\n", 2);
		AmusementParkList.add(act2);
		
		// day one
		act3 = new AmusementPark(1, "Clean the Toilets?", +1 , -1, "\nYour boss was pleased with your efforts! Though you are still pretty hungry...\n", 3);
		AmusementParkList.add(act3);
		act4 = new AmusementPark(1, "Go to the plaza to get a meal?\n", -1, +2, "\nWhile you were eating at the plaza, your boss noticed you. \nHe was not pleased and scolded you for your laziness.\n", 4);
		AmusementParkList.add(act4);
		
		// day two
		act5 = new AmusementPark(1, "Sneak onto the ride?", +2, +1,"\nYour Boss didn't see you go on the ride. \nThough you had unfinished work, someone else filed the papers for you. \nYour boss congratulates you for your hard work. \nHe gave you a lunch break and you ate for the day.\n",5);
		AmusementParkList.add(act5);
		act6 = new AmusementPark(1, "Start working on the paperwork?\n", -2, 0, "\nWhile you were working on your paperwork, you knocked all of the papers off of the table!\nYou also knocked down your boss' coffee on his lap!\n", 6);
		AmusementParkList.add(act6);
		
		// day three
		act7 = new AmusementPark(1, "Ignore the computer?", +0, +4,"\nYou ignored the problem and you had a fabuolous lunch break.\n",7);
		AmusementParkList.add(act7);
		act8 = new AmusementPark(1, "Make some 'modifications'?\n", +3, +3, "\nYou changed your grade, and snuck out undetected.\nYou ended up not taking your break. But you broke the game code so it's alright.\n", 8);
		AmusementParkList.add(act8);
		
		// day four
		act9 = new AmusementPark(1, "Try to save the kids from falling?", +5, -1,"\nSuccess! The kids is alive and so are you. \nIf that doesnt get you a raise nothing will!\n",9);
		AmusementParkList.add(act9);
		act10 = new AmusementPark(1, "Ignore the situation?\n", -3, 0, "\nThe kid fell to the ground. Luckily, he did not die. \nHowever, your boss gets upset that you did not try to help the child at all\n", 10);
		AmusementParkList.add(act10);
		
		// day five
		act11 = new AmusementPark(1, "Drive to the market and buy the stuff your boss needs?", +2, -1,"\nWell done, you did what your boss asked\n",11);
		AmusementParkList.add(act11);
		act12 = new AmusementPark(1, "Don't go and tell your boss they were all out, instead go see a new movie?\n", -4, +3, "\nYou return from the movie THREE HOURS LATER. Did you think your boss will REALLY accept that as your excuse?\n", 12);
		AmusementParkList.add(act12);
		
		// day six
		act13 = new AmusementPark(1, "Take the chicken out of the trash and eat it?", -3, +3,"\nYou take out the chicken out of the trash and you immediately eat it. However, you get ridiculed by customers for your stupidity\nYour boss later finds about the situation and lectures you about what to eat and what not to eat...\n",13);
		AmusementParkList.add(act13);
		act14 = new AmusementPark(1, "Leave the chicken alone?\n", +2, -3, "\nThe lunch and dinner rush happen at the same time and you miss your lunch break.\nHowever, your boss congratulates you for your hard effort today!\n", 14);
		AmusementParkList.add(act14);
		
		// day seven
		act15 = new AmusementPark(1, "Shut down all the rides, and lock up the park properly?", +2, +3,"\nGood Job, your first week at the park is now over, lets see how you did\n",13);
		AmusementParkList.add(act15);
		act16 = new AmusementPark(1, "Leave now, without turning the rides off and locking up the park?\n", -10, +1, "\nOH NO, since you didn't shut the rides off they weren't correctly callibrated in the morning!\nAs a result of this there were many injuries the next day.\n", 14);
		AmusementParkList.add(act16);
	}
	
	// calls at the end to see if user will get a promotion (a.k.a winning the game)
	private static int checkStatus()
	{
		return boss.getLikeness();
	}
	
	// changes the hunger stat
	private static void changeHunger(int change)
	{
		Hunger += change;
	}
	
	// displays the stats of the user
	public static void showStats()
	{
		System.out.println("\n--------------------------");
		System.out.println("\nYOUR STATS:");
		System.out.println("\nHUNGER:"+ " " + Hunger + "/10");
		System.out.println("BOSS HAPPINESS: " + boss.getLikeness() + "/10");
		System.out.println("DAYS LEFT: " + Ap);
		System.out.println("\n--------------------------");
	}
	
	// check the hunger and see if the user will die from starvation (happens whenever)
	public static void checkHunger()
	{
		if(Hunger <= 0)
		{
			System.out.println("\nDEATH BY STARVATION");
			System.out.println("Wow, you forgot to eat and died!\n");
			
			System.out.println("               ...");
			System.out.println("             ;::::;");
			System.out.println("           ;::::; :;");
			System.out.println("         ;:::::'   :;");
			System.out.println("        ;:::::;     ;.");
			System.out.println("       ,:::::'       ;           OOO\\");
			System.out.println("       ::::::;       ;          OOOOO\\");
			System.out.println("       ;:::::;       ;         OOOOOOOO");
			System.out.println("      ,;::::::;     ;'         / OOOOOOO");
			System.out.println("    ;:::::::::`. ,,,;.        /  / DOOOOOO");
			System.out.println("  .';:::::::::::::::::;,     /  /     DOOOO");
			System.out.println(" ,::::::;::::::;;;;::::;,   /  /        DOOO");
			System.out.println(";`::::::`'::::::;;;::::: ,#/  /          DOOO");
			System.out.println(":`:::::::`;::::::;;::: ;::#  /            DOOO");
			System.out.println("::`:::::::`;:::::::: ;::::# /              DOO");
			System.out.println("`:`:::::::`;:::::: ;::::::#/               DOO");
			System.out.println(":::`:::::::`;; ;:::::::::##                OO");
			System.out.println(" ::::`:::::::`;::::::::;:::#                OO");
			System.out.println(" `:::::`::::::::::::;'`:;::#                O");
			System.out.println("  `:::::`::::::::;' /  / `:#");
			System.out.println("   ::::::`:::::;'  /  /   `#");
			
			System.out.println("\nPlease remember to eat next time...");
			
			System.exit(0);
		}
	}

	// sees if the user will get fired or will get a promotion at the end of the game
	public static void checkSuccess()
	{
		
		
		if(checkStatus() >= 10)
		{
			System.out.println("\nCONGRATULATIONS, YOU GOT A PROMOTION");
			System.out.println("You were promoted to Senior Worker!");
			System.out.println("Doesn't that mean you're old?");
			System.out.println("It's whatever, congrats!\n");
			System.out.println("   ______________");
			System.out.println("  |              |");
			System.out.println("((|    SENIOR    |))");
			System.out.println("  |    WORKER    |");
			System.out.println("  \\            //");
			System.out.println("   \\          ||'");
			System.out.println("     --------- ");
			System.out.println("  ___|________|___");
		
			System.exit(0);
		}
	}
}