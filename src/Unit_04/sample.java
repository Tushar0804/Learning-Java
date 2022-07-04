package Unit_04;
import javax.swing.*;
import java.awt.*;

class sample extends JFrame
{
    sample()
    {
        JLabel l1 = new JLabel("HELLO");
        add(l1);

        String s[] = {"Apple", "Mango", "Orange"};
        JComboBox cb = new JComboBox(s);
        add(cb);

        JCheckBox cb1 = new JCheckBox();
        JCheckBox cb2 = new JCheckBox("CSE");
        JCheckBox cb3 = new JCheckBox("ECE", true);

        add(cb1);
        add(cb2);
        add(cb3);

        JRadioButton rb1 = new JRadioButton();
        JRadioButton rb2 = new JRadioButton("ME");
        JRadioButton rb3 = new JRadioButton("EE", true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        add(rb1);
        add(rb2);
        add(rb3);


        DefaultListModel <String> lm = new DefaultListModel<>();
        lm.addElement("India");
        lm.addElement("USA");
        lm.addElement("UK");

        JList jl = new JList<>(lm);
        add(jl);


        String data[][] = {{"1", "A", "Tushar"}, {"2", "A", "Malkeet"}, {"3", "B", "Abhau"}, {"4", "I", "Rashmi"}};
        String col[] = {"ID", "Section", "Name"};

        JTable tb = new JTable(data, col);
        JScrollPane sp = new JScrollPane(tb);
        add(sp);



    }

    public static void main(String[] args) {
        sample ob = new sample();
        ob.setSize(300, 300);
        ob.setVisible(true);
        ob.setLayout(new FlowLayout());
        ob.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
