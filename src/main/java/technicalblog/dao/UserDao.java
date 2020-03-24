package technicalblog.dao;

import technicalblog.model.User;
import technicalblog.model.Post;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDao {

    public boolean isValidUser(User user) {
        String username=user.getUsername();
        String password=user.getPassword();
        boolean flag=false;
        try
        {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/technicalblog/user";
            String uname = "postgres";
            String pass = "singla70";
            Connection con = DriverManager.getConnection(url, uname, pass);
            Statement stmt = con.createStatement();
            String q = "select * from users";
            ResultSet rs = stmt.executeQuery(q);
            while (rs.next())
            {
                if(rs.getString(1).equals(username)&&rs.getString(2).equals(password))
                {
                    flag=true;
                    System.out.println("ar");
                }
                con.close();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        return flag;
    }
}
