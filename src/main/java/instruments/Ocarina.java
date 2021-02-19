package instruments;

import instruments.Instrument;

public class Ocarina extends Instrument {

    private int numberOfHoles;

    public Ocarina(String material, String colour, String type, double buyPrice, double sellPrice, String sound,
                   int numberOfHoles){
        super(material, colour, type, buyPrice, sellPrice, sound);
        this.numberOfHoles = numberOfHoles;
    }


    public int getNumberOfHoles() {
        return numberOfHoles;
    }

    public void setNumberOfHoles(int numberOfHoles) {
        this.numberOfHoles = numberOfHoles;
    }
}
