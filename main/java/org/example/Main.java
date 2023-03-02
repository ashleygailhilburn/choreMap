package org.example;

public class Main {
    public static void main(String[] args) {

    String[] weekdays = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    /*System.out.println(strArray1[0]);*/
    for ( int i = 0; i < weekdays.length; i++) {
        /*System.out.println(weekdays[i]);*/
    }

    String[] weeklyChores = {"Laundry", "Mopping", "De-Clutter Box", "Groceries", "Cooking", "Dusting", "Bathrooms", "Put Away Rooms", "Process Papers"};
    /*System.out.println(weeklyChores[5]);*/
        System.out.println("Your Weekly Chores are: ");
    for ( int i = 0; i < weeklyChores.length; i++) {
        System.out.println(weeklyChores[i]);
    }
        System.out.println("\nYour Daily Chores are: ");
    String[] dailyChores = {"Dishes", "Box all Clutter", "Toys", "Sweeping", "Trash"};
    /*System.out.println(dailyChores[3]);*/
    for ( int i = 0; i < dailyChores.length; i++) {
        System.out.println(dailyChores[i]);
    }


    }
}