package instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;

    public Guitar(String material, String colour, String type, double buyPrice, double sellPrice, String sound,
                   int numberOfStrings){
        super(material, colour, type, buyPrice, sellPrice, sound);
        this.numberOfStrings = numberOfStrings;
    }


    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
