package com.example.seuapp;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AppCompatActivity;

public class TimelineActivity extends AppCompatActivity {

    private ListView timelineList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);

        timelineList = findViewById(R.id.timeline_list);
        String[] posts = {"Postagem 1", "Postagem 2", "Postagem 3"};
        
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, posts);
        timelineList.setAdapter(adapter);
    }
}

