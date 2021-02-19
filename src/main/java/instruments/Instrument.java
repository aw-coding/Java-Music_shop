package instruments;

import interfaces.IPlay;

public abstract class Instrument implements IPlay {

    private String material;
    private String colour;
    private String type;
    private double buyPrice;
    private double sellPrice;
    private String sound;


    public Instrument(String material, String colour, String type, double buyPrice, double sellPrice, String sound){
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.sound = sound;
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String play(){
        return this.sound;
    }
}
