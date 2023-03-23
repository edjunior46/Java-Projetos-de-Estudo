import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};

        String path = "src\\Exercicio.txt";

        try (BufferedWriter bW = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bW.write(line);
                bW.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
