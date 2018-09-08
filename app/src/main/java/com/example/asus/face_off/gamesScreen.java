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


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_screen);
    }

//        public void mess(View v) {
//        ImageView im = (ImageView)findViewById(R.id.imageView3);
//            im.setImageResource(data[clicks]);
//            clicks = (clicks + 1) % 9;
//
//        }

        public void goToCamera (View view){
            Intent toCamera = new Intent(this, cameraFront.class);
            startActivity(toCamera);
        }
}

