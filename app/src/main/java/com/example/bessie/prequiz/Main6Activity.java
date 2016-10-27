package com.example.bessie.prequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {

    private TextView answer;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        score = getIntent().getIntExtra("score",0);


        answer= (TextView)findViewById(R.id.display);
    }

    public void incorrect(View v){

        Intent intent = new Intent(getBaseContext(),Main7Activity.class);
        intent.putExtra("score",score);
        startActivity(intent);
    }

    public void hint (View v){

        Toast.makeText(this,"It is huge.", Toast.LENGTH_LONG).show();

    }

    public void correct (View v){

        Intent intent = new Intent(getBaseContext(),Main7Activity.class);
        score+=20;
        intent.putExtra("score",score);
        startActivity(intent);

    }
    public void home (View v){
        Intent intent = new Intent (getBaseContext(),MainActivity.class);
        startActivity(intent);

    }
}
