package src.main.models;

import java.util.ArrayList;

public class TripPlanner {
    private User user;
    private ArrayList<Itinerary> itineraries;
    private Budget budget;
    private Diary diary;

    public TripPlanner(User user) {
        this.user = user;
        this.itineraries = new ArrayList<>();
        this.budget = new Budget();
        this.diary = new Diary();
    }
        
    public Diary getDiary() {
        return diary;
    }
        
    public Budget getBudget() {
        return budget;
    }

    public User getUser() {
        return user;
    }
    
    public void addItinerary(Itinerary itinerary) {
        itineraries.add(itinerary);
    }
}