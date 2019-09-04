import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;


    public ConferenceRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public String getConferenceRoomName() {
        return this.name;
    }

    public int getConferenceRoomCapacity() {
        return this.capacity;
    }

    public void addGuest(Guest guest1) {
        if (hasCapacity()){
            this.guests.add(guest1);

        }
    }

    public boolean hasCapacity() {
        return capacity > guests.size();
    }

    public int guestCount() {
        return this.guests.size();
    }

    public void removeGuest() {
        this.guests.remove(0);
    }
}
