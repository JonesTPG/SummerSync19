
import java.util.ArrayList;
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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        PresentationRoom room1 = new PresentationRoom("huone1", "2201", 50, new ArrayList<>());
        MeetingRoom room2 = new MeetingRoom("huone2", "2203", 15, new ArrayList<>());
        
        Customer customer = new PersonalCustomer("Joonas", "050 404 3908", 
        "joonas.ryynanen1@gmail.com");
        
        Customer customer2 = new PersonalCustomer("Jussi", "050 424 3908", 
        "jussi.kolehmainen@gmail.com");
        
        Reservation reservation1 = new Reservation(customer, room1, "24-02-2019",
                "9:00", "14:00", 5);
        
        Reservation reservation2 = new Reservation(customer2, room1, "24-02-2019",
                "12:45", "15:46", 5);
        
        customer.bookReservation(reservation1);
        customer2.bookReservation(reservation2);
        
        
    }
}
