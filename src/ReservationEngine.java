
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
class ReservationEngine implements ReservationAPI{

   private static ReservationEngine instance = null;
   
   long operationId;
   final int OPERATION_TIMEOUT_LIMIT;
   ArrayList <String> currentOperations;
   ArrayList <Reservation> allReservations;
   
   private ReservationEngine() {  
       this.operationId = 0;
       this.OPERATION_TIMEOUT_LIMIT = 30;
       this.currentOperations =  new ArrayList<>();
       this.allReservations = new ArrayList<>();
   }
   
   public static ReservationEngine getInstance() {
       if (instance == null) {
           instance = new ReservationEngine();
           
       }
       return instance;
   }

    //creates a new operation that will try to reserve the room.
    public boolean newReservationOperation(Reservation reservation) {
        this.operationId++;
        long operationId = this.operationId;
        String id = Long.toString(operationId);
        System.out.println("New reservation task...");
        System.out.println("Task id: " + id);
        System.out.println("Reservation task was submitted by customer named "
                + reservation.getCustomer().name);
        currentOperations.add(id);
        
        //check the reservation content
        if (this.validateReservation(reservation) == false) {
            System.out.println("Reservation body invalid.");
            return false;
        }
        
        //reservation can be made.
        if ( this.checkAvailability(reservation) ) {
            this.bookReservation(reservation);
            System.out.println("Reservation ID "+id+" was submitted succesfully." );
            return true;
        }
        
        else {
            
            return false;
        }
        
    }
   
    public void showOnGoingOperations() {
        for (int i = 0; i < this.currentOperations.size(); i++) {
            System.out.println("Operation no. " + i + ". ID: " + 
                    this.currentOperations.get(i));
        }
    }
   
    @Override
    //check that the reservation body is valid
    public boolean validateReservation(Reservation reservation) {
        Reservation i = reservation;
        if (i.getAmountOfPersons() == 0 || i.getCustomer() == null || i.getEndTime() == null
                || i.getRoom() == null || i.getStartTime() == null || i.getDate() == null) {
            return false;
        }
        return true;
    }

    @Override
    public boolean checkAvailability(Reservation reservation) {
        ArrayList<Reservation> a = this.allReservations;
        
        return AvailabilityChecker.checkAvailability(reservation, a);
    
    }

    @Override
    public void bookReservation(Reservation reservation) {
        this.allReservations.add(reservation);
    }


    @Override
    public void cancelOperation(Reservation reservation) {
        System.out.println("Operation cancelled.");
    }
   
   
    
}
