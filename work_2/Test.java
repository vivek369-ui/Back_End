import java.io.File;
import java.io.IOException;
public class Test {
    public static void main(String[] args) {
        File file = new File("R:\\ruturaj.txt");
        try {
            if(file.createNewFile())
            {
                System.out.println("File successfully Created.");
            }
            else
            {
                System.out.println("Failed to create file.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}