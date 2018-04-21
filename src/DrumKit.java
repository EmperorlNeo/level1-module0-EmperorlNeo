
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

	JLabel Top1;
	JLabel Top2;
	JLabel Middle1;
	JLabel Middle2;
	JLabel Bottom1;
	JLabel Bottom2;
	JLabel Bottom3;
	JLabel Bottom4;
	public static void main(String[] args) throws Exception {
		new DrumKit().getGoing();
	}

	private void getGoing() throws MalformedURLException {
		// 1. Make a JFrame variable and initialize it using "new JFrame()"
		JFrame frame = new JFrame();
		// 2. Make the frame visible
		frame.setVisible(true);
		// 3. Set the size of the frame
		frame.setSize(800, 500);
		// 4. Set the title of the frame
		frame.setTitle("Drum Kit");
		// 5. Make a JPanel and initialize it.
		JPanel panel= new JPanel();
		// 6. Add the panel to the frame. (The panel is invisible.)
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 7. Download an image of a drum from the Internet. Drop it into your Eclipse
		// project under "default package".
		// 8. Put the name of your image in a String variable.
		String drum1 = "drum1.png";
		String drum2 ="drum2.png";
		String drum3 ="drum3.png";
		String drum4 = "drum4.png";
		String drum5 = "drum5.png";
		String drum6 = "drum6.png";
		String drum7 = "drum7.png";
		String drum8 = "drum8.png";
		// 9. Edit the next line to use your String variable
		Top1 = createLabelImage(drum1);
		Top2 = createLabelImage(drum2);
		Middle1 = createLabelImage(drum3);
		Middle2 = createLabelImage(drum4);
		Bottom1 = createLabelImage(drum5);
		Bottom2 = createLabelImage(drum6);
		Bottom3 = createLabelImage(drum7);
		Bottom4 = createLabelImage(drum8);
		// 10. Add the image to the panel
		panel.add(Top1);
		panel.add(Top2);
		panel.add(Middle1);
		panel.add(Middle2);
		panel.add(Bottom1);
		panel.add(Bottom2);
		panel.add(Bottom3);
		panel.add(Bottom4);
		// 11. Set the layout of the panel to "new GridLayout()"
		GridLayout layout = new GridLayout();
		layout.setRows(4);
		panel.setLayout(layout);
		// 12. call the pack() method on the frame
		frame.pack();
		// 13. add a mouse listener to Top1.
		Top1.addMouseListener(this);
		Top2.addMouseListener(this);
		Middle1.addMouseListener(this);
		Middle2.addMouseListener(this);
		Bottom1.addMouseListener(this);
		Bottom2.addMouseListener(this);
		Bottom3.addMouseListener(this);
		Bottom4.addMouseListener(this);
	}

	private Component Component() {
		// TODO Auto-generated method stub
		return null;
	}

	public void mouseClicked(MouseEvent e) {
		// 14. When the mouse is clicked, print "mouse clicked"
		System.out.println("Mouse Clicked");

		JLabel drumClicked = (JLabel) e.getSource();
		// 15. Download a drum sound and drop it into your "default package". You can
		// find it on freesound.org. To download it, log in as
		// leagueofamazing/code4life.
		// 16. If they clicked on the drumImage...
		if(drumClicked.equals(Top1)) {
			playSound("Cymbal2.wav");
		}
		else if(drumClicked.equals(Top2)) {
			playSound("Cymbal2.wav");
		}
		else if(drumClicked.equals(Middle1)) {
			playSound("NormalDrum.wav");
		}
		else if(drumClicked.equals(Middle2)) {
			playSound("NormalDrum.wav");
		}
		else if(drumClicked.equals(Bottom1)) {
			playSound("Cymbal2.wav");
		}else if(drumClicked.equals(Bottom2)) {
			playSound("NormalDrum.wav");
		}
		else if(drumClicked.equals(Bottom3)) {
			playSound("NormalDrum.wav");
		}
		else if(drumClicked.equals(Bottom4)) {
			playSound("NormalDrum.wav");
		}
		// 17. ...use the playSound method to play a drum sound.
		
		// 18. Add more images to make a drumkit. Remember to add a mouse listener to
		// each one.
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
