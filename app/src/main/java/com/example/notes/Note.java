package com.example.notes;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName = "note_table")
public class Note {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "note")
    private String mNote;

    public void Note(@NonNull String note)
    {this.mNote = note;}

    public String getNote()
    {return this.mNote;}
}

