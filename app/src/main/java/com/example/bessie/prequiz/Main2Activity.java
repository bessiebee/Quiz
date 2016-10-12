package com.example.bessie.prequiz;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity /*implements View.OnClickListener */{

    private TextView answer;
    /* private ImageView image1,image2,image3,image4,image5,image6,image7,image8,image9;
     private String[] array = {"cucumber","banana","red paper","pine apple","cheese","strawberry","carrot","hhhhhhh","bbbbbb"};*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        answer= (TextView)findViewById(R.id.display);
        /*image1 = (ImageView)findViewById(R.id.cucumber1);
        image2 = (ImageView)findViewById(R.id.banana1);
        image3 = (ImageView)findViewById(R.id.redpepper1);
        image4 = (ImageView)findViewById(R.id.pineapple1);
        image5 = (ImageView)findViewById(R.id.chesse1);
        image6 = (ImageView)findViewById(R.id.strawberry1);
        image7 = (ImageView)findViewById(R.id.carrot1);
        image8 = (ImageView)findViewById(R.id.cucumber1);
        image9 = (ImageView)findViewById(R.id.cucumber1);

        image1.setOnClickListener(this);
        image6.setOnClickListener(this);
        image9.setOnClickListener(this);
        image5.setOnClickListener(this);
        image4.setOnClickListener(this);
        image8.setOnClickListener(this);
        image7.setOnClickListener(this);
        image3.setOnClickListener(this);
        image2.setOnClickListener(this);*/

    }

    public void correct (View v){

        Intent intent = new Intent(getBaseContext(),Main3Activity.class);
        startActivity(intent);
    }

   /*public void correct(View v){

        answer.setText("Correct, Click next.");

    }*/

    public void incorrect(View v){

        answer.setText("Oops! Wrong Answer");
    }

    public void hint (View v){

        Toast.makeText(this,"It is Yellow.", Toast.LENGTH_LONG).show();

    }


    public void home (View v) {
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        startActivity(intent);
    }




     /*public void onClick(View v){
        for(int i =0; i<array.length;i++)
        {
            answer.setText(array[i]);
            if(image1.isPressed() && i == 0)
            {

            }
        }
    }*/


}
