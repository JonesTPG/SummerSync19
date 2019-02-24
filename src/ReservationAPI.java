/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joonas
 */

//simple API to explain how the reservations should be handled.
public interface ReservationAPI {
    
    boolean validateReservation(Reservation reservation);
    
    boolean checkAvailability(Reservation reservation);
    
    void bookReservation(Reservation reservation);
    
    void cancelOperation(Reservation reservation);
}
