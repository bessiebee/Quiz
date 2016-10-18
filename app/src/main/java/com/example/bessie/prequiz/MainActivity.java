package com.example.bessie.prequiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer song;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        song = MediaPlayer.create(this,R.raw.welcome);
        song.start();
    }

    public void components (View v){

        Intent intent = new Intent(getBaseContext(),Main8Activity.class);
        startActivity(intent);
    }
    public void nextpage (View v){

        Intent intent = new Intent(getBaseContext(),Main2Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        song.release();
    }
}

