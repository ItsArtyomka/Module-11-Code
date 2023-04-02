import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// In this class, the OG way to get user's input is used and that's where I can learn about exceptions.
public class Main {
    public static void main(String[] args) throws IOException { // <- IOException ignoring, no bueno.
        System.out.println("Enter your message: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String message = reader.readLine();
        System.out.println("Your message: " + message);
    }
}
