package com.example.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSpotStream, btnScoreApp, btnLibraryApp, btnBuildItBigger, btnBaconReader, btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSpotStream = (Button) findViewById(R.id.btnSoptStream);
        btnScoreApp = (Button) findViewById(R.id.btnScoreApp);
        btnLibraryApp = (Button) findViewById(R.id.btnLibraryApp);
        btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        btnBaconReader = (Button) findViewById(R.id.btnBaconReader);
        btnCapstone = (Button) findViewById(R.id.btnCapstone);

        btnSpotStream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Spot Stream is Selected", Toast.LENGTH_LONG).show();
            }
        });
        btnScoreApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Score App is Selected", Toast.LENGTH_LONG).show();
            }
        });
        btnLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Library App is Selected", Toast.LENGTH_LONG).show();
            }
        });
        btnBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Build It Bigger is Selected", Toast.LENGTH_LONG).show();
            }
        });
        btnBaconReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Bacon Reader is Selected", Toast.LENGTH_LONG).show();
            }
        });
        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Capstone is Selected", Toast.LENGTH_LONG).show();
            }
        });


    }
}