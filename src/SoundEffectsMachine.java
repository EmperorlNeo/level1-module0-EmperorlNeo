import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JButton button = new JButton();

	public static void main(String[] args) {
		new SoundEffectsMachine().createUI();

	}

	private void createUI() {

		frame.setVisible(true);

		frame.add(panel);
		frame.setSize(70, 270);
		frame.setLocation(700, 500);

		panel.add(button2);
		button2.addActionListener(this);
		button2.setText("Glass Break");

		panel.add(button3);
		button3.addActionListener(this);
		button3.setText("Car Screech");

		panel.add(button4);
		button4.addActionListener(this);
		button4.setText(" Scream ");

		panel.add(button5);
		button5.addActionListener(this);
		button5.setText("Applause");

		panel.add(button6);
		button6.addActionListener(this);
		button6.setText("Baby Laugh");

		panel.add(button7);
		button7.addActionListener(this);
		button7.setText("Fireworks");

		panel.add(button8);
		button8.addActionListener(this);
		button8.setText("Ballon Pop");
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		// System.out.println("press");
		if (buttonPressed == button2) {
			// System.out.println("Glass");
			playSound("GlassBreak.wav");
		}
		if (buttonPressed == button3) {
			playSound("CarScreech.wav");
		}
		if (buttonPressed == button4) {
			playSound("Screams.wav");
		}
		if (buttonPressed == button5) {
			playSound("Applause.wav");
		}
		if (buttonPressed == button6) {
			playSound("BabyLaugh.wav");
		}
		if (buttonPressed == button7) {
			playSound("Fireworks.wav");
		}
		if (buttonPressed == button8) {
			playSound("BallonPop.wav");
		}
	}
}
