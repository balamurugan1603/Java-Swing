import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class MenuBarWindow implements ActionListener{
    
    JFrame f;
    JTextArea ta;
    JMenuItem cut, copy, paste;
    JMenu menu, edit;
    JMenuBar mb;

    MenuBarWindow() {

        f = new JFrame();
        ta = new JTextArea("Enter text...");
        ta.setBounds(50, 100, 80, 100);
        f.add(ta);
        
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        
        edit = new JMenu("Edit");
        menu = new JMenu("Menu");

        mb = new JMenuBar();
        
        menu.add(edit); 
        edit.add(cut); 
        edit.add(new JSeparator());
        edit.add(copy);
        edit.add(new JSeparator());
        edit.add(paste);
        mb.add(menu);

        f.setJMenuBar(mb);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut) {
            ta.cut();
        }
        else if (e.getSource() == copy) {
            ta.copy();
        }
        else if (e.getSource() == paste) {
            ta.paste();
        }
    }
}

class MenuBarExample {
    public static void main(String args[]) {
        new MenuBarWindow();
    }
}
