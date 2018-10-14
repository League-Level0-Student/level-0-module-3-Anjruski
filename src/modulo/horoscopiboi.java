package modulo;

import javax.swing.JOptionPane;

public class horoscopiboi {
public static void main(String[] args) {
	
String answer = JOptionPane.showInputDialog("What is your horoscope?");

	if (answer .equals("Aries")) {
		JOptionPane.showMessageDialog(null, "Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
	}
	else if (answer .equals("Taurus")) {
		JOptionPane.showMessageDialog(null, "Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
	}
	else if (answer .equals("Gemini")) {
		JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous.");
	}
	else if (answer .equals("Cancer")) {
		JOptionPane.showMessageDialog(null, "Emotional, group oriented, seeks security, family.");
	}
	else if (answer.equals("Leo")) {
		JOptionPane.showMessageDialog(null, "Generous, organized, protective, beautiful.");
	}
	else if (answer .equals("Virgo")) {
		JOptionPane.showMessageDialog(null, "Particular, logical, practical, sense of duty, critical.");
	}
	else if (answer.equals("Libra")) {
		JOptionPane.showMessageDialog(null, "Balanced, seeks beauty, sense of justice.");
	}
	else if (answer .equals("Scorpio")) {
		JOptionPane.showMessageDialog(null, "Passionate, exacting, loves extremes, combative, reflective.");
	}
	else if (answer .equals("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "Happy, absent minded, creative, adventurous.");
	}
	else if (answer.equals("Capricorn")) {
		JOptionPane.showMessageDialog(null, "Timeless, driven, calculating, ambitious.");
	}
	else if (answer .equals("Aquarius")) {
		JOptionPane.showMessageDialog(null, "Forward thinking, communicative, people oriented, stubborn, generous, and dedicated. It's me!");
	}
	else if (answer .equals("Pisces")) {
		JOptionPane.showMessageDialog(null, "Likeable, energetic, passionate, sensitive.");
	}
	else {
		JOptionPane.showMessageDialog(null, "That is not a horoscope!");
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}