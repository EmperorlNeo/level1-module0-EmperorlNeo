import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JackInTheBox implements ActionListener {

	public static void main(String[] args) {
		new JackInTheBox().createUI();
	}

	private void createUI() {
		// TODO Auto-generated method stub
	//	JackInTheBox jb = new JackInTheBox();

		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
		button.setText("Surprise");
		frame.setSize(150, 100);
		frame.setLocation(800, 500);
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	int timesPressed = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();

		if (buttonPressed == button) {
			timesPressed = timesPressed + 1;
			
			//System.out.println(timesPressed);
		}
		if (timesPressed == 5) {
			showPicture("wwqe.jpg");
		}
	}

	private void showPicture(String fileName) {
		try {
			JLabel imageLabel = createLabelImage(fileName);
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel createLabelImage(String fileName) {
		try {
			URL imageURL = getClass().getResource(fileName);
			if (imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			} else {
				Icon icon = new ImageIcon(imageURL);
				JLabel imageLabel = new JLabel(icon);
				return imageLabel;
			}
		} catch (Exception e) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
	}

}
