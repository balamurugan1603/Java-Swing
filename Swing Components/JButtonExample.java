import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class JButtonExample {
    public static void main(String args[]) {
        JFrame f = new JFrame();
        JButton b = new JButton("Click me !");
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                b.setText("Clicked !");
            }
        });
        b.setBounds(10, 100, 100, 40);
        f.add(b);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
		f.setVisible(true);
    }
}