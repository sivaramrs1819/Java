package BusReserv;

public class Bus {
    private int Bus_no;
    private boolean ac;
    private int capacity;

    Bus(int num,boolean acie,int cap){
        Bus_no  = num;
        ac = acie;
        capacity = cap;
    }

    public int getBus_no(){
        return Bus_no;
    }

    public boolean getAc(){
        return ac;
    }
    public void setAc(boolean val){
        ac = val;
    }

    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int val2){
        capacity = val2;
    }

    public void displayInfo(){
        System.out.println("Bus_No : " + Bus_no + "AC Availability : " + ac + "Bus Capacity : " + capacity);
    }
}