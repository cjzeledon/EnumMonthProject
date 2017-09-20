package com.example;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // Month month = new Month();
    // month.getEnglishName();

        //Ask the user (using Scanner) to choose one of the
        // months (show the month using the English name)
        Scanner input = new Scanner(System.in);
        System.out.println("Give me your choice of Month. Be very careful...some month have violent and terrible tendencies...");
        String choice = input.nextLine();
        //System.out.println("You said:" + careful);
        input.close();


        /*
        In an ArrayList add all the months for the given month and
        all the following months. This can be done many ways but
        an elegant solution can be coded using a switch statement.

        FIGURE OUT THE LOGIC ON THIS:

        Ask the user to input what Month
        Find what month that is
        Add that month and the rest of the months afterward
        */

        ArrayList<Month> stupidArray = new ArrayList<>();
        int monthIndex = 0;
        boolean isExist = false;
        Month monthUserPicked = null;
        for (Month stupidMonth : Month.values()){
            // System.out.println(choice.equals(stupidMonth.getEnglishName()));
            // System.out.println();

            if (choice.equals(stupidMonth.getEnglishName())){
                monthUserPicked = stupidMonth;
            // System.out.println(stupidMonth.getEnglishName().indexOf(choice));
            // System.out.println(stupidArray.indexOf(choice));
            }
        }
        Month[] dumbMonthArray = Month.values();
        int tempIndex = 13;
        for(int i = 0; i < dumbMonthArray.length; i++) {
            if (dumbMonthArray[i].equals(monthUserPicked)) {
                tempIndex = i;
            }
            if(i >= tempIndex) {
                stupidArray.add(dumbMonthArray[i]);
            }
        }
        System.out.println(stupidArray);
        // System.out.println(monthUserPicked.getEnglishName());
    }
}
