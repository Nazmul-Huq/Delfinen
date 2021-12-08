package Admin;

import FileHandler.DelfinFileReader;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class written by Søs
 */

public class BookKeeper {
    //Creating a new scanner
    Scanner scanner = new Scanner(System.in);
    //Creating a new file reader
    DelfinFileReader delfinFileReader = new DelfinFileReader();
    //Calling the getMemberInformation method from delfinFileReader class in an ArrayList called membersInformation
    ArrayList<String> memberInformation = delfinFileReader.getMemberInformation();

    private final int passivePrice = 500;
    private final int activeUnder18Price = 1000;
    private final int activeOver18Price = 1600;
    private final int activeOver60Price = 1200;

    //Method to find a members name
    public String findMemberName() {
        System.out.println("Input members name...");
        //Scanning for members name in ArrayList
        String membersName = scanner.nextLine();
        String membersData = "";

        //For loop to go through the ArrayList membersInformation
        for (int i = 0; i < memberInformation.size(); i++) {
            String lineOfInformation = memberInformation.get(i);
            //Separate the data from the ArrayList with every comma
            String[] membersList = lineOfInformation.split(",");
            //Getting the index number for name in the ArrayList
            String fullName = membersList[1];
            //If statement for i
            if (membersName.equalsIgnoreCase(fullName)) {
                membersData = lineOfInformation;

                break;
            }
        }
        return membersData;
    }

    public void calculateFees() {

        String membersData = findMemberName();
        String[] membersList = membersData.split(",");

        int id = Integer.parseInt(membersList[0]);
        String fullName = membersList[1];
        int phoneNumber = Integer.parseInt(membersList[2]);
        String email = membersList[3];
        int age = Integer.parseInt(membersList[4]);
        String membershipType = membersList[5];
        String debts = membersList[6];

        //Find out if member is passive, if true membership price is "passive"
        if (membershipType.equalsIgnoreCase("passive")) {
            System.out.println(fullName + " gonna pay " + passivePrice + " kr.");
        } else if (membershipType.equalsIgnoreCase("active"))

            if (age < 18) {
                System.out.println(fullName + " gonna pay " + activeUnder18Price + " kr.");
            } else if (age >= 60) {
                System.out.println(fullName + " gonna pay " + activeOver60Price + " kr.");
            } else {
                System.out.println(fullName + " gonna pay " + activeOver18Price + " kr.");
            }
    }

    public int calculateIncome() {

        int clubIncome = 0;
        int passiveIncome = 0;
        int incomeUnder18 = 0;
        int incomeOver60 = 0;
        int incomeOver18 = 0;

        try {

            //Get all the members memberships and calculate that
            for (int i = 0; i < memberInformation.size(); i++) {
                String lineOfInformation = memberInformation.get(i);

                String[] membersList = lineOfInformation.split(",");
                int age = Integer.parseInt(membersList[4]);
                String membershipType = membersList[5];

                if (membershipType.equalsIgnoreCase("passive")) {
                    //passiveIncome = passivePrice;
                    clubIncome = clubIncome + passivePrice;
                } else {

                    if (membershipType.equalsIgnoreCase("active") && age < 18) {
                        //incomeUnder18 = activeUnder18Price;
                        clubIncome = clubIncome + activeUnder18Price;
                    } else if (membershipType.equalsIgnoreCase("active") && age >= 60) {
                        //incomeOver60 = activeOver60Price;
                        clubIncome = clubIncome + activeOver60Price;
                    } else {
                        //incomeOver18 = activeOver18Price;
                        clubIncome = clubIncome + activeOver18Price;
                    }
                }
            }
        } catch (Exception e) {

        }
        System.out.println("The current income is: " + clubIncome + " kr.");

        return clubIncome;
    }


    public void calculateDebt() {

        try {

            for (int i = 0; i < memberInformation.size(); i++) {
                String lineOfInformation = memberInformation.get(i);

                String[] membersList = lineOfInformation.split(",");
                String fullName = membersList[1];
                String debts = membersList[6];

                if (debts.equalsIgnoreCase("yes")) {

                    System.out.println(debts + ", " + "" + fullName);

                }
            }
        } catch (Exception e) {

        }
    }

    //Method to calculate how many years in the future you want to see the income
    public void calculateFutureIncome() {

        //Calling the calculateIncome method to get the current income
        int currentIncome = calculateIncome();
        //Setting the expected rate of new members to 10% yearly
        double expectedRateOfNewMembers = 0.10;
        //Setting the decimal format to get a limited digits after the full stop
        DecimalFormat numberFormat = new DecimalFormat("#.000");

        System.out.println("Please enter the period of years");
        //Setting how many years in the future you want to predict
        int year = scanner.nextInt();

        //Calculate the future income
        double futureIncome = currentIncome * Math.pow((1 + expectedRateOfNewMembers), year);
        //Change the future incomes decimal numbers
        String formatIncome = numberFormat.format(futureIncome);

        System.out.println("Expected income in " + year + " years: "  + formatIncome + " kr.");
    }
}

