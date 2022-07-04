package extra;

import java.sql.*;
import java.util.*;

public class Program30
{
    Connection con;
    Statement stmt=null;
    Program30() throws ClassNotFoundException , SQLException
    {
        Scanner sc = new Scanner (System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student" , "root","Tushar@008");
        System.out.println("Enter Roll number");
        stmt=con.createStatement();
        int varrno = sc.nextInt();
        ResultSet rs = stmt.executeQuery("Select * from personal where rollno = " + varrno);
        System.out.println("Below is the list of Student Studiying in deptt No." + varrno);
        System.out.println("Roll Number\t  Name\t   Program\t   Branch\t");
        while(rs.next())
        {
            System.out.print(rs.getInt("rollno") + "     \t");
            System.out.print(rs.getString("name") + "     \t");
            System.out.print(rs.getString("prog") + "     \t");
            System.out.println(rs.getString("branch") + "     \t");
        }
        con.close();
    }
    public static void main(String[]args)
    {
        System.out.println("---------------------------------------------------");
        System.out.println("CODE BY : RASHMI , 20012531 , Roll no. 45");
        System.out.println("---------------------------------------------------");
        try
        {
            new Program30();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
