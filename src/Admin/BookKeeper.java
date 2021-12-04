package Admin;


import FileHandler.DelfinFileReader;

import java.util.Scanner;

public class BookKeeper {
    Scanner scanner = new Scanner(System.in);

    //Read the text file

    //Find members name in members-file
    public void findMemberName() {
        System.out.println("Input members name...");
        int membersName = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < DelfinFileReader.getMembersList().size(); i++) {
            String nameToFind = DelfinFileReader.getMembersList().get(i);

            if ((nameToFind.equals(membersName))){
                System.out.println();

            }



        }
    }
}
