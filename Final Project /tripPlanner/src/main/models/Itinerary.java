package src.main.models;

import java.util.ArrayList;

public class Itinerary {
    private String title;
    private String startDate;
    private String endDate;
    private ArrayList<Destination> destinations;

    public Itinerary(String title, String startDate, String endDate) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.destinations = new ArrayList<>();
    }

    public String getStartDate() {
        return startDate;
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public String getEndDate() {
        return endDate;
    }

    public void viewSchedule() {
        System.out.println("Itinerary: " + title);
        for (Destination destination : destinations) {
            System.out.println(destination.getName());
        }
    }

    public String getTitle() {
        return title;
    }
}