package com.example.bessie.prequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main10Activity extends AppCompatActivity {
    private TextView answer;
    private int scores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        scores = getIntent().getIntExtra("scores",0);
        answer= (TextView)findViewById(R.id.display);
    }

    public void incorrect(View v){

        Intent intent = new Intent(getBaseContext(),Main11Activity.class);
        intent.putExtra("scores",scores);
        startActivity(intent);
    }

    public void hint (View v){

        Toast.makeText(this,"It has a network port.", Toast.LENGTH_LONG).show();

    }

    public void correct (View v){
        scores+=20;
        Intent intent = new Intent(getBaseContext(),Main11Activity.class);
        intent.putExtra("scores",scores);
        startActivity(intent);

    }

    public void home (View v) {
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        startActivity(intent);
    }
}
