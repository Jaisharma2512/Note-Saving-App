package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private  NoteViewModel viewModel;
    RecyclerView rcv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv=(RecyclerView)findViewById(R.id.rcv);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        final NotesRVAdapter adapter= new  NotesRVAdapter();
        rcv.setAdapter(adapter);
        rcv.setLayoutManager(new LinearLayoutManager(this));


        NoteViewModel model = new ViewModelProvider(this).get(NoteViewModel.class);
         final Observer<String> bigObserver = new Observer<String>;
      model.getAllNotes().observe(this,bigObserver);



        }


    }
