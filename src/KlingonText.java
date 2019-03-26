import java.io.FileNotFoundException;
import java.util.Scanner;

public class KlingonText implements AlienCellPhone {
    @Override
    public void alienSendText(String fileName) {
		//Do not need to implement
    }

    @Override
    public void alienReadText(String fileName) {
        java.io.File f1 = new java.io.File(fileName);
        try {
            Scanner input = new Scanner(f1);
            System.out.println("Klingon: ");
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
        java.io.File iFile = new java.io.File(fileName);
        StringBuilder sb = new StringBuilder();
        try{
            Scanner input = new Scanner(iFile);
            String line = input.nextLine();
            sb = new StringBuilder(line);
            input.close();
        }catch(FileNotFoundException fnf){
            System.out.println("Input file does not exist");
        }

        return(sb.reverse().toString());
    }
}
