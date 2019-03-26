import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class EarthText implements EarthCellPhone {

    private ArrayList<String> validLanguages;

    public EarthText() {
        validLanguages = new ArrayList<>();
		validLanguages.add("Earth");
		validLanguages.add("Klingon");
		validLanguages.add("Vulcan");
    }
	
	
    @Override
    public void sendMessage(String languageType, String fileName) {
		
		if(validLanguages.contains(languageType) == true)
		{
			if(languageType == "Earth")
				System.out.println(languageType + " Message Sent");
			else
				//Adapter pattern stuff?
		}
		
		else
			System.out.println("Not a supported language.");

    }

	//Simple Reader
    @Override
    public void readMessage(String fileName) {
		java.io.File f1 = new java.io.File(fileName);
		try{
			Scanner input = new Scanner(f1)
			while(input.hasNext())
			{
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
		}
		catch (FileNotFoundException fnf){
			System.out.println("File: " + fileName + " does not exist");
    }
}
