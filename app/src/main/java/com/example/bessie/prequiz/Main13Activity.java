package com.example.bessie.prequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main13Activity extends AppCompatActivity {

    private int scores;
    private TextView finalscores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        scores = getIntent().getIntExtra("scores",100);
        finalscores = (TextView)findViewById(R.id.finalscoreTextView);
        finalscores.setText(String.valueOf(scores));

    }
    public void home (View v) {
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        startActivity(intent);
    }

}
