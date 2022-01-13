import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class PasswordFieldWindow extends JFrame implements ActionListener {

    JTextField tf;
    JPasswordField pf;
    JTextArea ta;
    JButton b;

    PasswordFieldWindow() {
        tf = new JTextField("Enter Username...");
        pf = new JPasswordField("Enter Password...");
        b = new JButton("SUBMIT");
        ta = new JTextArea();
        b.addActionListener(this);

        tf.setBounds(50, 50, 150, 30);
        pf.setBounds(50, 80, 150, 30);
        b.setBounds(50, 130, 80, 30);
        ta.setBounds(50, 180, 150, 80);

        this.add(tf); this.add(pf); 
        this.add(b); this.add(ta);
        this.setSize(400, 600);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b) {
            ta.setText(
                "Username: " + tf.getText() + 
                "\nPassword: " + new String(pf.getPassword())
            );
        }
    }
}

class PasswordFieldExample {
    public static void main(String args[]) {
        new PasswordFieldWindow();
    }
}
