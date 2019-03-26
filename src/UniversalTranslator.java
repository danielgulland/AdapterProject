public class UniversalTranslator implements EarthCellPhone {
    AlienCellPhone alienTextMessage;

    public UniversalTranslator(AlienCellPhone alienTextMessage) {
        this.alienTextMessage = alienTextMessage;
    }

    @Override
    public void sendMessage(String languageType, String fileName) {

    }

    @Override
    public void readMessage(String fileName) {

    }
}
