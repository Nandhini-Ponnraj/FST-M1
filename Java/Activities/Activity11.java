package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
        //Hash map
        Map<Integer,String> colours=new HashMap<Integer,String>();
colours.put(1,"Blue");
colours.put(2,"Red");
colours.put(3,"Orange");
colours.put(4,"Pink");
colours.put(5,"Black");
        System.out.println("Printing the Map: ");
        for(String color:colours.values()){
            System.out.println(color);
        }
        System.out.println("Removing Orange: "+colours.remove(3));
        System.out.println("Is Green present:"+colours.containsValue("Green"));
        System.out.println("Size of the map: "+colours.size());
        System.out.println("Printing the Map after removing Orange: ");
        for(String color:colours.values()){
            System.out.println(color);
        }
    }
}
