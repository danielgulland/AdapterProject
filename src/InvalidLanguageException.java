public class InvalidLanguageException extends Throwable {
    private String invalidLanguage;

    public InvalidLanguageException(String invalidLanguage) {
        this.invalidLanguage = invalidLanguage;
    }

    /**
     * message
     * @return
     */
    public String getMessage() {

        return invalidLanguage + " not supported";
    }
}
