import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        
        String path = "src\\Exercicio.txt";

        try (BufferedReader bR = new BufferedReader(new FileReader(path))) {
            String line = bR.readLine();

            while (line != null) {
                System.out.println(line);
                line = bR.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
