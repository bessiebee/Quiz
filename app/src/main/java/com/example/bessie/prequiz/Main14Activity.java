package com.example.bessie.prequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main14Activity extends AppCompatActivity {
    private int score;
    private TextView finalscores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        score = getIntent().getIntExtra("score",101);
        finalscores = (TextView)findViewById(R.id.finalscoreTextView);
        finalscores.setText(String.valueOf(score));
    }
    public void home (View v) {
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        startActivity(intent);
    }
}
