package instruments;

public class Piano extends Instrument {



    private int numberOfKeys;

    public Piano(String material, String colour, String type, double buyPrice, double sellPrice, String sound,
        int numberOfKeys){
            super(material, colour, type, buyPrice, sellPrice, sound);
            this.numberOfKeys = numberOfKeys;
        }


    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }


}
