package activities;

public class BiCycle implements BicycleOperations,BicycleParts{
    public int gears;
    public int speed;
    BiCycle(int gears,int speed){
       this.gears=gears;
       this.speed=speed;
    }
    @Override
    public void applyBrake(int decrement) {
speed-=decrement;
        System.out.println("Brake applied at : "+ speed);
    }

    @Override
    public void SpeedUp(int increment) {
speed+=increment;
        System.out.println("Speed Up is: "+speed);
    }
    public String bicycleDesc() {
        return("No of gears are "+ gears + " Speed of bicycle is " + speed);
    }
}
