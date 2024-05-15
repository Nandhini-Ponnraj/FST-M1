package activities;

import java.util.HashSet;

public class Activity10 {
    //HashSet
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(71);
        hs.add(38);
        hs.add(27);
        hs.add(12);
        hs.add(99);
        hs.add(65);
        System.out.println("Size of the set: "+hs.size());
        System.out.println("Removing element 9: "+hs.remove(99));
        System.out.println("Removing non-existing element: "+hs.remove(8));
        System.out.println("Checking whether the Set contains element 12: "+hs.contains(12));
        for(int n:hs){
            System.out.println("Set contains: " +n);
        }
    }
}
