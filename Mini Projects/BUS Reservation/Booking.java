package BusReserv;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
import java.util.*;
public class Booking {
    int Bus_no;
    String name;
    Date date;

    Booking(){
        Scanner UserInp = new Scanner(System.in);
        System.out.println("Enter BusNo :");
        Bus_no = UserInp.nextInt();
        System.out.println("Enter Ur Name :");
        name = UserInp.next();
        System.out.println("Enter date : dd-mm-yyyy");
        String UserDate = UserInp.next();
        SimpleDateFormat sdm = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = sdm.parse(UserDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable(List<Booking> Bookings,List<Bus> Buses){
        int capacity = 0;

        for (Bus bus : Buses) {
            if(bus.getBus_no() == Bus_no){
                capacity = bus.getCapacity();
            }
        }

        int Booked = 0;
        for (Booking b : Bookings) {
            if (b.Bus_no == Bus_no && b.date.equals(date)) {
                Booked++;
            }
        }

        return Booked<capacity?true:false;
    }
}
