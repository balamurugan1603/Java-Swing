import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.util.Vector;

class ComboBoxExample {

    ComboBoxExample() {
        Vector<String> v = new Vector<String>();
        v.add("Thanjavur");
        v.add("Chennai");
        v.add("Bangalore");

        JFrame f = new JFrame();
        JComboBox<String> cb = new JComboBox<String>(v);
        JLabel l1 = new JLabel("Selected city appears here: ");
        JLabel l2 = new JLabel();

        cb.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(e.getSource() == cb) {
                    l2.setText("City : " + cb.getSelectedItem());
                }
            }
        });

        f.add(l1); f.add(l2); f.add(cb);
        cb.setBounds(100, 50, 100, 30);
        l1.setBounds(100, 100, 200, 40);
        l2.setBounds(100, 150, 100, 40);
        
        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
    public static void main(String args[]) {
        new ComboBoxExample();
    }
}
