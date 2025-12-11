import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PhoneFileReader {
    public static final String REGEX_PHONE_WITH_BRACKETS = "\\(\\d{3}\\) \\d{3}-\\d{4}";
    public static final String REGEX_PHONE = "\\d{3}-\\d{3}-\\d{4}";

    public static void printValidPhones(String filePath) {

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                if (line.matches(REGEX_PHONE_WITH_BRACKETS) || line.matches(REGEX_PHONE)) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
