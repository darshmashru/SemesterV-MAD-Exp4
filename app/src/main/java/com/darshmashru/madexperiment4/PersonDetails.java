package com.darshmashru.madexperiment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PersonDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_details);

        ListView listview = findViewById(R.id.listview);
        String[] ListViewDetails = {
                "Main Menu",
                "+91 1234567890",
                "sample@example.com",
                "Google Search",
                "Android Tutorials",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListViewDetails);
        listview.setAdapter(adapter);
    }
}