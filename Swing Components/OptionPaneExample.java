import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class OptionPaneWindow extends WindowAdapter implements ActionListener {

    JFrame f;
    JButton b;
    
    OptionPaneWindow() {
        f = new JFrame();
        b = new JButton("click here");

        b.setBounds(50, 100, 250, 40);
        b.addActionListener(this);
        f.add(b);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(this);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JOptionPane.showMessageDialog(
            f,
            "Click the button to enter username", 
            "Notification",
            JOptionPane.WARNING_MESSAGE
        );
    }

    public void windowClosing(WindowEvent e) {
        int opt = JOptionPane.showConfirmDialog(f, "confirm close?");
        if (opt == JOptionPane.YES_OPTION) {
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            JOptionPane.showInputDialog(f, "Username: ");
        }
    }
}

class OptionPaneExample {
    public static void main(String args[]) {
        new OptionPaneWindow();
    }
}
