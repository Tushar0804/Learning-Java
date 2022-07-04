package extra;

import java.awt.*;
import java.awt.event.*;
class Match extends Frame implements ActionListener {
    String[]
            country={"India","Netherlands","USA","France","Germany"};
    String[] capital={"New Delhi","Amsterdam","Washington D.C.","Paris","Berlin"};
    Choice co=new Choice();
    Choice ca=new Choice();
    Button b=new Button("Check");
    TextField t1=new TextField();
    Match() {
        for (String s : country) {
            co.add(s);
        }
        for (String s : capital) {
            ca.add(s);
        }
        co.setBounds(40,80,150,50);
        ca.setBounds(300,80,150,50);
        b.setBounds(180,120,60,20);
        t1.setBounds(50,120,300,50);
        add(co);
        add(ca);
        add(b);
        add(t1);
        setSize(500,250);
        setTitle("Country and Capital Check ");
        setLayout(null);
        setVisible(true);
        b.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e) {
        if(co.getSelectedIndex()==ca.getSelectedIndex()){
            t1.setText("Correct answer");
        }else{
            t1.setText("Wrong answer, Capital of "+country[co.getSelectedIndex()]+" is "+capital[co.getSelectedIndex()]+".");
        }
    }
}
class Program26 {
    public static void main(String[] args) {
        System.out.println("*********************************************");
        System.out.println("Demonstrate of awt progarm given in snapshot");
        System.out.println("**********************************************");
        new Match();
        System.out.println("---------------------------------------------------");
        System.out.println("CODE BY : RASHMI , 20012531 , Roll no. 45");
        System.out.println("---------------------------------------------------");
    }
}
