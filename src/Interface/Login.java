package Interface;

import java.io.File;
import java.util.Scanner;

public interface Login {

    public static void verifyLogin(String username, String password, String filepath) {

        boolean found = false;
        String inputUsername = "";
        String inputPassword = "";

        try{
            Scanner scanFile = new Scanner(new File("Files/logins.txt"));
            scanFile.useDelimiter("[,\n]");

            while (scanFile.hasNext() && !found) {

                System.out.println("Please write your username...");
                username = scanFile.next();
                System.out.println("Please write your password...");
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
