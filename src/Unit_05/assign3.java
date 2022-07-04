package Unit_05;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class assign3
{
    public static void main(String[] args) throws SQLException
    {
        JdbcUi obj = new JdbcUi();
    }
}

class JdbcUi extends JFrame implements ActionListener
{
    JLabel id;
    JLabel name;

    JTextField t1;
    JTextField t2;

    JButton submit;
    JButton show_tbl;
    JButton exit;

    JPanel p1;
    JPanel p2;

    Connection conn = null;
    ResultSet rs = null;

    JdbcUi()
    {
        id = new JLabel("ID");
        name = new JLabel("NAME");

        t1 = new JTextField(10);
        t2 = new JTextField(10);

        submit = new JButton("Submit");
        show_tbl = new JButton("Show Table");
        exit = new JButton("Exit");

        p1 = new JPanel();

        p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 3));

        p1.add(id);
        p1.add(t1);
        p1.add(name);
        p1.add(t2);

        p2.add(submit);
        p2.add(show_tbl);
        p2.add(exit);

        add(p1);
        add(p2);

        submit.addActionListener(this);
        show_tbl.addActionListener(this);
        exit.addActionListener(this);


        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // JDBC
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Registration Successful");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        // Connection
        try
        {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment3 ", "root", "Tushar@008");
            System.out.println("Connection Established");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();

        if (s.equals("Submit"))
        {
            int id = Integer.parseInt(t1.getText());
            String name = t2.getText();

            // create statement
            try
            {
                PreparedStatement ps = conn.prepareStatement("insert into ass_tbl(id,name) values(?,?)");
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.executeUpdate();
                System.out.println("Query Executed Successfully");
            }
            catch (Exception ex)
            {
                System.out.println(ex);
            }
        }
        else if (s.equals("Show Table"))
        {
            try
            {
                Statement st = conn.createStatement();
                rs = st.executeQuery("select * from ass_tbl");

                JFrame fnew = new JFrame();
                JTable tb;
                while (rs.next())
                {
                    String id = String.valueOf(rs.getInt("id"));
                    String name = rs.getString("name");
                    Object data[][] = {{id, name}};
                    String colNames[] = {"ID", "Name"};
                    DefaultTableModel tbModel = new DefaultTableModel(data, colNames);

                    tb = new JTable(tbModel);
                    tb.setBounds(10, 20 , 20, 30);
                    fnew.add(tb);

                    fnew.setLayout(new FlowLayout());
                    fnew.setVisible(true);
                    fnew.setSize(250, 500);
                    validate();
                }
            } catch (Exception ex)
            {
                System.out.println(ex);
            }
        } else if (s.equals("Exit"))
        {
            System.exit(0);
        }
    }
}

