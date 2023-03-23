import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        
        String path = "src\\Exercicio.txt";
        FileReader fR = null;
        BufferedReader bR = null;

        try {
            fR = new FileReader(path);
            bR = new BufferedReader(fR);

            String line = bR.readLine();

            while (line != null) {
                System.out.println(line);
                line = bR.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (bR != null) 
                    bR.close();
                
                if (fR != null) 
                    fR.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
