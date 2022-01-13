import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class RadioButtonWindow extends JFrame implements ActionListener {

    JRadioButton rb1, rb2;
    ButtonGroup bg;
    JButton b;
    JLabel l;

    RadioButtonWindow() {

        rb1 = new JRadioButton("CSE");
        rb2 = new JRadioButton("IT");
        bg = new ButtonGroup();
        b = new JButton("SUBMIT");
        l = new JLabel("chosen: ");
        b.addActionListener(this);

        rb1.setBounds(50, 50, 80, 40);
        rb2.setBounds(150, 50, 80, 40);
        b.setBounds(50, 100, 80, 40);
        l.setBounds(50, 150, 100, 40);

        bg.add(rb1); bg.add(rb2);
        add(rb1); add(rb2);
        add(b); add(l);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            if (rb1.isSelected()) { 
                l.setText("chosen: " + rb1.getText());
            }
            else {
                l.setText("chosen: "+ rb2.getText());
            }
        }
    }
}

class RadioButtonExample {

    public static void main(String args[]) {
        new RadioButtonWindow();
    }
}
