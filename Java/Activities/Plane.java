package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {

    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
   Plane( int maxPassengers){
       this.maxPassengers=maxPassengers;
       this.passengers=new ArrayList<>();
   }
   public void onBoard(String passenger){
       passengers.add(passenger);
   }
   public Date takeOff(){
       Date lastTimeTookOf=new Date();
       return lastTimeTookOf;
   }
   public Date land(){
       Date lastTimeLanded=new Date();
       this.passengers.clear();
 return lastTimeLanded;
   }
   public Date getLastTimeLanded(){
       return lastTimeLanded; 
   }
   public List<String> getPassengers(){
       return passengers;
   }
}
