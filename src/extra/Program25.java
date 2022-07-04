package extra;

import java.awt.*;
import java.awt.event.*;
class Program25 extends Frame implements ActionListener, ItemListener
{
    Panel p1,p2,p3,p4;
    Label l1,l2,l3;
    TextField txt1,txt2;
    Button btncal;
    Checkbox chkDiscount,chkWholesaler,chkRetailer;
    CheckboxGroup cbg;
    double cost=0.0;
    double temp=0.0;
    Program25()
    {
        setLayout(new FlowLayout());
        setTitle("Brilliant Packaging Company");
        setVisible(true);
        setSize(500,200);
        l1=new Label("Unit Nos");
        l2=new Label("Customer Type");
        l3=new Label("Cost total", Label.RIGHT);
        txt1=new TextField(20);
        txt2=new TextField(20);
        txt2.setEditable(false);
        cbg=new CheckboxGroup();
        chkDiscount=new Checkbox("Special Discount");
        chkDiscount.setEnabled(false);
        chkWholesaler=new Checkbox("Wholesaler",cbg,true);
        chkRetailer=new Checkbox("Retailer",false,cbg);
        p1=new Panel(new GridLayout(3,1));
        p2=new Panel(new GridLayout(3,1));
        p3=new Panel(new GridLayout(1,3));
        btncal=new Button("Calculate Cost");
        p1.add(l1);
        p1.add(txt1);
        p1.add(chkDiscount);
        p2.add(l2);
        p2.add(txt2);
        p2.add(chkRetailer);
        p2.add(chkWholesaler);
        p3.add(btncal);
        p3.add(l3);
        p3.add(txt2);
        add(p1);
        add(p2);
        add(p3);
        btncal.addActionListener(this);
        chkDiscount.addItemListener(this);
        addWindowListener(new WindowAdapter()
                          {
                              public void windowClosing(WindowEvent e)
                              {
                                  System.exit(0);
                              }
                          }
        );
    }
    public static void main(String[] args)
    {
        System.out.println("*********************************************");
        System.out.println("Demonstrate of awt program given in snapshot");
        System.out.println("**********************************************");
        new Program25();
        System.out.println("---------------------------------------------------");
        System.out.println("CODE BY : RASHMI , 20012531 , Roll no. 45");
        System.out.println("---------------------------------------------------");
    }
    public void actionPerformed(ActionEvent arg0)
    {
        int i=Integer.parseInt(txt1.getText());
        chkDiscount.setEnabled(true);
        if(i>0&&i<=15)
        {
            if(chkWholesaler.getState())
                cost=50*i;
            else
                cost=60*i;
        }
        if(i>15&&i<=20)
        {
            if(chkWholesaler.getState())
                cost=45*i;
            else
                cost=55*i;
        }
        if(i>20&&i<=30)
        {
            if(chkWholesaler.getState())
                cost=40*i;
            else
                cost=50*i;
        }
        if(i>50)
        {
            if(chkWholesaler.getState())
                cost=30*i;
            else
                cost=40*i;
        }
        txt2.setText(cost+"");
        temp=cost;
    }
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        if(chkDiscount.getState())
        {
            cost=cost-(cost*0.1);
        }
        else
            cost=temp;
        txt2.setText(cost+"");
    }
}

