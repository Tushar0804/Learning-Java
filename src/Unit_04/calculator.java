package Unit_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator
{
    public static void main(String[] args)
    {
        calFrame obj = new calFrame();
    }
}
class calFrame extends JFrame
{
    JLabel first;
    JLabel second;
    JLabel result;

    JTextField t1;
    JTextField t2;
    JTextField t3;

    JButton sum;
    JButton sub;
    JButton mul;
    JButton div;
    JButton exit;

    JPanel p1;
    JPanel p2;
    JPanel p3;

    calFrame()
    {
        first = new JLabel("First Number");
        second = new JLabel("Second Number");
        result = new JLabel("Result");

        t1 = new JTextField(15);
        t2 = new JTextField(15);
        t3 = new JTextField(15);

        sum = new JButton("Sum");
        sub = new JButton("Subtract");
        mul = new JButton("Multiply");
        div = new JButton("Divide");
        exit = new JButton("Exit");

        p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 2));

        p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 5));

        p3 = new JPanel();
        p3.setLayout(new GridLayout(1, 2));

        // adding to first panel
        p1.add(first);
        p1.add(t1);
        p1.add(second);
        p1.add(t2);

        // adding to second panel
        p2.add(sum);
        p2.add(sub);
        p2.add(mul);
        p2.add(div);
        p2.add(exit);

        // adding to third panel
        p3.add(result);
        p3.add(t3);

        // now adding panels to frame
        add(p1);
        add(p2);
        add(p3);


        ActionListener al = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String s1 = t1.getText();
                String s2 = t2.getText();

                int num1 = Integer.parseInt(s1);
                int num2 = Integer.parseInt(s2);

                if(e.getSource() == sum)
                {
                    Integer sum = num1 + num2;
                    t3.setText(sum.toString());
                }
                if(e.getSource() == sub)
                {
                    Integer sub = num1 - num2;
                    t3.setText(sub.toString());
                }
                if(e.getSource() == mul)
                {
                    Integer mul = num1 * num2;
                    t3.setText(mul.toString());
                }
                if(e.getSource() == div)
                {
                    try {
                        Integer div = num1 / num2;
                        t3.setText(div.toString());
                    }
                    catch (Exception ex)
                    {
                        t3.setText("Error");
                    }
                }
                if(e.getSource() == exit)
                {
                    dispose();
                }
            }
        };
        sum.addActionListener(al);
        sub.addActionListener(al);
        mul.addActionListener(al);
        div.addActionListener(al);
        exit.addActionListener(al);




        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
