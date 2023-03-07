package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    /*System.out.println(strArray1[0]);*/
    for ( int i = 0; i < weekdays.length; i++) {
        /*System.out.println(weekdays[i]);*/
    }

    String[] weeklyChores = {"Laundry", "Mopping", "De-Clutter Box", "Groceries", "Cooking", "Dusting", "Bathrooms", "Put Away Rooms", "Process Papers"};
        System.out.println("Your Weekly Chores are: ");
        for ( int i = 0; i < weeklyChores.length; i++) {
            System.out.println(weeklyChores[i]);
        }

    String[] dailyChores = {"Dishes", "Box all Clutter", "Toys", "Sweeping", "Trash"};
        System.out.println("\nYour Daily Chores are: ");
        for ( int i = 0; i < dailyChores.length; i++) {
            System.out.println(dailyChores[i]);
        }

        Scanner userInput = new Scanner(System.in);
        System.out.println("What day is today?");
        String userDay = userInput.nextLine();
        /*System.out.println(userDay);*/

        /* next step is learn to assign user's input day as a string, back
        to the corresponding number in the array of Days of the week.
        Then get code to return what chore needs to be done based on the
        day entered. Still figuring out how I want this to work, baby steps.
         */





        /*if (userInput == 0) {
            System.out.println("Your chores today should be " + weeklyChores[0] + dailyChores[0] + ".");
        }*/
    }




}