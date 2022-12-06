package com.example.imagepro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class onboarding_first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_onboarding_first);
    }


    public void nextAction(View view) {
        Intent i = new Intent(onboarding_first.this,onboarding_second.class);
        startActivity(i);
        finish();
    }

    public void mainActivity(View view) {
        Intent i = new Intent(onboarding_first.this,MainActivity.class);
        startActivity(i);
        finish();
    }
}