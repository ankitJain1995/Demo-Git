/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie_Ticket.DAO;

import Movie_Ticket.POJO.Users;
import Movie_Ticket.Util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ankitjain
 */
public class UsersDAO {
     public static String validateUser(Users user) throws SQLException{
        Connection conn = DBConnection.getConnection();
        String qry = "Select user_name from Users where password=? and user_type=? and mobile=?";
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,user.getPassword());
        ps.setString(2,user.getUserType());
        ps.setString(3,user.getMobileNo());
        ResultSet rs=ps.executeQuery();
        String username =null;
        if(rs.next()){
            username=rs.getString(1);
        }
        return username;
    }
     
     public static boolean adduser(Users user) throws SQLException
     {
         Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement("insert into users values(?,?,?,?)");
         ps.setString(1, user.getUserName());
         ps.setString(2, user.getPassword());
         ps.setString(3,user.getUserType());
         ps.setString(4,user.getMobileNo());
         int ans = ps.executeUpdate();
         if(ans==1)
             return true;
         return false;
     }
}
