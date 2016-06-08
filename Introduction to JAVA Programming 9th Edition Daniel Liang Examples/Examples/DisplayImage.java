import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisplayImage extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public DisplayImage() {
		add(new ImagePanel());
	}

	public static void main(String[] args) {
		JFrame frame = new DisplayImage();
		frame.setTitle("DisplayImage");
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class ImagePanel extends JPanel {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private ImageIcon imageIcon = new ImageIcon("image/us.gif");
	private Image image = imageIcon.getImage();

	@Override
	/** Draw image on the panel */
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (image != null)
			g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	}
}