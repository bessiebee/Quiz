package com.example.bessie.prequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class programming5 extends AppCompatActivity {
    private int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming5);
        score = getIntent().getIntExtra("score",0);
    }
    public void incorrect(View v) {

        Intent intent = new Intent(getBaseContext(), Main14Activity.class);
        intent.putExtra("score", score);
        startActivity(intent);
    }

    public void correct (View v){
        score+=20;
        Intent intent = new Intent(getBaseContext(),Main14Activity.class);
        intent.putExtra("score",score);
        startActivity(intent);
    }

}
