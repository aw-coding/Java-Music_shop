public class Ocarina extends Instrument {

    private int numberOfHoles;

    public Ocarina(String material, String colour, String type, double buyPrice, double sellPrice,
                   int numberOfHoles){
        super(material, colour, type, buyPrice, sellPrice);
        this.numberOfHoles = numberOfHoles;
    }


}
