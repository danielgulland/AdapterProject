public class InvalidLanguageException extends Throwable{
    public InvalidLanguageException(String message)
    {
        System.out.println(message + " not supported");
    }
}
