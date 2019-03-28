/* John Bui & Daniel Gulland
   March 27, 2019
   Purpose:
   Inputs:
   Outputs;
 */
public interface EarthCellPhone {
    public void sendMessage(String languageType, String fileName);
//            throws   InvalidLanguageException;
    public void readMessage(String fileName);
}
