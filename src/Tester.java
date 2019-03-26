import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("Earth.txt");
        Scanner input = new Scanner(f);
        System.out.println(input.next());
    }
}
