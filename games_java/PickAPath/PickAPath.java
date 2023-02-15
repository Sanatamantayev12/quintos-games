
import java.util.Arrays;
import java.util.Scanner;

public class PickAPath {
	public static void main(String[] args) {
		// create the user input scanner object
		Scanner sc = new Scanner(System.in);
		// your code goes here! below this line

		int path = 0; // initialize choice to 0, user has not made any choice yet
		boolean foundTheBaseball = false;

		while (path != -1) {
			String msg = ""; // initialize message to empty String
			Integer[] options = new Integer[] {};

			if (path == 0) {
				/* Part A0: Start your story! */
				msg = "you enter to the monsters' cave and he caught you\n\n"
						+
						"1: you starting to run\n"
						+
						"2: you starting to defending from him\n" +
						"3: you are trying to be a friend with the monster";
				options = new Integer[] { 1, 2, 3 };
			} else if (path == 1) {
				/* Part A1: continue the story */
				msg = "monster start to run up to you\n\n" +

						"4: он тебя поймал\n" +
						"5: ты убежал до выхода";
				options = new Integer[] { 4, 5 };
			} else if (path == 2 || path == 4) {
				msg = "You defend yourself but the monster is too powerful\n\n" +
						"you are dead";
			} else if (path == 3) {
				msg = "you start a discussion\n\n"
						+
						"6: you asked him to not eat you\n" +
						"7: you asked him to let you go\n" +
						"11: You ask him why you live in the cave\n" +
						"12: You ask him where his family";
				options = new Integer[] { 6, 7, 11, 12 };
			} else if (path == 7 && !foundTheBaseball) {
				msg = "I'll let you go if you find my baseball! I lost it somewhere in the cave and can't find it.\n\n" +
						"8: you accept the monster's challenge\n" +
						"9: you say NO!";
				options = new Integer[] { 8, 9 };
			} else if (path == 7 && foundTheBaseball) {
				msg = "The monster gave you a hug and. said thanks for finding my baseball! You left. The End.";
			} else if (path == 9) {
				msg = "You dead";
			} else if (path == 8) {
				msg = "You go to looking for the Baseball" +
						"13: you starting to run around the cave\n" +
						"14: you ask the monster where you can find it";
				options = new Integer[] { 13, 14 };
			} else if (path == 13) {
				msg = "you find it" +
						"3: talk to the monster again";
				options = new Integer[] { 3 };
				foundTheBaseball = true;
			} else if (path == 14) {
				msg = "Monster get mad and killed you";
			} else if (path == 11 || path == 6) {
				msg = "He started tell you his story\n\n";
			} else if (path == 12 || path == 7) {
				msg = "You are dead";
			}
			// prompt the player to make choices
			System.out.println(msg);

			int choice = sc.nextInt();

			if (choice == -1 || Arrays.asList(options).contains(choice)) {
				path = choice;
			} else {
				System.out.println("you made a invalid choice, try again!");
			}

			/* Part B1: check if the player made a valid choice, reject invalid choices */

		}

		sc.close();
		System.exit(0); // exit the program
	}
}
