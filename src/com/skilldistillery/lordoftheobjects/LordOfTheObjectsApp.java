package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LordOfTheObjectsApp {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		openGame(kb);

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		firstChoice(kb);

		secondChoice(kb);

		thirdChoice(kb);

		sceneOne(kb);

		kb.close();
	}

	public static void openGame(Scanner name) {
		System.out.println("Hello, What's your name? ");
		String name1 = name.next();
		System.out.println();
		System.out.println(name1 + ", you’re enjoying green enchiladas at Sparky’s in Hatch, New Mexico, "
				+ "\nwhen you overhear Elmer Fudd, a local farmer explaining to the owner, there are no more Chiles to sell. \n"
				+ "\n"
				+ "Wait, it’s July, the Chile season just started, you think, how can there be no more Chiles? \n"
				+ "\n" + "The owner looks sad." + "\n"
				+ "\nPorky Pig is sitting at the table next to you and begins to cry. "
				+ "\n“But, Chiles are my favorite.” \n" + "\n" + "It’s looking dire for New Mexican Chiles you think "
				+ "\nas you take your last delicious bite of enchilada. \n" + "");
	}

	public static void firstChoice(Scanner input) {
		System.out.println();
		System.out.println("You look around. \n" + "Bug’s Bunny is munching on a carrot near the door. \n"
				+ "Porky Pig is still crying at his table next to yours. \n" + "Elmer Fudd is walking to the door. \n"
				+ "Hmm... you've heard the sopapillas are really good here." + "\n" + "");
		System.out.println("What do you want to do? \n" + "1. Console Porky Pig \n"
				+ "2. Run catch Elmer Fudd and chat with him.\n" + "3. Ask Bug's Bunny, What's Up?\n"
				+ "4. Order Sopapillas");
		int input1 = input.nextInt();

		switch (input1) {
		case 1:
			System.out.println("\nIt's so sad. I don't know what I'm going to eat with no New Mexican Chiles. "
					+ "\nThe ones from Colorado are too mild and limp. I'm too upset (sniff) but, if you want to save the Chiles "
					+ "\nthere are friends here.\n");
			break;
		case 2:
			System.out.println("\nIt's open season on Chile thieves! That wrascally wrabbit might help you.\n" + "");
			break;
		case 3:
			break;
		case 4:
			System.out.println("\nWow, those sopapillas were delicious. Now I'm too stuffed to do anything.");
			System.out.println(" Game Over - if you would like to play again re-run");
			System.exit(0);
			break;
		}

	}

	public static void secondChoice(Scanner kb) {
		GoodGuys bugsBunny = new GoodGuys("Bugs Bunny", 1000, 100, "What's up Doc?");
		System.out.println(bugsBunny.getInfo());

		System.out.println("Want to go on a hunt save the Chiles?\n" + "I'm partial to carrots\n"
				+ "Folks here though are despondent about the loss of their Chiles. They could use a hand getting them back.\n"
				+ "You look like you need a guide? \n");
		System.out.println(
				"\n Would you like to go with Bugs Bunny? " + "\nOr would you like to go back and order the sopapillas?"
						+ "\n press 1 for Bugs Bunny or 2 for Sopapillas");
		int choose = kb.nextInt();
		if (choose == 2) {
			System.out.println("Looks like dessert won over adventure, luckily there's still plenty of sopapillas.");
			System.out.println(" Game Over - if you would like to play again re-run");
			System.exit(0);
		} else {
		}
	}

	public static void thirdChoice(Scanner kb) {
		System.out.println(
				"\nDoc, I think the best path is to Monument Valley. I heard of some folks carrying sacks of Chiles up there.");
		tunneling();
	}

	public static void tunneling() {
		int testABQ = (int) (Math.random() * 4);
		if (testABQ == 1) {
			turnABQ();
		} else {
			Scenes monValley = new Scenes("the beautiful and dusty Monument Valley", 3, 2, 4);
			System.out.println(monValley.getInfo());
		}
	}

	public static void turnABQ() {
		System.out.println("Sorry, must've been that wrong turn in Albuquerque. We're in Santa Fe now.");
		Scenes santaFe = new Scenes("the oldest capital in the U.S. ", 3, 2, 5);
		System.out.println(santaFe.getInfo());
	}

	public static void sceneOne(Scanner input) {
		System.out.println();
		System.out.println("Looks like you can talk to some friends or battle some enemies.");
		System.out.println(
				"\nFoghorn Leghorn is by the big red rock. And the Road Runner just zipped past spiling Chiles out of a large sack");
		System.out.println("\nThere are some funny looking green beings on top of the east mesa."
				+ " Kinda looks like some folks from Roswell.");
		System.out.println("\nBugs Bunny suggests, 'Maybe we talk to some friends first'"
				+ "\n\tWould you like to talk to Foghorn Leghorn (1) or catch up with the Road Runner? (2) ");
		int input1 = input.nextInt();
		if (input1 == 1) {
			GoodGuys fogLeg = new GoodGuys(" Foghorn Leghorn ", 800, 80, " Well I say boy, ");
			System.out.println(fogLeg.getInfo());
			System.out.println("\nThe aliens from Roswell have been stealing Chiles right off the farms.");
			System.out.println("\nBeen running north with them. ");
			System.out.println("\nI'm trying to shake off this little chicken hawk or I'd help more.");
		} else {
			GoodGuys roadRun = new GoodGuys(" the Road Runner ", 900, 80, " Beep, Beep");
			System.out.println(roadRun.getInfo());
			System.out.println("\n Beep, Beep -- I'm trying to gather our Chiles from the thieving Aliens.");
			System.out.println(
					"\n Why do they want our Chiles, you ask? They're taking them to Colorado. \nBeep, Beep... gone.");
		}

	}
}
