/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joonas
 */
abstract class Customer {
    String name;
    String phone;
    String email;
    
    public boolean bookReservation(Reservation reservation) {

        ReservationEngine engine = ReservationEngine.getInstance();
        boolean success = engine.newReservationOperation(reservation);
        return success;
    }
    
}

