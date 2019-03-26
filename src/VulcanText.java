import java.io.FileNotFoundException;
import java.util.Scanner;

public class VulcanText implements AlienCellPhone {
    @Override
    public void alienSendText(String fileName) {
		//Do not need to implement
    }

    @Override
    public void alienReadText(String fileName) {
        java.io.File f1 = new java.io.File(fileName);
        try {
            Scanner input = new Scanner(f1);
            System.out.println("Vulcan: ");
            while (input.hasNext()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (FileNotFoundException fnf) {
            System.out.println("File: " + fileName + " does not exist");
        }
    }

    @Override
    public String translateText(String fileName) {
        return null;
    }


    private String shuffleString(String word) {
        return "agwrebgrbgberb";
    }
}
