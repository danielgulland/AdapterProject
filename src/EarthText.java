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


	/**
	 * Sends a message in the respective language.
	 *
	 * @param languageType the language that it's going to be translated to
	 * @param fileName the file to be read from
	 * @throws InvalidLanguageException
	 */
	@Override
	public void sendMessage(String languageType, String fileName) throws InvalidLanguageException {

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
			throw new InvalidLanguageException(languageType);
	}

	/**
	 * reads a message from a file
	 *
	 * @param fileName file to be read from
	 */
	@Override
	public void readMessage(String fileName) {
		java.io.File f1 = new java.io.File(fileName);
		try {
			Scanner input = new Scanner(f1);
			System.out.println(input.nextLine());
			
			input.close();
		} catch (FileNotFoundException fnf) {
			System.out.println("File: " + fileName + " does not exist");
		}
	}
}
