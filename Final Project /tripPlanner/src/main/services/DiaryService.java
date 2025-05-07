package src.main.services;

import src.main.models.Diary;
import src.main.models.DiaryEntry;

public class DiaryService {
    public void addDiaryEntry(Diary diary, String date, String text) {
        diary.addEntry(new DiaryEntry(date, text));
    }
}
