package com.darshmashru.madexperiment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToPersonDetails(View view) {
        Intent ToPersonDetails = new Intent(MainActivity.this, PersonDetails.class);
        startActivity(ToPersonDetails);
    }
}