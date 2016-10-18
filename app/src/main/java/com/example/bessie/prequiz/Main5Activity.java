package com.example.bessie.prequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    private TextView answer;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        score = getIntent().getIntExtra("score",0);

    answer = (TextView)findViewById(R.id.display);
}

    public void incorrect(View v){


        Intent intent = new Intent(getBaseContext(),Main6Activity.class);
        intent.putExtra("score",score);
        startActivity(intent);

    }

    public void hint (View v){

        Toast.makeText(this,"It has long ears.", Toast.LENGTH_LONG).show();

    }

    public void correct (View v){
        score+=20;
        Intent intent = new Intent(getBaseContext(),Main6Activity.class);
        intent.putExtra("score",score);
        startActivity(intent);
    }

    public void home (View v){
        Intent intent = new Intent (getBaseContext(),MainActivity.class);
        startActivity(intent);

    }
}
