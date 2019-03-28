import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        //File f = new File("Earth.txt");
        //Scanner input = new Scanner(f);
        //System.out.println(input.next());
		
		EarthText et = new EarthText();
		EarthText et2 = new EarthText();

			//Earth1 sends a message to Earth, but the file does not exist
			et.sendMessage("Earth", "Earth.txt2");
//			//Earth sends a good message to Earth
			et.sendMessage("Earth", "Earth.txt");
//			//Earth2 reads the message sent by Earth1
			et2.readMessage("Earth.txt");
			et.sendMessage("Klingon", "Klingon.txt");
			UniversalTranslator ut = new UniversalTranslator(new KlingonText());
			EarthCellPhone e3 = ut;
			e3.readMessage("Klingon.txt");
			et.sendMessage("Vulcan", "Vulcan.txt");
			ut = new UniversalTranslator(new VulcanText());
			e3 = ut;
			e3.readMessage("Vulcan.txt");
			et.sendMessage("non-fed", "non-fed.txt");
    }

}
