/* John Bui & Daniel Gulland
   March 27, 2019
   Purpose:
   Inputs:
   Outputs;
 */
public class UniversalTranslator implements EarthCellPhone {
    AlienCellPhone alienTextMessage;

    public UniversalTranslator(AlienCellPhone alienTextMessage) {
        this.alienTextMessage = alienTextMessage;
    }

    @Override
    public void sendMessage(String languageType, String fileName) {
        System.out.println(languageType + " Message Sent");
    }

    @Override
    public void readMessage(String fileName) {
        System.out.println("Translating...");
        alienTextMessage.alienReadText(fileName);
    }
}
