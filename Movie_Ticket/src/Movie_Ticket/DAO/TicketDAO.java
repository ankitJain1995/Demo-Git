/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie_Ticket.DAO;

import Movie_Ticket.POJO.Tickets;
import Movie_Ticket.Util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author ankitjain
 */
public class TicketDAO {
    
    public static boolean bookTicket(Tickets ticket) throws SQLException, ParseException
    {
       Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into tickets values(?,?,?,?,?,?,?)");
        ps.setString(1, ticket.getUser_name());
        ps.setString(2, ticket.getContact());
        ps.setString(3,ticket.getMovie_name());
        ps.setString(4,ticket.getScreen_no());
        ps.setInt(5,ticket.getTicket());
        String book_date = ticket.getTicket_date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date gen = sdf.parse(book_date);
        java.sql.Date genD = new java.sql.Date(gen.getTime());
        ps.setDate(6, genD);
        ps.setDouble(7,ticket.getPrice());
        int ans = ps.executeUpdate();
        if(ans==1)
            return true;
        return false;
    }
    
    public static int bookedTickets(String date,String movieName)throws SQLException
    {
        Statement st=DBConnection.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select sum(ticket) from tickets where ticket_date='"+date+"' and movie_name='"+movieName+"'");
        if(rs.next())
            return rs.getInt(1);
        return -1;
    }
    
    public static ArrayList<Tickets> getUserDetails() throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select user_name,contact,movie_name,ticket from tickets");
        ResultSet rs = ps.executeQuery();
        ArrayList<Tickets> list  = new ArrayList<>();
        while(rs.next())
        {
            String name = rs.getString(1);
            String con = rs.getString(2);
            String mov = rs.getString(3);
            int seat  = rs.getInt(4);
            Tickets tikt = new Tickets();
            tikt.setUser_name(name);
            tikt.setContact(con);
            tikt.setMovie_name(mov);
            tikt.setTicket(seat);
            list.add(tikt);
        }
        return list;
    }
}
