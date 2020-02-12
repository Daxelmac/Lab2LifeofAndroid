package com.example.lab2lifeofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "SampleActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//checking for state of the application
    @Override
    public void onStart() {
        super.onStart();
        Log.v(TAG, "++ ON START ++");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.v(TAG, "+ ON RESUME +");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.v(TAG, "- ON PAUSE -");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.v(TAG, "-- ON STOP --");
    }

}
