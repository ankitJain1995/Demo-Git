/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie_Ticket.POJO;

import java.util.Date;

/**
 *
 * @author ankitjain
 */
public class Tickets {
    private String movie_name;
    private String contact;
    private String user_name;
    private String screen_no;
    private int ticket;
    private String ticket_date;
    private double price;

    public Tickets(String movie_name, String contact, String user_name, String screen_no, int ticket, String ticket_date, double price) {
        this.movie_name = movie_name;
        this.contact = contact;
        this.user_name = user_name;
        this.screen_no = screen_no;
        this.ticket = ticket;
        this.ticket_date = ticket_date;
        this.price = price;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getScreen_no() {
        return screen_no;
    }

    public void setScreen_no(String screen_no) {
        this.screen_no = screen_no;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public String getTicket_date() {
        return ticket_date;
    }

    public void setTicket_date(String ticket_date) {
        this.ticket_date = ticket_date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tickets{" + "movie_name=" + movie_name + ", contact=" + contact + ", user_name=" + user_name + ", screen_no=" + screen_no + ", ticket=" + ticket + ", ticket_date=" + ticket_date + ", price=" + price + '}';
    }

    public Tickets()
    {
        
    }
    
}