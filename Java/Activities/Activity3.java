package activities;

import static java.lang.Math.round;

public class Activity3 {
    public static void main(String[] args){
        //To calculate age from seconds as input
        double seconds = 1000000000;

        double EarthSeconds = 31557600; //365.25 days
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;
        System.out.println("Age in seconds to years:");

        System.out.println("Earth years: "+(seconds/EarthSeconds));
        System.out.println("Mercury years: "+seconds/EarthSeconds/MercurySeconds);
        System.out.println("Venus years: "+seconds/EarthSeconds/VenusSeconds);
        System.out.println("Mars years: "+seconds/EarthSeconds/MarsSeconds);
        System.out.println("Jupiter years: "+seconds/EarthSeconds/JupiterSeconds);
        System.out.println("Saturn years: "+seconds/EarthSeconds/SaturnSeconds);
        System.out.println("Uranus years: "+seconds/EarthSeconds/UranusSeconds);
        System.out.println("Neptune years: "+seconds/EarthSeconds/NeptuneSeconds);
    }
}
