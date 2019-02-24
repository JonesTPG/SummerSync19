
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joonas
 */
class MeetingRoom extends Room {

    public MeetingRoom(String name, String location, int size, ArrayList<Reservation> list) {
        this.name = name;
        this.location = location;
        this.size = size;
        this.reservations = list;
    }
    
}
