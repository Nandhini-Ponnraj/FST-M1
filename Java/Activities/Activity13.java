package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

    public static void main(String[] args) {
        Random indexGen=new Random();
        System.out.println("Enter Integers: ");
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> number = new ArrayList<Integer>();
        while (scan.hasNextInt()) {
            number.add(scan.nextInt());
        }
        scan.close();
       Integer[] arr=number.toArray(new Integer[0]);
        int index = indexGen.nextInt(arr.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value for generated index: " + arr[index]);

    }

}
