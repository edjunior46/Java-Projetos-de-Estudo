import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Map<String, Integer> mapCandidates = new LinkedHashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("in\\exercise.csv"))) {

            String line = bufferedReader.readLine();

            while (line != null) {
                String[] inLine = line.split(",");
                String candidateName = inLine[0];
                Integer candidateVotes = Integer.parseInt(inLine[1]);
                
                if (mapCandidates.containsKey(candidateName)) {
                    int votesPlus = mapCandidates.get(candidateName);
                    mapCandidates.put(candidateName, candidateVotes + votesPlus);
                } else {
                    mapCandidates.put(candidateName, candidateVotes);
                }

                line = bufferedReader.readLine();

            }

            System.out.println("Total votes: ");
            for (String key : mapCandidates.keySet()) {
                System.out.println(key + ": " + mapCandidates.get(key));
            }

            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
