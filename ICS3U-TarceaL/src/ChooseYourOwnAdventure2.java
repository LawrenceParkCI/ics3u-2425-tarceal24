import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

/**
 * Description: Choose your own adventure game Date:
 * 
 * @author Luca Tarcea + Gavin Chester
 */

public class ChooseYourOwnAdventure2 {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		// Declaring Variables
		String floor, search, door, suit, face;
		int key, boxCode, boxCodeGuess, basementCode, basementCodeGuess, card, faceRandom, suitRandom;
		boolean running = false, searchKey; // change running value
		boolean retreat;

		do { // loop to run the whole game again

			// Start of game
			System.out.println("You have just woken up in a gloomy apartment building.. \n"
					+ "All you can remember is being chased by a masked group on your way home from work.. \n"
					+ "Where will your story take you? ");

			System.out.println("\n");
			System.out.println("Which floor would you like to go to?");
			System.out.println("\tMain\t  Second\n");
			floor = sc.nextLine();

			if (floor.contains("main")) {
				System.out.println(
						"You see two doors on this floor, one on the left and one on the right. Which door would you like to go to?");
				System.out.println("\tLeft\t  Right");
				door = sc.nextLine();
				// Left door
				if (door.equalsIgnoreCase("left")) {
					System.out.println(
							"You find the door is locked. You could commit and search for the key, or go to the other door. Would you like to search for the key?");
					System.out.println("\tYes\t  No");
					searchKey = sc.nextLine().equalsIgnoreCase("yes");

					// Search for key
					if (searchKey) {
						System.out.println(
								"You see some loose floorboards and suspiciously placed paintings.\nWhere would you like to search?");
						System.out.println("\tFloorboards\tPaintings");
						search = sc.nextLine();
						key = (int) (Math.random() * 5); // Chance to find key or not

						// Under floorboards
						if (search.equalsIgnoreCase("floorboards")) {
							if (key == 0) { // success
								System.out.println("You find the key to the door.\n"
										+ "Once entering the room, you find a way to escape (key to the entrance."); // edit
								// this
								System.out.println("Would you like to play again? (True or False)");
								running = sc.nextBoolean();

							} else { // failure
								System.out.println(
										"You pry open the floorboard, but there is no key underneath. You rush quickly to the paintings to search"
												+ " there before its too late, managing to rip it off the wall. A key!\n"
												+ "You can only hope that this opens the door, but before you can grab it, a chill goes down your spine, and you"
												+ " sense a presence behind you. You turn around and a strange spirit lies in front of you. Your vision goes"
												+ " faint, and your head starts hurting before your vision fades to black. Perhaps you saw too much."); // edit
								System.out.println(
										"You have failed to escape. Would you like to play again? (True or False)");
								running = sc.nextBoolean();

							}
						}

						// Behind paintings
						else {
							if (key > 0) { // success
								System.out.println("Behind the paintings, you find a key and it fits the lock.\n"
										+ "Once entering the room, you find a way to escape (key to the entrance.)"); // edit
								// this
								System.out.println("Would you like to play again? (True or False)");
								running = sc.nextBoolean();

							} else { // failure
								System.out.println(
										"There is no key behind the paintings, too much times passes and a spirit attacks."); // edit
								System.out.println("Would you like to play again? (True or False)");
								running = sc.nextBoolean();

							}
						}
					} else {
						door = "right"; // go to the right door
						System.out.println("There's no time for this, you think to yourself as you head to the other door.");
					}
				}

				// Right door
				if (door.equalsIgnoreCase("right")) {
					System.out.println(
							"You open the door and in front of you is an office. Where would you like to search?");
					System.out.println("\tDesk\t  Dresser");
					search = sc.nextLine();
					// Search in dresser
					if (search.equalsIgnoreCase("dresser")) {
						boxCode = (int) (Math.random() * 5); // Generating correct code of box
						System.out.println("Inside the dresser, there is a suspicious box with a code on it.\n"
								+ "The only options are 0-4. What could it be?"); // edit?
						System.out.println("You notice you have three tries before it locks forever.");
						for (int i = 0; i < 3; i++) { // loop for guessing the code
							System.out.println("What is your guess?");
							boxCodeGuess = sc.nextInt();
							if (boxCodeGuess == boxCode) {
								System.out.println(
										"You have guessed correctly and inside the box is a key to the entrance.\n" // edit
												+ "You take it with you and rush to the entrance to escape, never to look back."); // survival
								System.out.println("Would you like to play again? (True or False)");
								running = sc.nextBoolean();

								break;
							} else if (i == 2) {
								System.out.println("The box makes a loud sound and releases a green gas from it.\n" // edit
										+ "You try not to breathe it in, but oxygen is running out, and you slowly fall asleep."); // death
								System.out.println("Would you like to play again? (True or False)");
								running = sc.nextBoolean();

							}
						}
					}
					// Search in desk
					else {
						System.out.println(
								"There is nothing in the desk, but you sense a presence behind you before everything turns dark"); // death
						System.out.println("Would you like to play again? (True or False)");
						running = sc.nextBoolean();

					}
				} else {
					System.out.println("That is not an option");
				}
			}

			// Second Floor
			else if (floor.contains("second")) {
				System.out.println(
						"You climb up the stairs and reach the second floor. Once arriving, you notice there are no doors on this floor, but only books! "
								+ "Surely this can't be all there is on the second floor...\n"
								+ "After desperately searching for what feels like hours, you see a book out of place."
								+ "You decide to take it our, but it doesn't budge, instead the wall opens and the you press onward.\n"
								+ "There is only darkness inside, and you wonder if this is a good idea.\n\n"
								+ "You have entered a secret room! What would you like to do?");
				System.out.println("\tTurn on the lights\t\tGo back\n");
				retreat = sc.nextLine().contains("go back");
				if (!retreat) { // stay in the room
					System.out.println(
							"It's too late to go back, you think to yourself as you search for a light switch. "
									+ "You find one quickly, but you're not sure you are happy with your choice after turning it on.\n"
									+ "All across the walls, ceiling and floor are strange markings that make you feel dizzy "
									+ "and you can't put off the feeling of uneasiness that settles over you.\n"
									+ "You sense that this is your last chance to leave all this behind before it's too late. "
									+ "What would you like to do?");
					System.out.println("\tInvestigate the markings\t\tGo back!\n");
					retreat = sc.nextLine().contains("go back");
					if (!retreat) { // investigate markings
						System.out.println(
								"It's too late to turn back, you convice yourself, exploring the room. In the middle of the room there is a desk, "
										+ "and on it a blank piece of paper and a lighter. You wonder if they could be useful clues.\n"
										+ "What would you like to do?");
						System.out.println("\tBurn the paper\t\tContinue investigating\n");
						retreat = sc.nextLine().equalsIgnoreCase("continue investigating");
						if (!retreat) { // burn
							System.out.println(
									"Those items are too suspiciously placed to not be of use. You take the lighter in one hand and the paper in the other "
											+ "before setting fire to the paper.\n"
											+ "Once the paper is completely ash, you feel a splitting headache and hear a voice in your head begin to speak:\n"
											+ "\"The seal has been undone. Escape while you still can.\"\n");
							System.out.println(
									"Before you have any time to think, a facedown deck of cards appears on the desk; the voice continues:\n"
											+ "\"This deck is your only lifeline, draw from it to live. If you get a face card, you may live, if not you will perish.\"\n"
											+ "Too nervous to think or even question what is happening, and you begin drawing from the deck.");
							for (int i = 0; i < 3; i++) { // loop to draw from deck
								card = (int) (Math.random() * 52);
								suitRandom = (int) (Math.random() * 4); // determines the suit
								if (suitRandom == 0) {
									suit = "diamonds";
								} else if (suitRandom == 1) {
									suit = "spades";
								} else if (suitRandom == 2) {
									suit = "clubs";
								} else {
									suit = "hearts";
								}
								System.out.println(card);
								System.out.println(suitRandom);
								if (card > 13) { // failure
									if (i == 1)
										System.out.println("You drew a " + (int) (Math.random() * 9 + 2) + " of " + suit
												+ ". You have " + (2 - i) + " try left.");
									else
										System.out.println("You drew a " + (int) (Math.random() * 9 + 2) + " of " + suit
												+ ". You have " + (2 - i) + " tries left.");
								} else { // success
									faceRandom = (int) (Math.random() * 4); // determines the specific card
									if (faceRandom == 0) {
										face = "jack";
									} else if (faceRandom == 1) {
										face = "queen";
									} else if (faceRandom == 2) {
										face = "king";
									} else {
										face = "ace";
									}
									System.out.println("You drew a " + face + " of " + suit);
									if (face.equals("ace")) {
										System.out.println("You drew an " + face + " of " + suit);
									}
									System.out.println(
											"The wall in front of you shimmers and slowly becomes translucent. Right before your eyes, it dissapears and in front of you, lies a tunnel.\n"
											+ "You rush through it without a second thought as you hear the voice again in your head laughing. You are still clueless as to what is going on here, "
											+ "but at least you escaped with your life.");
									System.out.println("Would you like to play again? (True or False)");
									running = sc.nextBoolean();
								}
								Thread.sleep(3000);
							}
							System.out.println("Your vision is black, and you can hear your heartbeat. Your ears stop working and you would think you were dead if not fo the ground under your feet.\n"
									+ "Eventually, even the feeling in your body disappears, and your consciousness fades as you fall asleep.");
							card = sc.nextInt();
							running = sc.nextBoolean();
						} else if (retreat) { // investigate
							System.out.println(
									"This doesn't help at all, you think as you continue searching the room. Surely there is some sort of secret in here that you can find to leave.\n"
											+ "Suddenly, you hear the door to the secret room open, and you turn around to see what's going on. The lights turn off again and you're shrouded in darkness."
											+ "You feel a chill go down your spine, before you fall fast asleep, never to wake up again."); // death
							System.out.println("Would you like to play again? (True or False)");
							running = sc.nextBoolean();
						}
					} else { // leave the room
						System.out.println(
								"No way you want to be mixed in with some cult, you think to yourself as you go back the way you came. Those markings are too suspicious to risk your life for.\n"
										+ "Once you return to the main floor, you see another set of stairs that wasn't there before, one that leads to the basement. The same markings from before are on the"
										+ "walls leading down.\n" + "What would you like to do?\n");
						System.out.println("\tProceed\t\tGo Back!!");
						retreat = sc.nextLine().contains("go back");
						if (!retreat) {
							System.out.println(
									"Maybe there is something you can discover to get yourself a promotion, and with that, you go down the stairs into the darkness.\n"
											+ "After a few minutes of walking down, you find yourself face to face with a door with a code necessary to enter it. The options are 0-9.\n"
											+ "What could the code be?");
							basementCode = (int) Math.random() * 10;
							basementCodeGuess = basementCode; // sc.nextInt(); // change
							if (basementCodeGuess == basementCode) { // success
								System.out.println(
										"You miraculously guessed the right code, and you don't stop to think of what could've happened if you failed.\n"
												+ "The room is filled with bookshelves and cabinets and an exit! You decide to start reading after locking the door behind you...\n\n");
								Thread.sleep(3000);
								System.out.println(
										"After reading for a while, you discover the truth about this place, a strange cult is trying to ressurect some sort of godly being,"
												+ " and they've managed to recruit a spirit on their side to protect them. You rush out the exit with the documents, hoping to report this to your boss.\n"
												+ "Maybe you'll get that promotion after all."); // survival + edit
								System.out.println("Would you like to play again? (True or False)");
								running = sc.nextBoolean();

							} else { // failure
								System.out.println(
										"A loud sound comes from the door, one that makes your ears ring. You have a feeling that whatever it is that made that sound is something that isn't from your world.\n"
												+ "Before you can try to enter a different code, a shiver goes down your spine as you feel something go through you, but you look around and there's nothing there.\n"
												+ "You try to ask if anyone is there, but your voice doesn't come out, and you try to breathe, but no air enters your lungs. You try and enter a code quickly before it's too late\n"
												+ "What would you like to enter?");
								basementCodeGuess = sc.nextInt();
								System.out.println(
										"It is too late though. And your vision slowly turns dark and yor body goes limp."); // death
								System.out.println("Would you like to play again? (True or False)");
								running = sc.nextBoolean();
							}
						} else {
							System.out.println(
									"Why would you choose to follow the markings after already backing off once? You go to try open the door on the left, but it's locked."
											+ "You try the door on the right, and it's unlocked!\n"
											+ "You open the door, but the only thing behind is a brick wall, what could this mean? You turn around to search elsewhere, but behind you is an otherworldly spirit."
											+ "You try and run from it, but it catches up to you in a second and run straight through you.\n"
											+ "You feel the air in your lungs leave, and you try to breathe, but to no avail. Your vision slowly fades to black."); // death
							System.out.println("Would you like to play again? (True or False)");
							running = sc.nextBoolean();
						}
					}
				} else { // leave the room
					System.out.println(
							"It's too dangerous to search in this dark building for the lights, you think to yourself and leave the room. You go and see if there is anywhere else to search on the second floor.\n"
									+ "You don't search for long though, as a you hear snarling and a feet running toward you from behind. You turn to look and as soon as you do a feral dog jumps onto you and bits your arm.\n"
									+ "You scream in pain and try to shake it off you, but it is relentless, and your blood drains from your body before your eyes close."); // death
					System.out.println("Would you like to play again? (True or False)");
					running = sc.nextBoolean();
				}
			}
		} while (running == true);
		Thread.sleep(3000);
		sc.close();
	}
}
