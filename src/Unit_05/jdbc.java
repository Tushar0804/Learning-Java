package Unit_05;

import java.sql.*;
public class jdbc
{
    public static void main(String args[])
    {
        Connection con=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Sucess");
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
            System.out.println("Connected");
        }
        catch(Exception e){
            System.out.println("not connected");
        }
    }
}
