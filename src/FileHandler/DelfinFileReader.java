package FileHandler;

import Admin.BookKeeper;

import java.io.File;
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

    public static ArrayList<String> getMembersList() {
        ArrayList<String> membersInfo = new ArrayList<>();

        try {
            Scanner scanFile = new Scanner(new File("Files/members.txt"));

            String individualInfo;
            while (scanFile.hasNext()) {
                individualInfo = scanFile.nextLine();
                membersInfo.add(individualInfo);


            }

        } catch (Exception e) {
            System.out.println("File not found!");
        }
        return membersInfo;
    }
}
