import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {



    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private ConferenceRoom conferenceRoom3;


    @Before

    public void setup() {
        guest1 = new Guest("Harry");
        guest2 = new Guest("Mary");
        guest3 = new Guest("Karen");
        conferenceRoom1 = new ConferenceRoom("East", 5);
        conferenceRoom2 = new ConferenceRoom("West", 3);
        conferenceRoom3 = new ConferenceRoom("South", 1);
    }

    @Test
    public void testConferenceRoomName(){
        assertEquals("East", conferenceRoom1.getConferenceRoomName());
    }

    @Test
    public void testConferenceRoomCapacity(){
        assertEquals(5, conferenceRoom1.getConferenceRoomCapacity());
    }

    @Test
    public void hasCapacityTrue(){
        conferenceRoom2.addGuest(guest1);
        assertEquals(true, conferenceRoom2.hasCapacity());

    }

    @Test
    public void hasCapacityFalse(){
        conferenceRoom3.addGuest(guest1);
        conferenceRoom3.addGuest(guest2);
        assertEquals(false, conferenceRoom3.hasCapacity());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom1.addGuest(guest1);
        assertEquals(1, conferenceRoom1.guestCount());
    }

    @Test
    public void cantAddGuest(){
        conferenceRoom3.addGuest(guest1);
        conferenceRoom3.addGuest(guest2);
        assertEquals(1, conferenceRoom3.guestCount());
    }

    @Test
    public void testRemoveGuest(){
        conferenceRoom1.addGuest(guest1);
        conferenceRoom1.removeGuest();
        assertEquals(0, conferenceRoom1.guestCount());
    }



}
