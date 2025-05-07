package src.main.models;

public class Photo {
    private String filePath;

    public Photo(String filePath) {
        this.filePath = filePath;
    }

    public void view() {
        System.out.println("Viewing photo: " + filePath);
    }

    public String getFilePath() {
        return this.filePath;
    }
}