import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class JListExample {
    JListExample() {
        JFrame f = new JFrame();
        DefaultListModel<String> dlm = new DefaultListModel<String>();
        dlm.addElement("Python");
        dlm.addElement("Java");
        dlm.addElement("C++");
        dlm.addElement("C");
        JLabel label = new JLabel();
        JList<String> l = new JList<String>(dlm);
        JButton b = new JButton("Click after selecting");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText(l.getSelectedValue());
            }
        });

        f.add(label); f.add(l); f.add(b);
        label.setBounds(50, 50, 100, 40);
        l.setBounds(50, 100, 60, 80);
        b.setBounds(50, 200, 200, 30);
        
        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new JListExample();
    }
}
