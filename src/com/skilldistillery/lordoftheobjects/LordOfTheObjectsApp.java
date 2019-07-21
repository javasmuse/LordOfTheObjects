package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LordOfTheObjectsApp {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		openGame(kb);
		for (int i = 0; i < 1; i++) {
			try {
				TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		firstChoice(kb);
		
		

		kb.close();

	}

	public static void openGame(Scanner kb) {
		System.out.println("Hello, What's your name? ");
		String name = kb.next();
		System.out.println();
		System.out.println(name
				+ ", you’re enjoying green enchiladas at Sparky’s in Hatch, New Mexico, "
				+ "\nwhen you over hear Elmer Fudd, a stuttering farmer "
				+ "\nexplaining to the owner, there are no more Chiles to sell. \n"
				+ "\n"
				+ "Wait, it’s July, the Chile season just started, you think, "
				+ "\nhow can there be no more Chiles? \n"
				+ "\n" + "The owner looks sad." + "\n"
				+ "\nPorky Pig is sitting at the table next to you and begins to cry. "
				+ "\n“But, Chiles are my favorite.” \n"
				+ "\n"
				+ "It’s looking dire for New Mexican Chiles you think "
				+ "\nas you take your last delicious bite of enchilada. \n"
				+ "");
	}

	public static String firstChoice(Scanner kb) {
		System.out.println();
		System.out.println("You look around. \n" + "Bug’s Bunny is munching on a carrot near the door. \n"
				+ "Porky Pig is still crying at his table next to yours. \n" + "Elmer Fudd is walking to the door. \n"
				+ "Hmm... you've heard the sopapillas are really good here." + "\n" + "");
		System.out.println("What do you want to do? \n" + "A. Console Porky Pig \n"
				+ "B. Run catch Elmer Fudd and chat with him.\n" + "C. Ask Bug's Bunny, What's Up?\n" + "D. Order Sopapillas");
		String choice = kb.next();
		

		switch (choice) { // insert ability to use lowercase here
		case "A":
			System.out.println(
					"It's so sad. I don't know what I'm going to eat with no New Mexican Chiles. "
					+ "\nThe ones from Colorado are too mild and limp. I'm too upset (sniff) but, if you want to save the Chiles "
					+ "\nthere are friends here.");
			 break;
		case "B":
			System.out.println("It's open season on Chile thieves! That wrascally wrabbit might help you.");
			 break;
		case "C":
			System.out.println("Eh, What's Up, Doc? Do you want to go on a hunt to save the Chiles?");
			break;
		case "D":
			System.out.println("Wow, those sopapillas were delicious. Now I'm too stuffed to do anything.");
			break;
		}
return choice; 			
			
		}

	}

	
