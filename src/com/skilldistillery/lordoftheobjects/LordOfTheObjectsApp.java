package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LordOfTheObjectsApp {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		openGame(kb);

		for (int i = 0; i < 1; i++) {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		firstChoice(kb);

		secondChoice(kb);

		thirdChoice(kb);

		kb.close();
	}

	public static void openGame(Scanner kb) {
		System.out.println("Hello, What's your name? ");
		String name = kb.next();
		System.out.println();
		System.out.println(name + ", you’re enjoying green enchiladas at Sparky’s in Hatch, New Mexico, "
				+ "\nwhen you overhear Elmer Fudd, a local farmer explaining to the owner, there are no more Chiles to sell. \n"
				+ "\n"
				+ "Wait, it’s July, the Chile season just started, you think, how can there be no more Chiles? \n"
				+ "\n" + "The owner looks sad." + "\n"
				+ "\nPorky Pig is sitting at the table next to you and begins to cry. "
				+ "\n“But, Chiles are my favorite.” \n" + "\n" + "It’s looking dire for New Mexican Chiles you think "
				+ "\nas you take your last delicious bite of enchilada. \n" + "");
	}

	public static void firstChoice(Scanner kb) {
		System.out.println();
		System.out.println("You look around. \n" + "Bug’s Bunny is munching on a carrot near the door. \n"
				+ "Porky Pig is still crying at his table next to yours. \n" + "Elmer Fudd is walking to the door. \n"
				+ "Hmm... you've heard the sopapillas are really good here." + "\n" + "");
		System.out.println("What do you want to do? \n" + "A. Console Porky Pig \n"
				+ "B. Run catch Elmer Fudd and chat with him.\n" + "C. Ask Bug's Bunny, What's Up?\n"
				+ "D. Order Sopapillas");
		String choice = kb.next();

		switch (choice) { // insert ability to use lowercase here -- or maybe use numbers and an if
							// statement-
		case "A":
			System.out.println("\nIt's so sad. I don't know what I'm going to eat with no New Mexican Chiles. "
					+ "\nThe ones from Colorado are too mild and limp. I'm too upset (sniff) but, if you want to save the Chiles "
					+ "\nthere are friends here.\n");
			break;
		case "B":
			System.out.println("\nIt's open season on Chile thieves! That wrascally wrabbit might help you.\n"
					+ "");
			break;
		case "C":
			break;
		case "D":
			System.out.println("\nWow, those sopapillas were delicious. Now I'm too stuffed to do anything.");
			System.out.println(" Game Over - if you would like to play again re-run");
			System.exit(0);
			break;
		}

	}

	public static void secondChoice(Scanner kb) {
		GoodGuys bugsBunny = new GoodGuys ("Bugs Bunny", 1000, 100, "What's up Doc?");
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
		System.out.println("Doc, I think best path is to Monument Valley. I heard of some folks carrying\n"
				+ "sacks of Chiles up there.");
	}

}
