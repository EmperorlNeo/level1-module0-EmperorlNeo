
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Color;
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

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image URL”)

		// 2. create a variable of type "Component" that will hold your image
		// Component image = Component();
		Component image = Component();
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage("https://www.thenation.com/wp-content/uploads/2016/01/obama_sotu_2016_ap_img.jpg");
		// 4. add the image to the quiz window

		// 5. call the pack() method on the quiz window

		// 6. ask a question that relates to the image
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		quizWindow.add(panel);
		panel.add(label);
		panel.add(image);
		quizWindow.pack();
		label.setText("Was Obama his first name? (Yes or No)");
		label.setBackground(Color.white);
		String b = JOptionPane.showInputDialog("YOUR ANSWER:");
		// 7. print "CORRECT" if the user gave the right answer
		if (b.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(label, "CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else if (b.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(label, "INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		panel.removeAll();
		// 10. find another image and create it (might take more than one line of code)
		Component image2=Component();
		image2 = createImage("https://cosmos-magazine.imgix.net/file/spina/photo/12095/spiderpaws_image7_pinktoed_tarantula.jpg?fit=clip&w=835");
		// 11. add the second image to the quiz window
		JLabel label2= new JLabel();
		panel.add(label2);
		panel.add(image2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		label2.setText("How many legs does this spider have?");
		
		String s=JOptionPane.showInputDialog("YOUR ANSWER:");
		// 14+ check answer, say if correct or incorrect, etc.
		if(s.equalsIgnoreCase("eight")) {
			JOptionPane.showMessageDialog(label, "CORRECT");
		}
			else if(s.equals("8")) {
			JOptionPane.showMessageDialog(label, "CORRECT");

		}		
			else {
			JOptionPane.showMessageDialog(label, "INCORRECT");

		}
		if(b.equalsIgnoreCase("no") && s.equalsIgnoreCase("eight") || s.equalsIgnoreCase("8")) {
			JOptionPane.showMessageDialog(null, "Good job, you got 2/2");
		}
		else if(b.equalsIgnoreCase("yes") && s.equalsIgnoreCase("eight") || s.equalsIgnoreCase("8")) {
			JOptionPane.showMessageDialog(null, "You got 1/2");
		}
		else if(b.equalsIgnoreCase("yes") || s.equalsIgnoreCase("eight") || s.equalsIgnoreCase("8")) {
			JOptionPane.showMessageDialog(null, "Good job, you got 1/2");
		}
		else {
			JOptionPane.showMessageDialog(null,"Better luck next time. 0/2");
		}
		
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
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
