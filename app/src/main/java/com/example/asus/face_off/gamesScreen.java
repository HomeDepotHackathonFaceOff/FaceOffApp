package com.example.asus.face_off;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class gamesScreen extends AppCompatActivity {

    private TextView mTextMessage;
    private int[] data = new int[9];
    private int clicks = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        data[0] = (R.drawable.a1);
        data[1] = (R.drawable.a2);
        data[2] = (R.drawable.a3);
        data[3] = (R.drawable.a4);
        data[4] = (R.drawable.a5);
        data[5] = (R.drawable.a6);
        data[6] = (R.drawable.a7);
        data[7] = (R.drawable.a8);
        data[8] = (R.drawable.a9);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_screen);
    }

        public void mess(View v) {
        ImageView im = (ImageView)findViewById(R.id.imageView3);
            im.setImageResource(data[clicks]);
            clicks = (clicks + 1) % 9;

        }

        public void goToCamera (View view){
            Intent toCamera = new Intent(this, cameraFront.class);
            startActivity(toCamera);
        }
}

