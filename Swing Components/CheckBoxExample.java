import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

class CheckBoxExample {
    CheckBoxExample() {

        JFrame f = new JFrame();
        JTextArea t = new JTextArea();
        JCheckBox cb1 = new JCheckBox("Python");
        JCheckBox cb2 = new JCheckBox("Java");
        
        cb1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (cb1.isSelected() && cb2.isSelected()) {
                    t.setText("Python, Java Selected");
                }
                else if (cb1.isSelected() && !cb2.isSelected()) {
                    t.setText("Python Selected");
                }
                else if (!cb1.isSelected() && !cb2.isSelected()) {
                    t.setText("Nothing is selected");
                }
                else {
                    t.setText("Java is selected");
                }
            }
        });

        cb2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (cb1.isSelected() && cb2.isSelected()) {
                    t.setText("Python, Java Selected");
                }
                else if (cb2.isSelected() && !cb1.isSelected()) {
                    t.setText("Java Selected");
                }
                else if (!cb2.isSelected() && !cb1.isSelected()) {
                    t.setText("Nothing is selected");
                }
                else {
                    t.setText("Python is selected");
                }
            }
        });

        t.setBounds(50, 50, 100, 40);
        cb1.setBounds(200, 50, 100, 30);
        cb2.setBounds(200, 100, 100, 30);

        f.add(t); f.add(cb1); f.add(cb2);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new CheckBoxExample();
    }

}
