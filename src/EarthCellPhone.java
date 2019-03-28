/* John Bui & Daniel Gulland
   March 27, 2019
   Purpose: interface that provides generic methods: send, read
   Inputs: n/a
   Outputs: n/a
 */
public interface EarthCellPhone {
    /**
     * Sends a message in the respective language.
     *
     * @param languageType the language that it's going to be translated to
     * @param fileName the file to be read from
     * @throws InvalidLanguageException
     */
    public void sendMessage(String languageType, String fileName) throws InvalidLanguageException;

    /**
     * reads a message from a file
     *
     * @param fileName file to be read from
     */
    public void readMessage(String fileName);
}
