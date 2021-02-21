import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("Oak", "black", "grand", 3000.00, 5000.00,
                "plink", 87);
    }

    @Test
    public void hasNumberOfKeys() {
        assertEquals(87, piano.getNumberOfKeys());
    }
}
