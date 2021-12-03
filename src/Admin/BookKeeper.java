package Admin;

import java.util.ArrayList;
import java.util.Scanner;

public class BookKeeper {

    //Search for a person using their name from Chairman
    public void findMember() {

        ArrayList<String> membersList = new ArrayList<>();
        //Find member from text file, get ArrayList
        try {
            Scanner scanner = new Scanner("Files/members.txt");
            String membersNames;

            while (scanner.hasNextLine()) {
                membersNames = scanner.nextLine();

                String[] members = membersNames.split(",");
            }
        }


        //Search arraylist for id
        //If we find the id, copy information for id
        }



    //

    //Calculate fees depending on membership types
    public void calculateFees() {

        //Find the member through id, taken from the method "findMember"



    }

    //Calculate the total income of the club
    public void calculateIncome() {

    }
    //Finding a persons debt
    public void calculateDebt() {

    }

    //Trying to predict future income of the club
    public void calculateFutureIncome() {

    }

}
