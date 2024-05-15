package activities;

public class MountainBike extends BiCycle {

    int seatHeight;

    MountainBike(int gears,int speed, int seatHeight){
        super(gears,speed);
this.seatHeight=seatHeight;
    }
public int setHeight(int newHeight){
seatHeight=newHeight;
    System.out.println("Height is: "+seatHeight);
return seatHeight;
}

    @Override
    public String bicycleDesc() {
        return ( super.bicycleDesc()+ " Seat height is: " +seatHeight);

    }

    public static void main(String[] args) {
        MountainBike M=new MountainBike(5,12,3);
        M.applyBrake(8);
        M.SpeedUp(6);
        System.out.println(M.bicycleDesc());
    }

}
