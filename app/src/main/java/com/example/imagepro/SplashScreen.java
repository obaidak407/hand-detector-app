package com.example.imagepro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {
    Handler h = new Handler();
    ProgressBar pb;
    int counter =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        progress();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this,onboarding_first.class);
                startActivity(i);
                finish();
            }
        }, 5000);
    }
    public void progress(){
        pb= (ProgressBar) findViewById(R.id.progressBar);

        final Timer  timer = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
              counter++;
              pb.setProgress(counter);
              if (counter==100)
              {
                  timer.cancel();
              }
            }
        };
        timer.schedule(tt,0,50);
    }
}