package src.main.services;
import src.main.utils.FileUtils;


public class DataService {
    public void saveData(String fileName, String data) {
        FileUtils.writeToFile(fileName, data);
    }
}