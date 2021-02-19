import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("cherry", "burnt cherry", "acoustic", 280.0, 800.0,
                "Brrring", 6);
    }

    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

}
