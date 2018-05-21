package com.udacitygradle.buildbigger.myandroidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        String jokeString = getIntent().getStringExtra("joke");
        TextView textView = findViewById(R.id.textView);
        textView.setText(jokeString);

    }
}
