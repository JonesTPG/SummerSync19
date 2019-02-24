
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joonas
 */
public class Reservation {
    private Customer customer;
    private Room room;
    private String date;
    private String startTime;
    private String endTime;
    private int amountOfPersons;

    public Reservation(Customer customer, Room room, String date, 
            String startTime, String endTime, int amountOfPersons) {
        this.customer = customer;
        this.room = room;
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
        this.amountOfPersons = amountOfPersons;
    }

    public String getDate() {
        return date;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    public int getAmountOfPersons() {
        return amountOfPersons;
    }
    
    
    
    
    
    
    
}
