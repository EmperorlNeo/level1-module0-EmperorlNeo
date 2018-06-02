import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton boton = new JButton();
		frame.add(boton);
		boton.addActionListener(fc);
		boton.setText("Click For Fortune");
		frame.setSize(300, 300);

	}

	public void showButton() {
		System.out.println("Button Clicked");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random cookie = new Random();
		int c = cookie.nextInt(5);
		JOptionPane.showMessageDialog(null, ".......");
		JOptionPane.showMessageDialog(null, "...I'm thinking...");
		JOptionPane.showMessageDialog(null, "...uuhh...");
		JOptionPane.showMessageDialog(null, ".......");
		JOptionPane.showMessageDialog(null, ".......");
		JOptionPane.showMessageDialog(null, "OH, I got it!➟");
		if (c == 0) {
			JOptionPane.showMessageDialog(null,
					"Come back later...I am sleeping. (Yes, cookies need their sleep too).  Lucky Numbers 28, 33, 46, 5, 15, 2");
		}
		if (c == 1) {
			JOptionPane.showMessageDialog(null,
					"When you squeeze an orange, orange juice comes out - because that's what's inside.  Lucky Numbers 21, 44, 28, 33, 14, 8");
		}
		if (c == 2) {
			JOptionPane.showMessageDialog(null, "You are not illiterate.  Lucky Numbers 49, 35, 6, 11, 17, 42");
		}
		if (c == 3) {
			JOptionPane.showMessageDialog(null,"Some fortune cookie contain no fortune...  Lucky Numbers 34, 7, 8, 23, 10");
		}
		if (c == 4) {
			JOptionPane.showMessageDialog(null, "That wasn't chicken...  Lucky Numbers 25, 5, 9, 17, 37, 44");
		}
	}
}
