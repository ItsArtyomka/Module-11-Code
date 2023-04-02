import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// In this class, the OG way to get user's input is used and that's where I can learn about exceptions.
public class Main {
    public static void main(String[] args) throws IOException { // <- IOException ignoring, no bueno. How to fix it will be learnt.
        System.out.println("Enter your message: ");
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        String message = inputReader.readLine();
        System.out.println("Your message: " + message);
    }
}
