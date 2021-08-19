package com.example.notes;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.room.Database;

import java.util.List;

public class NoteRepository {
    private NoteDao mNoteDao;
    private LiveData<List<Note>> Allnotes;

    NoteRepository(Application application) {
        NoteDatabase db = NoteDatabase.getDatabase(application);
        mNoteDao = db.noteDao();
        Allnotes = mNoteDao.getAlphabetizedWords();
    }


    LiveData<List<Note>> getAllNotes() {
        return Allnotes;
    }


    void insert(Note note) {
        NoteDatabase.databaseWriteExecutor.execute(() -> {
            mNoteDao.insert(note);
        });
    }
        void deleteAll(Note note){
            NoteDatabase.databaseWriteExecutor.execute(() -> {
                mNoteDao.deleteAll(note);
            });


        }

    }


