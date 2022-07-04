package Unit_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class tanujPractical
{
    public static void main(String[] args)
    {
        SwingUi obj = new SwingUi();
    }
}
class SwingUi extends JFrame
{
    JLabel l1;
    JTextField t1;
    JTextField t2;
    JButton b1;

    JPanel p1;

    SwingUi()
    {
        l1 = new JLabel("Enter Employee ID");
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        b1 = new JButton("SUBMIT");

        p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 2));

        p1.add(l1);
        p1.add(t1);
        p1.add(b1);
        p1.add(t2);

        add(p1);

        ArrayList <Integer> arr = new ArrayList<>();


        ActionListener al = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == b1)
                {
                    String id = t1.getText();
                    Integer id_num = Integer.valueOf(id);

                    if(arr.contains(id_num) == false)
                    {
                        arr.add(id_num);
                        t2.setText("ID ENTERED SUCCESSFULLY");
                    }
                    else
                    {
                        t2.setText("ID ALREADY EXISTS!");
                    }
                }
            }
        };
        b1.addActionListener(al);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
