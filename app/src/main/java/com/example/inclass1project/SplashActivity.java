package com.example.inclass1project;

import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;


import androidx.appcompat.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {
    private Handler newHandler = new Handler(); // create a new Handler to process Thread messages

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash); // set the layout of the screen to the splash screen layout

        newHandler.postDelayed(new Runnable() { // create a new Runnable to be execueted with the new Handler, and run the splash screen after 3 seconds have elapsed
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class); // create a
                startActivity(intent); // start the activity after the time has elapsed

                SplashActivity.this.finish(); // use the onDestroy() callback method to end the sequence using the context(calling activity)
            }
        }, 3000); // call a delay of 3 seconds(in milliseconds context)
    }
}