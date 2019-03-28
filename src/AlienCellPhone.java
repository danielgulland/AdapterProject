/* John Bui & Daniel Gulland
   March 27, 2019
   Purpose: interface that provides generic methods: send, read, translate
   Inputs: n/a
   Outputs: n/a
 */

public interface AlienCellPhone {

    /**
     * N/A
     * @param fileName, name of the file
     */
    public void alienSendText(String fileName);

    /**
     * translates the text into the alien language, then reads and outputs the translated text
     *
     * @param fileName, name of the input file
     */
    public void alienReadText(String fileName);

    /**
     * reads a string from the input file, translates the string, then outputs the new string to the respective output file.
     *
     * @param fileName name of the input file
     * @return String, output file that has the translated text.
     */
    public String translateText(String fileName);
}
