import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;

    public Bedroom(int roomNumber, int capacity, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
    }


    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getRoomCapacity() {
        return this.capacity;
    }

    public String getRoomType() {
        return this.type;
    }

    public boolean hasCapacity(){
        return capacity > guests.size();
    }

    public void addGuest(Guest guest) {
        if(hasCapacity()){
            this.guests.add(guest);
        }
    }

    public int guestCount() {
        return this.guests.size();
    }

    public void removeGuest() {
        this.guests.remove(0);

    }
}
