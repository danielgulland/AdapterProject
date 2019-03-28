/* John Bui & Daniel Gulland
   March 27, 2019
   Purpose:
   Inputs:
   Outputs;
 */
public class InvalidLanguageException extends Exception {
    public InvalidLanguageException(String message)
    {
        super("Language: " + message + " is not supported");
    }
}