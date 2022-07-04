package Unit_05;

import java.sql.*;

public class aa
{
    public static void main(String[] args)
    {
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Success");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
