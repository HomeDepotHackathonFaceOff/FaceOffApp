package com.example.asus.face_off;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ChooseOpponent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_opponent);
    }

    public void goToGame (View view){
        Intent toGame = new Intent(this, gamesScreen.class);
        startActivity(toGame);
    }
}
