package com.example.bessie.prequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main11Activity extends AppCompatActivity {
    private TextView answer;
    private int scores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        scores = getIntent().getIntExtra("scores",0);
        answer= (TextView)findViewById(R.id.display);
    }

    public void incorrect(View v){

        Intent intent = new Intent(getBaseContext(),Main12Activity.class);
        intent.putExtra("scores",scores);
        startActivity(intent);
    }

    public void hint (View v){

        Toast.makeText(this,"It has a Video Port.", Toast.LENGTH_LONG).show();

    }

    public void correct (View v){
        scores+=20;
        Intent intent = new Intent(getBaseContext(),Main12Activity.class);
        intent.putExtra("scores",scores);
        startActivity(intent);

    }

    public void home (View v) {
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        startActivity(intent);
    }
}
