package shop;

import interfaces.ISell;

import java.util.ArrayList;

public class Shop {


    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name, ArrayList<ISell> stock){
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell item){
        this.stock.add(item);
    }

}
