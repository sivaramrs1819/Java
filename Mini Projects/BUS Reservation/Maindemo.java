package BusReserv;

import java.util.Scanner;
import java.util.ArrayList;

public class Maindemo {
    public static void main(String[] args) {

        ArrayList<Bus> Buses = new ArrayList<>();
        ArrayList<Booking> Bookings = new ArrayList<>();

        Buses.add(new Bus(1,true,2));
        Buses.add(new Bus(2, false, 40));
        Buses.add(new Bus(3, true, 55));

        int UI = 1;
        Scanner UserInput = new Scanner(System.in);

        for (Bus i : Buses) {
            i.displayInfo();
        }

        while (UI == 1) {
            System.out.println("Enter 1 to book and 2 to exit");
            UI = UserInput.nextInt();
            if(UI == 1){
                Booking booking = new Booking();
                if (booking.isAvailable(Bookings,Buses)) {
                    Bookings.add(booking);
                    System.out.println("Booking confirmed");
                }
                else
                    System.out.println("nah man");
            }
        }
        UserInput.close();
    }
}