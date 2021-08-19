package com.example.notes;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;


    @Dao
    public interface NoteDao {

        // allowing the insert of the same word multiple times by passing a
        // conflict resolution strategy
        @Insert(onConflict = OnConflictStrategy.IGNORE)
        void insert(Note note);


        @Query("DELETE FROM note_table")
        void deleteAll(Note note);

        @Query("SELECT * FROM note_table ORDER BY note ASC")
        LiveData<List<Note>> getAlphabetizedWords();
    }

