package src.main.models;
import java.util.ArrayList;

public class Diary {
    private ArrayList<DiaryEntry> entries;

    public Diary() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(DiaryEntry entry) {
        entries.add(entry);
    }

    public ArrayList<DiaryEntry> getEntries() {
        return entries;
    }
}