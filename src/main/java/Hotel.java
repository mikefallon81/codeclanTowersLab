import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public int checkBedroomArray(){
        return this.bedrooms.size();
    }

    public int checkConferenceArray(){
        return this.conferenceRooms.size();
    }

    public void checkIntoRoom(Bedroom bedroom, Guest guest){
        bedroom.addGuest(guest);
    }


    public void checkOutOfRoom(Bedroom bedroom) {
        bedroom.removeGuest();
    }

    public void checkIntoConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.addGuest(guest);
    }

    public void checkOutOfConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuest();
    }
}

