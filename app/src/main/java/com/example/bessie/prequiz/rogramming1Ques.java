package com.example.bessie.prequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class rogramming1Ques extends AppCompatActivity {
    private int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rogramming1_ques);


    }
    public void incorrect(View v) {

        Intent intent = new Intent(getBaseContext(), programmin2.class);
        intent.putExtra("score", score);
        startActivity(intent);
    }

    public void correct (View v){
        score+=20;
        Intent intent = new Intent(getBaseContext(),programmin2.class);
        intent.putExtra("score",score);
        startActivity(intent);
    }

}
