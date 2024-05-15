package activities;

public class Activity6 {
    public static void main(String[] args) {
Plane plane=new Plane(10);
plane.onBoard("Amy");
        plane.onBoard("Raj");
        plane.onBoard("Krish");
        plane.onBoard("Nira");
        System.out.println("Take Off time: "+plane.takeOff());
        System.out.println("Passengers List: " +plane.getPassengers());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Landing time: " +plane.land());

    }
}
