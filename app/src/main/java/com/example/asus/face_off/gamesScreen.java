package com.example.asus.face_off;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class gamesScreen extends AppCompatActivity {

    private TextView mTextMessage;
    private ArrayList<String> data = new ArrayList<String>();
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_screen);
    }

    public void goToCamera(View view) {
        Intent toCamera = new Intent(this, cameraFront.class);
        startActivity(toCamera);
    }
}
