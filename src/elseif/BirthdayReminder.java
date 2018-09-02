
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String moms = "Febuary 25th";
		String dads = "September 16th";
		String drews = "Febuary 7th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String answer = JOptionPane.showInputDialog("mine (drew) moms or dads?");
		// 3. Print out what the user typed
		System.out.println(answer);
		// 4. if user asked for "mom"
		if (answer.equals("moms")) {
			JOptionPane.showMessageDialog(null, "Febuary 25th");
		}
		// 5. if user asked for "dad"
		if (answer.equals("dads")) {
			JOptionPane.showMessageDialog(null, "September 16th");
		}
		// 6. if user asked for your name
		if (answer.equals("drews")) {
			JOptionPane.showMessageDialog(null, "Febuary 7th");
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else JOptionPane.showMessageDialog(null, "sorry, I don't know that person's birthday.");
	} 
}
