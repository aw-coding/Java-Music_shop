package misc_items;

import interfaces.ISell;

public class MiscStock implements ISell {

    private itemType itemType;
    private double buyPrice;
    private double sellPrice;

    public MiscStock(itemType itemType, double buyPrice, double sellPrice){
        this.itemType = itemType;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }

    public itemType getItemType() {
        return itemType;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
