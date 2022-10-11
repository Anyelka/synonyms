import java.util.List;

public class App {
    private static final String PATH = "resources/example.in";

    public static void main(String[] args) {
        List<String> content = FileReader.readFile(PATH);
        System.out.println("File content: " + content);
    }
}
