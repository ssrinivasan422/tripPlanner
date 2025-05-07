package src.main.models;

public class Activity {
    private String description;
    private String time;

    public String getDescription() {
        return description;
    }

    public Activity(String description, String time) {
        this.description = description;
        this.time = time;
    }

    public String getTime() {
        return time;
    }
}
