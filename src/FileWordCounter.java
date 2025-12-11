import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class FileWordCounter {

    public static void countWords(String fileName) {
        try {
            String text = new String(Files.readAllBytes(Paths.get(fileName)));

            String[] words = text.split("\\s+");

            Map<String, Integer> frequency = new HashMap<>();
            for (String word : words) {
                if (!word.isEmpty()) {
                    frequency.put(word, frequency.getOrDefault(word, 0) + 1);
                }
            }

            List<Map.Entry<String, Integer>> sorted =
                    frequency.entrySet()
                            .stream()
                            .sorted((a, b) -> b.getValue() - a.getValue())
                            .collect(Collectors.toList());

            for (Map.Entry<String, Integer> entry : sorted) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
