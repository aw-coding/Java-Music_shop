import misc_items.MiscStock;
import misc_items.itemType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiscStockTest {

    MiscStock sheetMusic;

    @Before
    public void before(){
        sheetMusic = new MiscStock(itemType.SHEETMUSIC, 30.00, 50.00);
    }

    @Test
    public void cangetBuyPrice(){
        assertEquals(30.00, sheetMusic.getBuyPrice(), 0.0);
    }

    @Test
    public void cangetSellPrice(){
        assertEquals(50.00, sheetMusic.getSellPrice(), 0.0);
    }

    @Test
    public void cangetItemType(){
        assertEquals(itemType.SHEETMUSIC, sheetMusic.getItemType());
    }
}
