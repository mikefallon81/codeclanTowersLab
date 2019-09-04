import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;

    @Before
    public void setup(){
        guest1 = new Guest("Harry");
        guest2 = new Guest("Mary");
        guest3 = new Guest("Karen");
        bedroom1 = new Bedroom(1, 2, "Double");
        bedroom2 = new Bedroom(2, 1, "Single");



    }

    @Test
    public void testRoomNumber(){
        assertEquals(1, bedroom1.getRoomNumber());
    }

    @Test
    public void testCapacity(){
        assertEquals(2, bedroom1.getRoomCapacity());
    }

    @Test
    public void testRoomType(){
        assertEquals("Double", bedroom1.getRoomType());
    }

    @Test
    public void hasCapacityTrue(){
        bedroom1.addGuest(guest1);
        assertEquals(true, bedroom1.hasCapacity());
    }

    @Test
    public void hasCapacityFalse(){
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        assertEquals(false, bedroom1.hasCapacity());
    }

    @Test
    public void testCanAddGuest(){
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void testCantAddGuest(){
        bedroom2.addGuest(guest1);
        bedroom2.addGuest(guest2);
        assertEquals(1, bedroom2.guestCount());
    }

}
