import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFileWriter {
    public static void main(String[] args) {
        String className = "HelloWorld";
        String javaCode = """
            public class HelloWorld {
                public static void main(String[] args) {
                    System.out.println("Hello, world!");
                }
            }
            """;

        File file = new File(className + ".java");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(javaCode);
            System.out.println("Java file created: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
    }
}