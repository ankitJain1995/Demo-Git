/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie_Ticket.DAO;

import Movie_Ticket.POJO.Movies;
import Movie_Ticket.Util.DBConnection;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ankitjain
 */
public class MovieDao {
    
    public static boolean addMovie(Movies mov) throws SQLException
    {
       Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into movies values(?,?,?,?,?)");
        ps.setString(1, mov.getMovie_name());
        ps.setInt(2, mov.getCapacity());
        ps.setInt(3, mov.getShow());
        ps.setDouble(4, mov.getPrice());
        ps.setString(5, mov.getScreen());
        int ans = ps.executeUpdate();
        if(ans==1)
            return true;
        return false;
        
       
    }
    
    public static HashMap<String,Movies> getAllMovieName() throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from movies");
        //ArrayList<String> movieName = new ArrayList<>();
        HashMap<String,Movies> map=new HashMap<String,Movies>();
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {   Movies m=new Movies();
            m.setMovie_name(rs.getString(1));
            m.setCapacity(rs.getInt(2));
            m.setShow(rs.getInt(3));
            m.setPrice(rs.getDouble(4));
            m.setScreen(rs.getString(5));
            map.put(rs.getString(1),m);
        }
        return map;
        
    }
    
    public static ArrayList<Movies> getAllMovieDetails() throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from movies");
        ArrayList<Movies> movList = new ArrayList<>();
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            String mov_name = rs.getString(1);
            int capa = rs.getInt(2);
            int show = rs.getInt(3);
            double price = rs.getDouble(4);
            String screen = rs.getString(5);
            Movies movie = new Movies(mov_name, screen, capa, show, price);
            movList.add(movie);
        }
        return movList;
    }
}
