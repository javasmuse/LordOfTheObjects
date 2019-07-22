package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LordOfTheObjectsApp {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int[] points = new int[] { 0, 100 };

		openGame(kb);

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		firstChoice(kb);

		secondChoice(kb);

		thirdChoice(kb);

		fightScene(points);
		
		try { // a little delay for effect..............
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sceneTwo(kb);
		try { // a little delay for effect..............
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		fightScene(points);
		
		try { // a little delay for effect..............
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sceneThree();
		try { // a little delay for effect..............
			TimeUnit.SECONDS.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		fightScene(points);

		try { // a little delay for effect..............
			TimeUnit.SECONDS.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		mesaVerdeFight(points);

		kb.close();
	}

	public static void openGame(Scanner name) {
		System.out.println("Hello, What's your name? ");
		String name1 = name.nextLine();
		System.out.println();
		System.out.println(name1 + ", you’re enjoying green enchiladas at Sparky’s in Hatch, New Mexico, "
				+ "\nwhen you overhear Elmer Fudd, a local farmer explaining to the owner, there are no more Chiles to sell. \n"
				+ "\n"
				+ "Wait, it’s July, the Chile season just started, you think, how can there be no more Chiles? \n"
				+ "\n" + "The owner looks sad." + "\n"
				+ "\nPorky Pig is sitting at the table next to you and begins to cry. "
				+ "\n“But, Chiles are my favorite.” \n" + "\n" + "It’s looking dire for New Mexican Chiles you think, "
				+ "as you take your last delicious bite of enchilada. \n" + "");
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
		GoodGuys bugsBunny = new GoodGuys("Bugs Bunny", 1000, 100, "Eh, What's up Doc?");
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
				"\nEh Doc, I think the best path is to Monument Valley. I heard of some folks carrying sacks of Chiles up there.");
		tunneling();
	}

	public static void tunneling() {
		int testABQ = (int) (Math.random() * 4);
		if (testABQ == 1) {
			turnABQ();
		} else {
			Scenes monValley = new Scenes("the beautiful and dusty Monument Valley", 3, 2, 4);
			System.out.println(monValley.getInfo());
			sceneOne();
		}
	}

	public static void turnABQ() { // bonus scene
		Scanner kb = new Scanner(System.in);
		System.out.println("\nSorry, must've been that wrong turn in Albuquerque. We're in Santa Fe now.\n");
		Scenes santaFe = new Scenes("the oldest capital in the U.S. ", 3, 2, 5);
		System.out.println(santaFe.getInfo());
		System.out.println();
		System.out.println("\nYou see the Tazmanian devil in the old plaza, terrorizing tourists.");
		System.out.println("\nPepe le Phew is sitting on a bench wooing unsuspecting tourists.\n");
		System.out.println("\nBugs Bunny wrinkles his nose at the sight of Pepe and says"
				+ "\nEh, we don't want to get too close to Pepe and Taz isn't much for talking\n"
				+ "Let's look at the headlines on the newspaper.");
		System.out.println("\n**** Santa Fe Journal **** Extra, Extra -- the Roswell Aliens are real."
				+ "\n And their stealing our Chiles and taking them north.\n");
		System.out.println("\n You catch a glimpse of some Aliens with a bag of Chiles heading out of town.");
		System.out.println("Bugs Bunny says, 'Eh Doc, I think we need to move along, but could you run grab"
				+ "\n the Chiles from those Aliens first? I'll wait here. \n");
		System.out.println(
				"\n You think to youself, well I'd been hoping since we're here, I could pop into the Shed for a Silver Coin Margarita.");
		System.out.println("Go after the Aliens (1) or pop into the Shed for a Margaritta? (2)");
		int input = kb.nextInt();
		kb.close();
		if (input == 1) {
			System.out.println("You run right past the the Shed in pursuit of the Aliens.\n");

		} else {
			System.out.println(
					"Looks like a sip of the southwest won over adventure, luckily there's still plenty of tequilla.");
			System.out.println(" Game Over - if you would like to play again re-run");
			System.exit(0);
		}

	}

	public static void sceneOne() {
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Looks like you can talk to some friends or battle some enemies.");
		System.out.println(
				"\nFoghorn Leghorn is by the big red rock. And the Road Runner just zipped past spiling Chiles out of a large sack");
		System.out.println("\nThere are some funny looking green beings on top of the east mesa."
				+ " Kinda looks like some folks from Roswell.");
		System.out.println("\nBugs Bunny suggests, 'Eh, Doc, maybe we should talk to some friends first.'"
				+ "\n\tWould you like to talk to Foghorn Leghorn (1) or catch up with the Road Runner? (2) ");
		int input1 = input.nextInt();
		if (input1 == 1) {
			GoodGuys fogLeg = new GoodGuys(" Foghorn Leghorn ", 800, 80, " \nWell I say boy, ");
			System.out.println(fogLeg.getInfo());
			System.out.println("\nThe aliens from Roswell have been stealing Chiles right off the farms.");
			System.out.println("Been running north with them. ");
			System.out.println("I'm trying to shake off this little chicken hawk or I'd help more.\n");
		} else {
			GoodGuys roadRun = new GoodGuys(" the Road Runner ", 900, 80, " Beep, Beep");
			System.out.println(roadRun.getInfo());
			System.out.println("\n Beep, Beep -- I'm trying to gather our Chiles from the thieving Aliens.");
			System.out.println(
					"\n Why do the aliens want our Chiles, you ask? They're taking them to Colorado. \nBeep, Beep... gone.\n\n");
		}
		System.out.println(
				"Bugs Bunny say's 'Eh Doc, I think you should go get the Chiles from those Roswell Aliens. Hmmm....?' "
						+ "\nWe can't just take them, though, there might be a litle fight. I'll wait here for you.");
		System.out.println(
				"\nDo you want to go get the Chiles from the Roswell Aliens? (1) or are you thinking of those sopapillas or maybe even some fry bread (2)?");
		int input3 = input.nextInt();
		input.close();
		if (input3 == 1) {
			System.out.println(
					"You hear cheering from a troupe of Looney Toons as you head up the east mesa to confront the Aliens.");
			System.out.println("\nSAVE THE CHILES they shout! \n");

		} else {
			System.out.println("Looks like dessert won over adventure, luckily there's still plenty of sopapillas.");
			System.out.println(" Game Over - if you would like to play again re-run");
			System.exit(0);
		}
	}

	public static void sceneTwo(Scanner input) {
		System.out.println();
		Scenes taos = new Scenes("Rio Grande Gorge", 2, 2, 4);
		System.out.println(taos.getInfo());
		System.out.println("\nBeautiful sweeping views of the little Rio Grande");
		System.out.println(
				"You see Tweety Bird flying over the canyon towards you. And near the rim you can hear Daffy Duck quacking at the river");
		System.out.println();
		System.out.println();
		GoodGuys tweetyB = new GoodGuys("Tweety", 400, 100, "I tawt, I taw an alien, I did, I did taw an alien!");
		System.out.println(tweetyB.getInfo());
		System.out.println("And he's right behind you! ");
		System.out.println("\nAs you turn to face the Alien, you hear the Looney Toons Cheer - \n SAVE THE CHILES\n");
		System.out.println();
	}

	public static void sceneThree() {
		System.out.println();
		Scenes forCorners = new Scenes("Four Corners", 2, 3, 4);
		System.out.println(forCorners.getInfo());

		System.out.println("\nYou see a coyote walking upright with an Acme box \n and a large black and white cat lounging in the Utah corner.\n");
		System.out.println("Bugs Bunny says, we know the Chiles are being stolen and taken north, but to where and why?");
		System.out.println();
		GoodGuys coyote = new GoodGuys("Wyle E. Coyote", 200, 50, "Hands you a printed card with his name.");
		System.out.println(coyote.getInfo());
		System.out.println("I'd like to help, but I must set up my secret Acme Alien trap first.");
		System.out.println("Hee, hee, I've got a rocket to blast us right to Mesa Verde, where their hiding our Chiles!");
		System.out.println();
		GoodGuys sylvester = new GoodGuys("Sylvester", 500, 100, "Looking for Tweety");
		System.out.println(sylvester.getInfo());
		System.out.println("The Aliens are taking our Chiles up to Marvin the Martian in Mesa Verde.");
		System.out.println("I'd rather eat Tweety. Have you seen him?");
		System.out.println(
				"\nBugs Bunny points out some Aliens standing on the corner of Arizona, just past a fry bread stand");
		System.out.println(
				"Eh, Doc, I heard the tourists say, Marvin the Martian is behind the Chile thefts. He's fencing them to Colorado.");
		System.out.println(
				"The Pueblo Chiles just aren't as good and they figured they could sell ours under their label this year.");
		System.out.println(
				"Then everyone will think Colorado Chiles are the bomb and next year Colorado will get all the Chile sales and Chile glory worldwide.");
		System.out.println(
				"\nWe can't let that happen, I'll wait here while you rough up those Aliens, and they we're off to Mesa Verde");
		System.out.println(
				"\nDarn the fry bread smells good though. Not now though. Going after the Aliens.  ");
		System.out.println("\nSuddenly the troupe of Looney Toons appears and cheers -- SAVE THE CHILES\n");
		}
	

	public static int[] fightScene(int[] points) {

		int R1, R2, R3, R4; // r1 & r2 is player rolling, r3 &r4 is bad guy rolling
		int playerExp = points[0];
		int playerH = points[1];
		int bgH = 100;

		do {
			try { // a little delay for effect..............
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("You STRIKE at the Roswell Aliens!");
			R1 = (int) (1 + (int) 5 * Math.random());
			if (R1 < 2) { // no hit
				System.out.println("\tYou MISSED!....");
			} else {
				R2 = (int) (1 + (int) 15 * Math.random());
				System.out.println("\tYou GOT THEM!..  Aliens loose " + R2 + " Health points!");
				bgH = bgH - R2;
				if (bgH <= 0) {
					playerExp = playerExp + 100;
					playerH = playerH + 80;
					System.out.println("\t\tAliens DIE... You and Bugs get to continue.");
					System.out.println("\t\tYou get 100 bags of Chilis !!");
					System.out.println("\t\t Your Health points are : " + playerH);
					points[0] = playerExp;
					points[1] = playerH;
					return (points);
				}
			}
			System.out.println("Aliens STRIKE at YOU!...");
			R3 = (int) (1 + (int) 10 * Math.random());
			if (R3 < 4) {
				System.out.println("\tThey MISSED!... you :-) ");
			} else {
				R4 = (int) (1 + (int) 15 * Math.random());
				System.out.println("\tThey Got A HIT on you.... You loose " + R4 + " Health points.");
				playerH = playerH - R4;
			}
			System.out.println("YOUR HEALTH POINTS are: " + playerH);
			if (playerH < 1) {
				System.out.println("You have lost too many points and LOOSE GAME..");
				Loose();
			}
		} while (playerH > 0 && bgH > 0);
		points[0] = playerExp;
		points[1] = playerH;
		return (points);
	}

	private static void mesaVerdeFight(int[] points) {
		int R1, R2, R3, R4;

		int playerH = points[1];
		int mMh = 500;

		System.out.println("\nLow and Behold...  It's Yosemite Sam and Daffy Duck");
		System.out.println("They have been watching as a lot of aliens have been smuggling");
		System.out.println("in Chiles and know they come from Hatch.  They also saw Marvin the Martian flying around!");
		System.out.println("They suggest you might want to eat some of those delicious Chiles");
		System.out.println("you have been collecting to build up your HEALTH before");
		System.out.println("you go up against Marvin the Martian....");
		System.out.println("Bugs agrees and you eat some 'Chiles' to get your Health up..");
		playerH = playerH + 250;
		try { // a little delay for effect..............
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After eating some Healthy Chiles you now have: " + playerH + " points.\n\n");
		do {
			System.out.println("You STRIKE at Marvin !!");
			R1 = (int) (1 + (int) 10 * Math.random());
			if (R1 < 5) { // no hit
				System.out.println("\tYou MISSED!....");
			} else {
				R2 = (int) (10 + (int) 35 * Math.random());
				System.out.println("\tYou GOT a HIT !..  Marvin looses " + R2 + " Health points!");
				mMh = mMh - R2;
				if (mMh <= 0) {
					try { // a little delay for effect..............
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("\t\tMarvin the Martian DIES... You and the Gang Won.");

					WinBig();
					break;
				}
			}
			System.out.println("Marvin STRIKES at YOU!...");
			R3 = (int) (1 + (int) 10 * Math.random());
			if (R3 < 5) {
				System.out.println("\tHe MISSED!... you :-) ");
			} else {
				R4 = (int) (10 + (int) 35 * Math.random());
				System.out.println("\tHe Got A HIT on you.... You loose " + R4 + " Health points.");
				playerH = playerH - R4;
				try { // a little delay for effect..............
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("YOUR HEALTH POINTS are: " + playerH + "\n\n");
			if (playerH < 1) {
				System.out.println("You have lost too many points and LOOSE GAME..");
				LooseFinal();
			}

		} while (playerH > 0 && mMh > 0);

	}

	private static void LooseFinal() {
		System.out.println("\n BAD NEWS.....\n Marvin the Martian wins and now the Evil Coloradians");
		System.out.println(
				"will pass New Mexican Chiles as their own and become famous for the BEST CHILES in the world\n\tMaybe you should avoid New Mexico ");
		System.out.println("and hope Yosemite Sam doesn't fill your backside with lead....");
		System.out.println(" Game Over - if you would like to play again re-run");
		System.exit(0);

	}

	private static void WinBig() {
		System.out.println(
				"YOU SAVED THE DAY \n Cue the music\nand bring out the chorus of Looney Tune Characters.........");

	}

	private static void Loose() {
		System.out.println("Dude .. YOU LOST \nYou got beat by some LITTLE ROSWELL ALIENS!!");
		System.out.println("Maybe it's best to avoid the Land of Enchantment for a while.....");
		System.out.println("\n Game Over - if you would like to play again re-run");
		System.exit(0);
		;
	}

}
