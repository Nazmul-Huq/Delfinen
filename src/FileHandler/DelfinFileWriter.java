package FileHandler;

import Admin.TrainingResult;

import java.io.File;
import java.io.FileWriter;

public class DelfinFileWriter {


    /**
     * Nazmul
     * method to save training result to the training_result.txt file
     */
    public void saveTrainingResult(TrainingResult newTrainingResult){
        try {
            File file = new File("Files/training_result.txt");
            FileWriter fr = new FileWriter(file, true);
            fr.write(newTrainingResult + "\n");
            fr.close();
            System.out.println("Data saved successfully");
        } catch (Exception e) {
            System.out.println("Failed to add Haiku"); }
    }



} // class ends here
