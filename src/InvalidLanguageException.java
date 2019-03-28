public class InvalidLanguageException extends Exception{
    public InvalidLanguageException(String message)
    {
        super("Language: " + message + " is not supported");
    }
}
