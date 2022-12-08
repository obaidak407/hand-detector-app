package com.example.imagepro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.opencv.android.OpenCVLoader;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    static {
        if(OpenCVLoader.initDebug()){
            Log.d("MainActivity: ","Opencv is loaded");
        }
        else {
            Log.d("MainActivity: ","Opencv failed to load");
        }
    }

    private Button camera_button;
    private Button signtotext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
                                                                                

        // select device and run
        // we successfully loaded model
        // before next tutorial
        // as we are going to predict in Camera Activity
        // Next tutorial will be about predicting using Interpreter


    }


    public void sign_text(View view) {
        startActivity(new Intent(MainActivity.this,SigntoText.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
        finish();
    }

    public void text_sign(View view) {
        startActivity(new Intent(MainActivity.this,TexttoSign.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
        finish();
    }

    public void info(View view) {
        startActivity(new Intent(MainActivity.this,info.class));
        finish();
    }
}