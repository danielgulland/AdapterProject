import java.io.FileNotFoundException;
import java.util.Scanner;

public class VulcanText implements AlienCellPhone {
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
        // There needs to be a try catch block, or change the signature to
        //      alienReadText(String fileName) throws FileNotFoundException
        // But, idk if this try catch makes sense cuz we're just writing to a file in translateText
        //      so the file is always gonna be valid.
        try {
            Scanner input = new Scanner(f1);
            System.out.println(input.nextLine());
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
        String outputFile = "outVulcan.txt";
        try {
            java.io.File iFile = new java.io.File(fileName);
            // Reads the line in the file
            Scanner input = new Scanner(iFile);
            String line = input.nextLine();
            input.close();

            // Reverses the string and outputs to the output file.
            String newString = changeString(line);
            java.io.PrintWriter outFile = new java.io.PrintWriter(outputFile);
            outFile.println(newString);
            outFile.close();
        } catch(FileNotFoundException fnf) {
            System.out.println(fileName + " does not exist");
        }
        return outputFile;
    }

    /**
     * translates by switching each character from uppercase to lowercase. i.e. "hElLo WoRlD"
     * @param text the text that's getting translated
     * @return the translated text
     */
    private String changeString(String text) {
        String lowerCase = text.toLowerCase();
        String upperCase = text.toUpperCase();
        String newText = "";
        for(int i = 0; i < text.length(); i++) {
            if(i % 2 == 0)
                newText += lowerCase.charAt(i);
            else
                newText += upperCase.charAt(i);
        }
        return newText;
    }
}
