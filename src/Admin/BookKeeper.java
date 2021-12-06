package Admin;

import FileHandler.DelfinFileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookKeeper {
    Scanner scanner = new Scanner(System.in);
    DelfinFileReader delfinFileReader = new DelfinFileReader();


    private boolean passiveOrNot;
    private boolean active;
    private boolean passive;
    private boolean activeUnder18;
    private boolean activeOver18;
    private boolean activeOver60;



    public BookKeeper(boolean passiveOrNot, boolean active) {
        this.passiveOrNot = passiveOrNot;
        this.active = active;


    }

    //Find members name in members file
    public String findMemberName() throws FileNotFoundException {
        System.out.println("Input members name...");
        String membersName = scanner.nextLine();
        String membersData = "";

        ArrayList<String> memberInformation = delfinFileReader.getMemberInformation();

        for (int i = 0; i < memberInformation.size(); i++) {
            String line = memberInformation.get(i);

            String[] membersList = line.split(",");

            String fullName = membersList[1];

            if (membersName.equalsIgnoreCase(fullName)) {
                membersData = line;

                break;
            }
        }
        return membersData;
    }

    public void calculateFees() throws FileNotFoundException {
        ArrayList<String> memberInformation = delfinFileReader.getMemberInformation();

        String membersData = findMemberName();
        String[] membersList = membersData.split(",");

        int id = Integer.parseInt(membersList[0]);
        String fullName = membersList[1];
        int phoneNumber = Integer.parseInt(membersList[2]);
        String email = membersList[3];
        int age = Integer.parseInt(membersList[4]);
        String membershipType = membersList[5];

        //Find out if member is passive, if true membership price is "passive"
        if (membershipType.equalsIgnoreCase("passive")) {
            System.out.println("Members gonna pay 500 kr.");
        } else if (membershipType.equalsIgnoreCase("active"))

            if (age < 18) {
                System.out.println("Members gonna pay 1000 kr.");
            } else if (age >= 60 ) {
                System.out.println("Members gonna pay 1200 kr.");
            } else {
                System.out.println("Members gonna pay 1600 kr.");
            }
    }

    public void calculateClubIncome() {
        ArrayList<String> memberInformation = delfinFileReader.getMemberInformation();
        int clubIncome = 0;
        //Get
        //Get all the members memberships and calculate that
        for (int i = 0; i < ; i++) {


        }

    }

    public void calculateMemberDebts() {


    }

}

