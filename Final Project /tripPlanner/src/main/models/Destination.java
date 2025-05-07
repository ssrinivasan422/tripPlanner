package src.main.models;

import java.util.ArrayList;

public class Destination {
    private String name;
    private String location;
    private ArrayList<Activity> activities;

    public Destination(String name, String location) {
        this.name = name;
        this.location = location;
        this.activities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public String getLocation() {
        return location;
    }
}