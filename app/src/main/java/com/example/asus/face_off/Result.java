package com.example.asus.face_off;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Random r = new Random();
        int Low = 50;
        int High = 100;
        int Result = r.nextInt(High - Low) + Low;
        TextView res = (TextView) findViewById(R.id.resultNum);
        res.setText(Result);
    }

    public void toOpponents (View view){
        ImageView im = (ImageView)findViewById(R.id.imageView3);
        Intent toOpponent = new Intent(this, ChooseOpponent.class);
        startActivity(toOpponent);
    }
}
