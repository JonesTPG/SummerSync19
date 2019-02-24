
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
        // a small driver program to test out the reservation system.
        
        Equipment exampleEq = new Equipment(true, true, 3, false, 2);
        
        
        PresentationRoom room1 = new PresentationRoom("huone1", "2201", 50, exampleEq);
        MeetingRoom room2 = new MeetingRoom("huone2", "2203", 15, exampleEq);
        
        Customer customer = new PersonalCustomer("Joonas", "050 404 3908", 
        "joonas.ryynanen1@gmail.com");
        
        Customer customer2 = new PersonalCustomer("Jaakko", "050 424 3908", 
        "jaakko.kolehmainen@gmail.com");
        
        Reservation reservation1 = new Reservation(customer, room1, "24-02-2019",
                "9:00", "14:00", 5);
        
        Reservation reservation2 = new Reservation(customer2, room1, "24-02-2019",
                "12:45", "15:46", 5);
        
        Reservation reservation3 = new Reservation(customer2, room2, "25-02-2019",
                "14:45", "15:46", 5);
        
        Reservation reservation4 = new Reservation(customer2, room2, "25-02-2019",
                "16:45", "17:46", 5);
        
        Reservation reservation5 = new Reservation(customer2, room2, "25-02-2019",
                "15:46", "16:00", 5);
        
        customer.bookReservation(reservation1);
        customer2.bookReservation(reservation2);
        customer2.bookReservation(reservation3);
        customer2.bookReservation(reservation4);
        customer2.bookReservation(reservation5);
        
        
    }
}
