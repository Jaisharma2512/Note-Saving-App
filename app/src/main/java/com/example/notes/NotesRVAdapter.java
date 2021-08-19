package com.example.notes;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.zip.Inflater;

public class NotesRVAdapter extends RecyclerView.Adapter<NotesRVAdapter.NoteViewHolder>{
    ArrayList<Note> allNotes = new ArrayList<Note>();



    @NonNull

    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item_note,parent,false);
        return new NoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  NoteViewHolder NoteViewHolder, int position) {
Note mcurrent= allNotes.get(position);
NoteViewHolder.tv.setText(mcurrent.getNote());
    }

    @Override
    public int getItemCount() {

        return allNotes.size();
    }
public void updateList(ArrayList<Note> newlist){
        allNotes.clear();
        allNotes.addAll(newlist);
        notifyDataSetChanged();

}
    class NoteViewHolder extends RecyclerView.ViewHolder {
TextView tv;
        public NoteViewHolder(@NonNull View itemView) {
            super(itemView);
            TextView tv = (TextView) itemView.findViewById(R.id.text);

        }

    }
}