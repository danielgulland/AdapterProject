/* John Bui & Daniel Gulland
   March 27, 2019
   Purpose: main, to test our project
   Inputs: none
   Outputs: none
 */
public class Tester {
    public static void main(String[] args) {
		EarthText et = new EarthText();
		EarthText et2 = new EarthText();
		
		try {
			et.sendMessage("Earth", "Earth.txt2");
			et.sendMessage("Earth", "Earth.txt");
			et2.readMessage("Earth.txt");

			System.out.println();

			et.sendMessage("Klingon", "Klingon.txt");
			UniversalTranslator ut = new UniversalTranslator(new KlingonText());
			EarthCellPhone e3 = ut;
			e3.readMessage("Klingon.txt");

			System.out.println();

			et.sendMessage("Vulcan", "Vulcan.txt");
			ut = new UniversalTranslator(new VulcanText());
			e3 = ut;
			e3.readMessage("Vulcan.txt");

			System.out.println();

			et.sendMessage("non-fed", "non-fed.txt");

		} catch(InvalidLanguageException i) {
			System.out.println(i.getMessage());
		}
    }
}
