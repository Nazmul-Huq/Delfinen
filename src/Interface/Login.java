package Interface;

import java.io.File;
import java.util.Scanner;

public interface Login {

    public static void verifyLogin() {

        boolean found = false;
        String username = "";
        String password = "";

        try{
            Scanner scanFile = new Scanner(new File("Files/logins.txt"));
            scanFile.useDelimiter("[,\n]");

            while (scanFile.hasNext() && !found) {

                username = scanFile.next();
                password = scanFile.next();

                if (username.trim().equals(username.trim()) && password.trim().equals(password.trim())) {

                    found = true;
                }
            }
            System.out.println(found);
        }
        catch(Exception e) {

            System.out.println("File not found");

        }
    }
}
