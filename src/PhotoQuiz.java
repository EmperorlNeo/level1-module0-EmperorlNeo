/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.awt.Frame;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		
		// 2. create a variable of type "Component" that will hold your image
		// Component image = Component();
		Component image;
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 3. use the "createImage()" method below to initialize your Component
		image= createImage("https://www.thenation.com/wp-content/uploads/2016/01/obama_sotu_2016_ap_img.jpg");
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		quizWindow.add(panel);
		panel.add(label);
		label.setText("Was Obama his first name?");
		// 7. print "CORRECT" if the user gave the right answer
		if();
		// 8. print "INCORRECT" if the answer is wrong
		
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)

		// 10. find another image and create it (might take more than one line of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component Component() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





