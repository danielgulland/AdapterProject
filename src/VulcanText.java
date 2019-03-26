public class VulcanText implements AlienCellPhone {
    @Override
    public void alienSendText(String fileName) {
		//Do not need to implement
    }

    @Override
    public void alienReadText(String fileName) {

    }

    @Override
    public String translateText(String fileName) {
        return null;
    }

	//Unique to Vulcan. Currently it reverses, which should be for Klingon. Needs to shuffle the letters in word
    private String shuffleString(String word) {
		StringBuilder sb = new StringBuilder(word);
		return (sb.reverse().toString());
    }
}
