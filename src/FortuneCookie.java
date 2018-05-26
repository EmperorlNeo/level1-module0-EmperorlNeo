import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton boton = new JButton();
		frame.add(boton);
		boton.addActionListener(fc);

	}

	public void showButton() {
		System.out.println("Button Clicked");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random cookie = new Random();
		int c = cookie.nextInt(5);
		JOptionPane.showMessageDialog(null, "Your fortune...");
		if (c == 0) {
			JOptionPane.showMessageDialog(null,
					"Come back later...I am sleeping. (yes, cookies need their sleep too).  Lucky Numbers 28, 33, 46, 5, 15, 2");
		}
		if (c == 1) {
			JOptionPane.showMessageDialog(null,
					"When you squeeze an orange, orange juice comes out - because that's what's inside.  Lucky Numbers 21, 44, 28, 33, 14, 8");
		}
		if (c == 2) {
			JOptionPane.showMessageDialog(null, "You are not illiterate.  Lucky Numbers 49, 35, 6, 11, 17, 42");
		}
		if (c == 3) {
			JOptionPane.showMessageDialog(null,"");
		}
	}
}
