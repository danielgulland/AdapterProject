/* John Bui & Daniel Gulland
   March 27, 2019
   Purpose: custom exception when an invalid language is presented
   Inputs: invalid language message
   Outputs: n/a
 */
public class InvalidLanguageException extends Exception {

    /**
     * default constructor
     */
    public InvalidLanguageException(){}

    /**
     * Constructor which returns a message
     * @param message
     */
    public InvalidLanguageException(String message) {
        super("Language: " + message + " is not supported");
    }

    /**
     * string representation of an InvalidLanguageException object
     *
     * @return string representation of an InvalidLanguageException object
     */
    public String toString() {
        return "This is an InvalidLanguageException object.\n";
    }

}