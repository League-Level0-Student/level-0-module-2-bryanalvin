//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below.
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		int randomChoice = 0;
		Random Keshin = new Random();
		randomChoice = Keshin.nextInt(6);
		// 3. Print out this variable
		System.out.println(randomChoice);

		// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showMessageDialog(null, "Who is the best?");
		// 5. If the random number is 0

		// -- tell the user "Yes"
		if (randomChoice == 0) {
			JOptionPane.showMessageDialog(null, "Hayato-Kun");
		}
		// 6. If the random number is 1

		// -- tell the user "No"
		if (randomChoice == 1) {
			JOptionPane.showMessageDialog(null, "Chiharu-Chan");
		}
		// 7. If the random number is 2

		// -- tell the user "Maybe you should ask Google?"
		if (randomChoice == 2) {

			JOptionPane.showMessageDialog(null, "Saki-San");
		}
		// 8. If the random number is 3

		// -- write your own answer
		if (randomChoice == 3) {
			JOptionPane.showMessageDialog(null, "Katashi-Sensei");
		}

		if (randomChoice == 4) {
			JOptionPane.showMessageDialog(null,"Makame-Chan");
		}
		if (randomChoice == 5) {
			JOptionPane.showMessageDialog(null,"Satomi-Chan");
		}
	}
}
