package com.yash.examples.launchactivitywidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "Started onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}