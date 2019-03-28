/* John Bui & Daniel Gulland
   March 27, 2019
   Purpose:
   Inputs:
   Outputs;
 */
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

		if (validLanguages.contains(languageType)) {
			try{
				java.io.File f1 = new java.io.File(fileName);
				// Seems we have to test f1 somehow, and an easy way is to use a Scanner object.
//				 		If we don't have this, it'll say "FileNotFoundException is never thrown"
				Scanner input = new Scanner(f1);
				System.out.println(languageType + " Message Sent");
			}
			catch (FileNotFoundException fnf) {
				System.out.println(fileName + " doesn't exist");
			}
		}
		else
			try {
				throw new InvalidLanguageException(languageType);
			}
			catch(InvalidLanguageException ile){
				System.out.println(ile.getMessage());
			}

	}

	//Simple Reader
	@Override
	public void readMessage(String fileName) {
		java.io.File f1 = new java.io.File(fileName);
		try {
			Scanner input = new Scanner(f1);
			while (input.hasNext()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
		} catch (FileNotFoundException fnf) {
			System.out.println("File: " + fileName + " does not exist");
		}
	}
}
