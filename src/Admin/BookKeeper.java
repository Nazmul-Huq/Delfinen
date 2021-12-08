package Admin;

import FileHandler.DelfinFileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Written by Søs
 */

public class BookKeeper {
    Scanner scanner = new Scanner(System.in);
    DelfinFileReader delfinFileReader = new DelfinFileReader();
    ArrayList<String> memberInformation = delfinFileReader.getMemberInformation();

    private final int passivePrice = 500;
    private final int activeUnder18Price = 1000;
    private final int activeOver18Price = 1600;
    private final int activeOver60Price = 1200;


    //Find members name in members file
    public String findMemberName() {
        System.out.println("Input members name...");
        String membersName = scanner.nextLine();
        String membersData = "";

        for (int i = 0; i < memberInformation.size(); i++) {
            String lineOfInformation = memberInformation.get(i);

            String[] membersList = lineOfInformation.split(",");

            String fullName = membersList[1];

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

    public void calculateIncome() {

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
                    passiveIncome = passivePrice;
                } else {

                    if (membershipType.equalsIgnoreCase("active") && age < 18) {
                        incomeUnder18 = activeUnder18Price;
                    } else if (membershipType.equalsIgnoreCase("active") && age >= 60) {
                        incomeOver60 = activeOver60Price;
                    } else {
                        incomeOver18 = activeOver18Price;
                    }
                }
                clubIncome = passiveIncome + incomeUnder18 + incomeOver60 + incomeOver18;

                System.out.println(clubIncome);
            }
        } catch (Exception e) {

        }
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
        }
        catch (Exception e) {

        }
    }
}

