package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		int i = new Random().nextInt(4);
		// 3. Print out this variable
		System.out.println(i);
		// 4. Get the user to enter something that they think is awesome
		String thing = JOptionPane.showInputDialog("Please name something that you think is awesome!");
		// 5. If the random number is 0
		if (i == 0) {
			// -- tell the user whatever they entered is awesome!
			JOptionPane.showMessageDialog(null, thing + " is awesome!");
			// 6. If the random number is 1
		} else if (i == 1) {
			// -- tell the user whatever they entered is ok.
			JOptionPane.showMessageDialog(null, thing + " is ok.");
			// 7. If the random number is 2
		} else if (i == 2) {
			// -- tell the user whatever they entered is boring.
			JOptionPane.showMessageDialog(null, thing + " is boring.");
			// 8. If the random number is 3
		} else {
			// -- write your own answer
			JOptionPane.showMessageDialog(null, thing + " is the worst thing I've seen in my entire life!");
		}
	}
}
