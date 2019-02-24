
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

//helper class to check if the reservations have conflicts
public class AvailabilityChecker {
    
    
    public static boolean checkAvailability(Reservation a, ArrayList<Reservation> all) {
        //first filter the arrays so that it only has relevant reservations
        ArrayList<Reservation> filtered = filter(a, all);
        //then check if there are conflicts in the scheduled times, and return the result.
        return checkTimes(a, filtered);
        
    }
    
    
    //checks if the reservations have conflicts.
    private static boolean checkTimes(Reservation a, ArrayList<Reservation> all) {
        
        String aStartHour = a.getStartTime().split(":")[0];
        String aStartMinutes = a.getStartTime().split(":")[1];
        int aStart = Integer.parseInt(aStartHour+aStartMinutes);
        
        String aEndHour = a.getEndTime().split(":")[0];
        String aEndMinutes = a.getEndTime().split(":")[1];
        int aEnd = Integer.parseInt(aEndHour+aEndMinutes);
        
        System.out.println("The new reservation is to be scheduled at " + a.getStartTime()
        + "-" + a.getEndTime());
        
        // if the filtered list doesn't have anything on it, the reservation can be made
        // as long as the times are proper office times. (8-16)
        if (all.isEmpty()) {
            if (aStart < 800 || aEnd > 1600) {
                System.out.println("Reservation is not possible outside office hours.");
                return false;
            }
            else {
                 return true;
            }
           
        }
        else {
            
            for (int i=0; i<all.size(); i++) {
                Reservation b = all.get(i);
                String bStartHour = b.getStartTime().split(":")[0];
                String bStartMinutes = b.getStartTime().split(":")[0];
                int bStart = Integer.parseInt(bStartHour + bStartMinutes);

                String bEndHour = b.getEndTime().split(":")[0];
                String bEndMinutes = b.getEndTime().split(":")[0];
                int bEnd = Integer.parseInt(bEndHour+bEndMinutes);

                if (aStart >= bStart && aStart < bEnd) {
                    System.out.println("There is a confliction between an existing reservation, that"
                            + " is scheduled at " + b.getStartTime() + "-" + b.getEndTime());
                    
                    return false;
                }
                else if (aStart <= bStart && aEnd > bStart ) {
                    System.out.println("There is a confliction between an existing reservation, that"
                            + " is scheduled at " + b.getStartTime() + "-" + b.getEndTime());
                    return false;
                }

                else if (aStart < 800 || aEnd > 1600) {
                    System.out.println("Reservation is not possible outside office hours.");
                    return false;
                }

            }
            
            return true;
        
        }
        
        
    }
    
    private static ArrayList<Reservation> filter(Reservation a, ArrayList<Reservation> all) {
        //returns a filtered array of reservations which have the same room and
        //date as the new reservation
        ArrayList<Reservation> filtered = new ArrayList<>();
        for (int i=0; i<all.size(); i++) {
            if (all.get(i).getRoom().equals(a.getRoom())) {
                if (all.get(i).getDate().equals(a.getDate())) {
                    
                    System.out.println("Found existing reservation(s) on the same room"
                            + " at the same day. Checking for conflicts.");
                    filtered.add(all.get(i));
                }  
            }  
        }
        
        if (filtered.isEmpty()) {
            System.out.println("Looks like there is no other previous reservations for the room"
                    + " at the given day.");
        }
        return filtered;
    }
    
}
