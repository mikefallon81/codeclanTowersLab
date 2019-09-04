import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void setup(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(1, 2, "double");
        bedroom2 = new Bedroom(2, 1, "single");
        conferenceRoom1 = new ConferenceRoom("East", 3);
        conferenceRoom2 = new ConferenceRoom("North", 5);
        guest1 = new Guest("Harry");
        guest2 = new Guest("Rexton");
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addConferenceRoom(conferenceRoom1);
        hotel.addConferenceRoom(conferenceRoom2);
    }

    @Test
    public void testAddRoom(){
        hotel.addBedroom(bedroom2);
        assertEquals(3, hotel.checkBedroomArray());
    }

    @Test
    public void testAddConference(){
        hotel.addConferenceRoom(conferenceRoom2);
        assertEquals(3, hotel.checkConferenceArray());
    }

    @Test
    public void testBedroomArray(){
        assertEquals(2, hotel.checkBedroomArray());
    }

    @Test
    public void testConferenceArray(){
        assertEquals(2, hotel.checkConferenceArray());
    }

    @Test
    public void testCheckGuestIntoBedroom(){
        hotel.checkIntoRoom(bedroom1, guest1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void testCheckGuestOutOfBedroom(){
        hotel.checkIntoRoom(bedroom1, guest1);
        hotel.checkOutOfRoom(bedroom1);
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void testCheckGuestIntoConferenceRoom(){
        hotel.checkIntoConferenceRoom(conferenceRoom1, guest1);
        assertEquals(1, conferenceRoom1.guestCount());
    }

    @Test
    public void testCheckGuestOutOfConferenceRoom(){
        hotel.checkIntoConferenceRoom(conferenceRoom1, guest1);
        hotel.checkOutOfConferenceRoom(conferenceRoom1);
        assertEquals(0, conferenceRoom1.guestCount());
    }

}
