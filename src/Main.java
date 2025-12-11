public class Main {
    public static void main(String[] args) {

        PhoneFileReader.printValidPhones("src/file1.txt");
        FileToJsonConverter.convertFile("src/file2.txt", "src/user.json");
        FileWordCounter.countWords("src/words.txt");
    }
}