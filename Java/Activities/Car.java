package activities;

public class Car {
    String color;
    String transmission;
    int make,tyres,doors;

    public Car(String color,String transmission,int tyres, int doors){

        this.color=color;
        this.transmission=transmission;
        this.tyres=4;
        this.doors=4;
    }
    public void displayCharactersitics(){
        System.out.println("Color is " +this.color);
        System.out.println("Transmission is "+this.transmission);
        System.out.println("Tyres are " +this.tyres);
        System.out.println("Doors are " +this.doors);
    }
    public void accelerate(){
System.out.println("Car is moving forward");
    }
    public void brake(){
        System.out.println("Car has stopped");
    }
}
