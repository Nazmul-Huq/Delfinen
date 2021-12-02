package FileHandler;

import Admin.TrainingResult;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.HashMap;

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


    /**
     * Nazmul
     * method to save top swimmer (after statistical calculations) as pdf in folder files >> top_swimmer_pdf_files
     */
    public void saveTopSwimmerAsPdf(HashMap<Integer, Integer> swimmerInformation, String fileName){

        try {

            // create pdf document and a blank page
            PDDocument document = new PDDocument();
            PDPage blankPage = new PDPage();

            // add blank page to current document
            document.addPage(blankPage);

            // will need to print players position
            int position  = 1;

            // write in the document
            PDPageContentStream contentStream = new PDPageContentStream(document, blankPage);
            // select font type and size
            contentStream.setFont( new PDType1Font(Standard14Fonts.FontName.HELVETICA_BOLD), 12 );
            //start writing txt
            contentStream.beginText();
            // select position to start writing
            contentStream.setLeading(14.5f);
            contentStream.newLineAtOffset(50, 700);

            // write the information
            contentStream.showText("Top 5 swimmers");
            contentStream.newLine();
            contentStream.showText("Position" + "    " + "Swimmer Id " + "    " + "Timing");
            contentStream.newLine();
            contentStream.showText("---------------------------------------------------------------------");
            contentStream.newLine();
            for (Integer key: swimmerInformation.keySet()) {
                contentStream.showText(position + "                     " + key + "                     " + swimmerInformation.get(key));
                contentStream.newLine();
                position++;
            }
            contentStream.newLine();
            contentStream.showText("---------------------------------------------------------------------");
            contentStream.newLine();
            contentStream.showText("File was created at: " + new Date());
            contentStream.newLine();

            // finish writing and close the document
            contentStream.endText();
            contentStream.close();

            //save as pdf
            document.save("Files/top_swimmer_pdf_files/"+ fileName + ".pdf");
            System.out.println("File successfully saved as pdf. Find file at "+"Files/top_swimmer_pdf_files/"+ fileName + ".pdf");
        } catch (Exception e){
            System.out.println("file failed to add");
        }
    }


} // class ends here
