package com.example.asus.face_off;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class cameraFront extends AppCompatActivity {


    FloatingActionButton cptBtn;
    private final int CAPTURE_PHOTO = 102;
    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_front);

        cptBtn = (FloatingActionButton) findViewById(R.id.captureButton);
        cptBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                String root = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString() + "propic.jpg";
                uri = Uri.parse(root);
                startActivityForResult(i, CAPTURE_PHOTO);
            }
        });
    }

    public void goToResults (View view){
        Intent toResult = new Intent(this, Result.class);
        startActivity(toResult);
    }
}


