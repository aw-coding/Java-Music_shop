package shop;

import instruments.Piano;
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

    public int getNumberOfItemsInStock() {
        return getStock().size();
    }

    public void removeItem(ISell item) {
        this.stock.remove(item);
    }

    public double calculateTotalStockValue() {
        double total = 0;
        for (ISell item: this.stock){
            total += item.calculateMarkup();
        }
        return total;
    }
}
