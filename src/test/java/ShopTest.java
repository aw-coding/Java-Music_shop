import instruments.Guitar;
import instruments.Ocarina;
import instruments.Piano;
import interfaces.ISell;
import misc_items.MiscStock;
import misc_items.itemType;
import org.junit.Before;

import java.util.ArrayList;

import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    private ArrayList<ISell> stock;
    private Guitar fender;
    private Ocarina ocarinaOfTime;
    private Piano grandPiano;
    private MiscStock sheetMusic;
    private MiscStock plectrum;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Shop", stock);
        fender = new Guitar("cherry", "burnt cherry", "electric", 300.0, 800.0,
                "Brrring", 6);
        ocarinaOfTime = new Ocarina("Magic metal", "Blue", "Woodwind", 1000.00,
                1750.00, "Doo Dee Doo", 5);
        grandPiano = new Piano("Oak", "black", "grand", 3000.00, 5000.00,
                "plink", 87);
        sheetMusic = new MiscStock(itemType.SHEETMUSIC, 30.00, 50.00);
        plectrum = new MiscStock(itemType.PLECTRUM, 5.00, 15.00);

        shop.addToStock(fender);
        shop.addToStock(ocarinaOfTime);
        shop.addToStock(grandPiano);
        shop.addToStock(sheetMusic);
        shop.addToStock(plectrum);
    }

    @Test
    public void canGetName(){
        assertEquals("Ray's Music Shop", shop.getName());
    }

    @Test
    public void canGetStock(){
        assertEquals(5, shop.getNumberOfItemsInStock());
    }
}
