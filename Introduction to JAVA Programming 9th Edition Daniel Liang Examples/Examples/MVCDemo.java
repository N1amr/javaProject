import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MVCDemo extends JApplet {
  /**
   *
   */
  private static final long serialVersionUID = 1L;
  private JButton jbtController = new JButton("Show Controller");
  private JButton jbtView = new JButton("Show View");
  private CircleModel model = new CircleModel();

  public MVCDemo() {
    setLayout(new FlowLayout());
    add(jbtController);
    add(jbtView);

    jbtController.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("Controller");
        CircleController controller = new CircleController();
        controller.setModel(model);
        frame.add(controller);
        frame.setSize(200, 200);
        frame.setLocation(200, 200);
        frame.setVisible(true);
      }
    });

    jbtView.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("View");
        CircleView view = new CircleView();
        view.setModel(model);
        frame.add(view);
        frame.setSize(500, 200);
        frame.setLocation(200, 200);
        frame.setVisible(true);
      }
    });
  }

  public static void main(String[] args) {
    MVCDemo applet = new MVCDemo();
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("MVCDemo");
    frame.getContentPane().add(applet, BorderLayout.CENTER);
    frame.setSize(400, 320);
    frame.setVisible(true);
  }
}
