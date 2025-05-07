package src.main.models;

import java.util.ArrayList;

public class DiaryEntry {
    private String date;
    private String text;
    private ArrayList<Photo> photos;

    public DiaryEntry(String date, String text) {
        this.date = date;
        this.text = text;
        this.photos = new ArrayList<>();
    }

    public String getDate() {
        return date;
    }

    public void addPhoto(Photo photo) {
        photos.add(photo);
    }

    public String getText() {
        return text;
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }

    
}
