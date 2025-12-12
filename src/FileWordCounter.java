import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileWordCounter {

    public static void countWords(String fileName) {
        Map<String, Integer> hashMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = reader.readLine()) != null) {

                String[] words = line.trim().split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> sorted =
                    hashMap.entrySet()
                            .stream()
                            .sorted((a, b) -> b.getValue() - a.getValue())
                            .toList();

            for (Map.Entry<String, Integer> entry : sorted) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
