package FileHandler;

import Admin.Admin;
import Admin.BookKeeper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DelfinFileReader {

    /**
     * Nazmul
     * read the training data
     */
    public ArrayList<String> getTrainingResult(){
        ArrayList<String > trainingResults = new ArrayList<String>();
        try{
            Scanner scanner = new Scanner(new File("Files/training_result.txt"));

            String individualRecord;
            while (scanner.hasNext()){
                individualRecord = scanner.nextLine();
                trainingResults.add(individualRecord);
            }

        } catch (Exception e){

            System.out.println("File reading failed");
        }
        return trainingResults;
    }

    /**
     * Søs
     * read the member file
     */

    public ArrayList<String> getMemberInformation() {
        ArrayList<String> memberInformation = new ArrayList();

        try {
            Scanner scanFile = new Scanner(new File("Files/members.txt"));

            while (scanFile.hasNextLine()) {
                String memberDetails = scanFile.nextLine();

                memberInformation.add(memberDetails);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
        return memberInformation;
    }
}
