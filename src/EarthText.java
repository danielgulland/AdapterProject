import java.util.ArrayList;

public class EarthText implements EarthCellPhone {

    private ArrayList<String> validLanguages;

    public EarthText() {
        validLanguages = new ArrayList<>();
    }
    @Override
    public void sendMessage(String languageType, String fileName) {

    }

    @Override
    public void readMessage(String fileName) {

    }
}
