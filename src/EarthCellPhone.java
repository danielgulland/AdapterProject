public interface EarthCellPhone {
    public void sendMessage(String languageType, String fileName) throws InvalidLanguageException;
//            throws   InvalidLanguageException;
    public void readMessage(String fileName);
}
