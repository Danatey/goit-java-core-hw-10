public class Main {
    public static void main(String[] args) {

        PhoneFileReader.printValidPhones("src/main/resources/file1.txt");
        FileToJsonConverter.convertFile("src/main/resources/file2.txt", "src/main/resources/user.json");
        FileWordCounter.countWords("src/main/resources/words.txt");
    }
}