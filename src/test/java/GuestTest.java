import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before

    public void setup(){
        guest = new Guest("Harry");
    }

    @Test
    public void doTestName(){
        assertEquals("Harry", guest.getName());
    }

}
