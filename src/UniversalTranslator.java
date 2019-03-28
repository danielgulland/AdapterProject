/* John Bui & Daniel Gulland
   March 27, 2019
   Purpose: translator which converts the Earth language into an alien language.
   Inputs: alien text message, language, input file
   Outputs: n/a
 */
public class UniversalTranslator implements EarthCellPhone {
    private AlienCellPhone alienTextMessage;

    /**
     * default constructor
     */
    public UniversalTranslator(){}

    /**
     * initializes alienTextMessage to the parameter
     *
     * @param alienTextMessage
     */
    public UniversalTranslator(AlienCellPhone alienTextMessage) {
        this.alienTextMessage = alienTextMessage;
    }

    /**
     * Sends a message in the respective language.
     *
     * @param languageType the language that it's going to be translated to
     * @param fileName the file to be read from
     */
    @Override
    public void sendMessage(String languageType, String fileName) {
        System.out.println(languageType + " Message Sent");
    }

    /**
     * Translates to the respective alien language
     *
     * @param fileName file to be read from
     */
    @Override
    public void readMessage(String fileName) {
        System.out.println("Translating...");
        alienTextMessage.alienReadText(fileName);
    }

    /**
     * string representation of a UniversalTranslator object
     *
     * @return string representation of a UniversalTranslator object
     */
    public String toString() {
        return "This is a UniversalTranslator object.\n";
    }
}
