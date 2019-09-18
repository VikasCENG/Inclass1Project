package com.example.inclass1project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private ImageView myImage;
    protected Button button;
    private CalendarView date;
    String msg = "Hello, this is my first Android APP";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date = findViewById(R.id.calendarView);

        text = findViewById(R.id.textView2);

        myImage = (ImageView) findViewById(R.id.imageView);
        myImage.setImageResource(R.drawable.humber);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            public void toastMessage(String msg) {
                Toast toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG);
                toast.show();
            }

            @Override
            public void onClick(View view) {
                toastMessage(msg);

            }
        });

    }
}
