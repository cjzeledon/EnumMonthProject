# Enum Months Project
List months after a given month

For this project you will be<br>

- Showing a list of months and asking the user to choose one<br>
- Creating a list of months from the given month to the end of the year<br>
- Displaying the months<br>

Note: it will take you at least 12 months to complete this project.<br>

# Getting Started

Open up a new project in IntelliJ.<br>

If you don't have a Main.java in the src directory create one and give it a public static void main(String[] args) method.<br>

# packaging

In the project window right click on src in the project window and then click New and then click package. Enter "com.example" (without the double quotes).<br>

Notice that under src you now see com.example which is the package.<br>

Notice also that Main does not have a package statement as the first line.<br>

Now refactor Main to move it to the package<br>

- Right click on Main<br>
- Click Refactor and then Move...<br>
- In the pop-up dialog window enter com.example in the To package field and click Refactor<br>
- Notice that Main now has a package statement as the first line and that it has moved under the package in the project window.<br>

Packaging is a way to group Java classes.<br>

Right click on the com.example package and create a new package named "common".<br>

# Assignment

We are going to put the Java enumeration is the common package.<br>

- Right click on the common package and then click New and then click Java Class.<br>
- Change the Kind to Enum and enter Month for the name and then click OK.<br>
- Enums in Java are typically singular (Month, not Months).<br>

In the Month enum add the constants JANUARY through DECEMBER.<br>

Also add a private variable englishName which should be set to January through December and a getter.<br>

In Main ask the user (using Scanner) to choose one of the months (show the month using the English name)<br>

In an ArrayList add all the months for the given month and all the following months. This can be done many ways but an elegant solution can be coded using a switch statement.<br>

Show the list to the user.<br>