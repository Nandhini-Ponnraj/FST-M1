package activities;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    //Arraylist
    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();
        myList.add("Book");
        myList.add("Pen");
        myList.add("Pencil");
        myList.add( "Note");
        myList.add("Sketch");
        for (String name : myList) {
            System.out.println(" " + name);
        }

        System.out.println("3rd name in the array list is : " + myList.get(2));


        if (myList.contains("Note")) {
            System.out.println("Name:'Note' exists in the arraylist");
        } else {
            System.out.println("Name doesn't exists in the arraylist");
        }
        System.out.println("No of names in the arraylist: " + myList.size());
        myList.remove("Note");
        System.out.println("No of names in the arraylist: " + myList.size());


    }
}