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
    }

    public void buttonClicked(View view) {
        switch (view.getId()) {
            case R.id.btnSpotStream:
                showToast("Spot Stream is Selected.");
                break;
            case R.id.btnScoreApp:
                showToast("Score App is Selected.");
                break;
            case R.id.btnLibraryApp:
                showToast("Library App is Selected.");
                break;
            case R.id.btnBuildItBigger:
                showToast("Build It Bigger App is Selected.");
                break;
            case R.id.btnBaconReader:
                showToast("Bacon Reader App is Selected.");
                break;
            case R.id.btnCapstone:
                showToast("Capstone App is Selected.");
                break;
        }
    }

    protected void showToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}