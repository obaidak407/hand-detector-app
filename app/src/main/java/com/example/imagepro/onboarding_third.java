package com.example.imagepro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class onboarding_third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_third);
        getSupportActionBar().hide();
    }
    public void nextAction(View view) {
        Intent i = new Intent(onboarding_third.this,MainActivity.class);
        startActivity(i);
        finish();
    }
}