package com.example.notes;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class NoteViewModel extends AndroidViewModel {
    private NoteRepository mRepository;

    private final LiveData<List<Note>> AllNotes;

    public NoteViewModel (Application application) {
        super(application);
        mRepository = new NoteRepository(application);
        AllNotes = mRepository.getAllNotes();
    }

    LiveData<List<Note>> getAllNotes()
    {
        return mRepository.getAllNotes();
    }

    public void insert(Note note) {
        mRepository.insert(note);
    }
public void delete(Note note){
        mRepository.deleteAll(note);
}
}
