package com.example.imagepro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class onboarding_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_second);
        getSupportActionBar().hide();
    }

    public void nextAction(View view) {
        Intent i = new Intent(onboarding_second.this,onboarding_third.class);
        startActivity(i);
        finish();
    }
    public void mainActivity(View view) {
        Intent i = new Intent(onboarding_second.this,MainActivity.class);
        startActivity(i);
        finish();
    }
}
