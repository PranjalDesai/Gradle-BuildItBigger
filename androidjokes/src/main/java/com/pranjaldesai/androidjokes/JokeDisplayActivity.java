package com.pranjaldesai.androidjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        // Displays jokes from Intent
        textView= (TextView) findViewById(R.id.jokeView);
        String joke= getIntent().getStringExtra("joke");
        if(joke != null && !joke.isEmpty()){
            textView.setText(joke);
        }


    }
}
