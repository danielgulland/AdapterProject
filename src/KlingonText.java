/* John Bui & Daniel Gulland
   March 27, 2019
   Purpose:
   Inputs:
   Outputs;
 */

import java.io.FileNotFoundException;
import java.util.Scanner;

public class KlingonText implements AlienCellPhone {
    /**
     * N/A
     * @param fileName, name of the file
     */
    @Override
    public void alienSendText(String fileName) {
		//Do not need to implement
    }

    /**
     * translates the text into the alien language, then reads and outputs the translated text
     *
     * @param fileName, name of the input file
     */
    @Override
    public void alienReadText(String fileName) {

        // Open the file the translated text is.
        String outputFile = translateText(fileName);
        java.io.File f1 = new java.io.File(outputFile);

        // Read the translated text and output it.

        // There needs to be a try catch block or change the signature to
        //      alienReadText(String fileName) throws FileNotFoundException
        // But, idk if this try catch makes sense cuz we're just writing to a file in translateText
        //      so the file is always gonna be valid.
        try {
            Scanner input = new Scanner(f1);
            System.out.println("Klingon: " + input.nextLine());
        } catch (FileNotFoundException fnf) {
            System.out.println("File: " + outputFile + " does not exist");
        }
    }

    /**
     * reads a string from the input file, translates the string, then outputs the new string to the respective output file.
     *
     * @param fileName name of the input file
     * @return String, output file that has the translated text.
     */
    @Override
    public String translateText(String fileName) {
        String outputFile = "outKlingon.txt";
        try {
            java.io.File iFile = new java.io.File(fileName);
            // Reads the line in the file
            Scanner input = new Scanner(iFile);
            String line = input.nextLine();
            input.close();

            // Reverses the string and outputs to the output file.
            String reversedString = new StringBuilder(line).reverse().toString();
            java.io.PrintWriter outFile = new java.io.PrintWriter(outputFile);
            outFile.println(reversedString);
            outFile.close();
        } catch(FileNotFoundException fnf) {
            System.out.println(fileName + " does not exist");
        }

        return outputFile;
    }
}
