package storage;

import personEntities.Guest;

import java.util.ArrayList;
import java.util.List;

public class GuestList {
    private List<Guest> guestList;
    
    public static GuestList createAllGuestList(String[] splittedData) {
        List<Guest> list = new ArrayList<>();
        for (String eachGuestData:splittedData) {
            String[] splittedEntities = eachGuestData.split(",");
            list.add(Guest.createGuest(splittedEntities[0],splittedEntities[1],splittedEntities[2],splittedEntities[3],splittedEntities[4],splittedEntities[5],splittedEntities[6]));
        }
        return new GuestList(list);
    }

    public GuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }
}
