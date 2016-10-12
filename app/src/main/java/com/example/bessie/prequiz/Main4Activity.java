package com.example.bessie.prequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        answer= (TextView)findViewById(R.id.display);
    }

    public void incorrect(View v){

        answer.setText("Oops! Wrong Answer");
    }

    public void hint (View v){

        Toast.makeText(this,"It is Oval shaped.", Toast.LENGTH_LONG).show();

    }

    public void correct (View v){

        Intent intent = new Intent(getBaseContext(),Main3Activity.class);
        startActivity(intent);
    }
    public void home (View v){
        Intent intent = new Intent (getBaseContext(),MainActivity.class);
        startActivity(intent);

    }
}
