package Unit_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P17_SwingInJava
{
    public static void main(String[] args)
    {
        SwingInJava obj = new SwingInJava();

    }
}
class SwingInJava extends JFrame
{
    JTextField t1;
    JTextField t2;
    JButton b1;
    JButton b2;
    JLabel l1;


    SwingInJava()
    {
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b1 = new JButton("Sum");
        b2 = new JButton("Difference");
        l1 = new JLabel();

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(l1);

        ActionListener al = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String s1 = t1.getText();
                String s2 = t2.getText();

                int a1 = Integer.parseInt(s1);
                int a2 = Integer.parseInt(s2);

                if(e.getSource() == b1)
                {
                    Integer sum = a1 + a2;
                    l1.setText(sum.toString());
                }
                if(e.getSource() == b2)
                {
                    Integer sub = a1 - a2;
                    l1.setText(sub.toString());
                }
            }
        };
        b1.addActionListener(al);
        b2.addActionListener(al);


        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
