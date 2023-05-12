/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie_Ticket.POJO;

/**
 *
 * @author ankitjain
 */
public class Movies {
    private String movie_name;
    private String screen;
    private int capacity;
    private int show;
    private double price;

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getShow() {
        return show;
    }

    public void setShow(int show) {
        this.show = show;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Movies{" + "movie_name=" + movie_name + ", screen=" + screen + ", capacity=" + capacity + ", show=" + show + ", price=" + price + '}';
    }

    public Movies(String movie_name, String screen, int capacity, int show, double price) {
        this.movie_name = movie_name;
        this.screen = screen;
        this.capacity = capacity;
        this.show = show;
        this.price = price;
    }

 public Movies(){
     
 }

    
    
}
