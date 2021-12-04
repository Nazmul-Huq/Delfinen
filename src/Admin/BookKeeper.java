package Admin;


import FileHandler.DelfinFileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookKeeper {
    Scanner scanner = new Scanner(System.in);

    //Read the text file

    //Find members name in members-file
    public void findMemberName() throws FileNotFoundException {
        System.out.println("Input members name...");
        String membersName = scanner.nextLine();

        Scanner scanFile = new Scanner(new File("Files/members.txt"));
        while (scanFile.hasNext()) {
            String searchName = scanFile.next();
        }
    }
}
