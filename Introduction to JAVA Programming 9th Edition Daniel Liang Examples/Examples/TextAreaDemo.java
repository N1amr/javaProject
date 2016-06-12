import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class TextAreaDemo extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	// Declare and create a description panel
	private DescriptionPanel descriptionPanel = new DescriptionPanel();

	public static void main(String[] args) {
		TextAreaDemo frame = new TextAreaDemo();
		frame.pack();
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("TextAreaDemo");
		frame.setVisible(true);
	}

	public TextAreaDemo() {
		// Set title, text and image in the description panel
		descriptionPanel.setTitle("Canada");
		String description = "The Canadian national flag ...";
		descriptionPanel.setImageIcon(new ImageIcon("image/ca.gif"));
		descriptionPanel.setDescription(description);

		// Add the description panel to the frame
		setLayout(new BorderLayout());
		add(descriptionPanel, BorderLayout.CENTER);
	}
}
