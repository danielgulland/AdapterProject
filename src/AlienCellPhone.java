/* John Bui & Daniel Gulland
   March 27, 2019
   Purpose:
   Inputs:
   Outputs;
 */
import java.io.FileNotFoundException;

public interface AlienCellPhone {
    public void alienSendText(String fileName);
    public void alienReadText(String fileName);
    //translateText returns the name of the output file
    //that has the translated message
    public String translateText(String fileName) throws FileNotFoundException;
}
