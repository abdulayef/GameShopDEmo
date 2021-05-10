package entities;

import abstracts.Entities;

public class Game extends Product implements Entities {

    public String name;
    public double price;
    public int stock;
    public int id;
    public String gameDetail;

    public Game(String name, double price, int stock, int id, String gameDetail) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.id = id;
        this.gameDetail = gameDetail;
    }

}
