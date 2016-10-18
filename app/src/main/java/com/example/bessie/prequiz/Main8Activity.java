package com.example.bessie.prequiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main8Activity extends AppCompatActivity {
    private ImageView gif;
    private TextView answer;
    private int scores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        gif= (ImageView)findViewById(R.id.gif);
        answer= (TextView)findViewById(R.id.display);

    }

    public void incorrect(View v){

        Intent intent = new Intent(getBaseContext(),Main9Activity.class);
        intent.putExtra("scores",scores);
        startActivity(intent);
    }

    public void hint (View v){

        Toast.makeText(this,"It is long shaped.", Toast.LENGTH_LONG).show();

    }

    public void correct (View v){
        scores+=20;
        Intent intent = new Intent(getBaseContext(),Main9Activity.class);
        intent.putExtra("scores",scores);
        startActivity(intent);

    }

    public void home (View v) {
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        startActivity(intent);
    }



}
