import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TestButtonIcons extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// Create a frame and set its properties
		JFrame frame = new TestButtonIcons();
		frame.setTitle("ButtonIcons");
		frame.setSize(200, 100);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public TestButtonIcons() {
		ImageIcon usIcon = new ImageIcon("image/usIcon.gif");
		ImageIcon caIcon = new ImageIcon("image/caIcon.gif");
		ImageIcon ukIcon = new ImageIcon("image/ukIcon.gif");

		JButton jbt = new JButton("Click it", usIcon);
		jbt.setPressedIcon(caIcon);
		jbt.setRolloverIcon(ukIcon);

		add(jbt);
	}
}
