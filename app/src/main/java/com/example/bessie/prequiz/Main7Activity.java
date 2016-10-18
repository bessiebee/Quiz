package com.example.bessie.prequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity {

    private int score;
    private TextView finalscores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        score = getIntent().getIntExtra("score",101);
        finalscores = (TextView)findViewById(R.id.finalscoreTextView);
        finalscores.setText(String.valueOf(score));


    }



}
