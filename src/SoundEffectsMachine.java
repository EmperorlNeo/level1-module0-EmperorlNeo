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
		SoundEffectsMachine sem = new SoundEffectsMachine();
//Input the UI				
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setSize(70, 270);
		frame.setLocation(700, 500);
		
		panel.add(button);
		button.setText("Ballon Pop");

		JButton button2 = new JButton();
		panel.add(button2);
		button2.setText("Glass Break");

		JButton button3 = new JButton();
		panel.add(button3);
		button3.setText("Car Screech");

		JButton button4 = new JButton();
		panel.add(button4);
		button4.setText(" Screams ");

		JButton button5 = new JButton();
		panel.add(button5);
		button5.setText("Applause");

		JButton button6 = new JButton();
		panel.add(button6);
		button6.setText("Baby Laugh");

		JButton button7 = new JButton();
		panel.add(button7);
		button7.setText("Fireworks");

	}
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();

	}
}
