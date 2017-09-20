package com.example;

/*

In the Month enum add the constants JANUARY through DECEMBER.

Also add a private variable englishName which should be set to January through December and a getter.

In Main ask the user (using Scanner) to choose one of the months (show the month using the English name)

In an ArrayList add all the months for the given month and all the following months. This can be done many
ways but an elegant solution can be coded using a switch statement.

Show the list to the user.
 */

public enum Month {

    // In the Month enum add the constants JANUARY through DECEMBER.
    JANUARY ("January"),
    FEBRUARY ("February"),
    MARCH ("March"),
    APRIL ("April"),
    JUNE ("June"),
    JULY ("July"),
    AUGUST ("August"),
    SEPTEMBER ("September"),
    OCTOBER ("October"),
    NOVEMEBER ("November"),
    DECEMBER ("December");

    //Add a private variable englishName which should be set to
    // January through December and a getter.
    Month(String englishName) {
        this.englishName = englishName;
    }

    private String englishName;

    public String getEnglishName() {
        return englishName;
    }
}
