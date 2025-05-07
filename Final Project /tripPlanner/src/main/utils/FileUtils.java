package src.main.utils;

import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
    public static void writeToFile(String fileName, String data) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}