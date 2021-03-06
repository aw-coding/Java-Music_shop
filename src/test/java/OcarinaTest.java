import instruments.Ocarina;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OcarinaTest {

    Ocarina ocarina;

    @Before
    public void before(){
        ocarina = new Ocarina("Magic metal", "Blue", "Woodwind", 1000.00,
                1750.00, "Doo Dee Doo", 5);
    }

    @Test
    public void hasMaterial(){
    assertEquals("Magic metal", ocarina.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Blue", ocarina.getColour());
    }



    @Test
    public void hasType(){
        assertEquals("Woodwind", ocarina.getType());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(1000.00, ocarina.getBuyPrice(), 0.0);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(1750.00, ocarina.getSellPrice(), 0.0);
    }

    @Test
    public void getNumberOfHoles(){
        assertEquals(5, ocarina.getNumberOfHoles());
    }

    @Test
    public void canPlaySound(){
        assertEquals("Doo Dee Doo", ocarina.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(750.00, ocarina.calculateMarkup(), 0.00);
    }

}
