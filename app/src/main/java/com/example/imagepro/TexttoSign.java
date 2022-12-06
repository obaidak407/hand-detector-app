package com.example.imagepro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
//import android.widget.Toast;

import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class TexttoSign extends AppCompatActivity {

    private ImageButton btnShowSigns;
    private EditText edtText;
    private ImageView imgSigns;
    private TextView tvText;
    Timer timer = new Timer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_textto_sign);
        btnShowSigns = findViewById(R.id.btnShowSigns);
        edtText = findViewById(R.id.edtText);
        imgSigns = findViewById(R.id.imgSigns);
        tvText = findViewById(R.id.tvText);
        getSupportActionBar().hide();

        btnShowSigns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = edtText.getText().toString();
                //Converting String to char array
                char[] arr = text.toCharArray();
                //Toast.makeText(TexttoSign.this, "Array lenght: "+arr.length+" String lenght: "+text.length(),Toast.LENGTH_LONG).show();
                tvText.setText(Arrays.toString(arr));
                imgSigns.setImageResource(getImageId(arr[0]));


                new Handler().postDelayed(new Runnable() {
                    int i=1;
                    @Override
                    public void run() {
                        if (i<arr.length){
                            ImageViewAnimatedChange(getApplicationContext(), imgSigns, getImageId(arr[i]));
                           // Toast.makeText(TexttoSign.this, "Toast no: "+i, Toast.LENGTH_SHORT).show();
                            i++;
                        }
                        new Handler().postDelayed(this,1000);
                    }
                },2000);

            }
        });
    }

    public static void ImageViewAnimatedChange(Context c, final ImageView v, final int imageId) {
        final Animation anim_out = AnimationUtils.loadAnimation(c, android.R.anim.slide_out_right);
        final Animation anim_in  = AnimationUtils.loadAnimation(c, android.R.anim.slide_in_left);
        anim_out.setAnimationListener(new Animation.AnimationListener()
        {
            @Override public void onAnimationStart(Animation animation) {}
            @Override public void onAnimationRepeat(Animation animation) {}
            @Override public void onAnimationEnd(Animation animation)
            {
                v.setImageResource(imageId);
                anim_in.setAnimationListener(new Animation.AnimationListener() {
                    @Override public void onAnimationStart(Animation animation) {}
                    @Override public void onAnimationRepeat(Animation animation) {}
                    @Override public void onAnimationEnd(Animation animation) {}
                });
                v.startAnimation(anim_in);
            }
        });
        v.startAnimation(anim_out);
    }

    private int getImageId(char ch){
        int imageId=0;
        switch (ch){
            case 'a':{
                imageId = R.mipmap.a;
//                sign.setImageResource(R.mipmap.a);
                break;
            }
            case 'b':{
                imageId = R.mipmap.b;
//                sign.setImageResource(R.mipmap.b);
                break;
            }
            case 'c':{
                imageId = R.mipmap.c;
//                sign.setImageResource(R.mipmap.c);
                break;
            }
            case 'd':{
                imageId = R.mipmap.d;
//                        sign.setImageResource(R.mipmap.d);
                break;
            }
            case 'e':{
                imageId = R.mipmap.e;
//                  sign.setImageResource(R.mipmap.e);
                break;
            }
            case 'f':{
                imageId = R.mipmap.f;
//                        sign.setImageResource(R.mipmap.f);
                break;
            }
            case 'g':{
                imageId = R.mipmap.g;
//                        sign.setImageResource(R.mipmap.g);
                break;
            }
            case 'h':{
                imageId = R.mipmap.h;
//                        sign.setImageResource(R.mipmap.h);
                break;
            }
            case 'i':{
                imageId = R.mipmap.i;
//                        sign.setImageResource(R.mipmap.i);
            }
            case 'j':{
                imageId = R.mipmap.j;
//                        sign.setImageResource(R.mipmap.j);
                break;
            }
            case 'k':{
                imageId = R.mipmap.k;
//                        sign.setImageResource(R.mipmap.k);
                break;
            }
            case 'l':{
                imageId = R.mipmap.l;
//                        sign.setImageResource(R.mipmap.l);
                break;
            }
            case 'm':{
                imageId = R.mipmap.m;
//                        sign.setImageResource(R.mipmap.m);
                break;
            }
            case 'n':{
                imageId = R.mipmap.n;
//                        sign.setImageResource(R.mipmap.n);
                break;
            }
            case 'o':{
                imageId = R.mipmap.o;
//                        sign.setImageResource(R.mipmap.o);
                break;
            }
            case 'p':{
                imageId = R.mipmap.p;
//                        sign.setImageResource(R.mipmap.p);
                break;
            }
            case 'q':{
                imageId = R.mipmap.q;
//                        sign.setImageResource(R.mipmap.q);
                break;
            }
            case 'r':{
                imageId = R.mipmap.r;
//                        sign.setImageResource(R.mipmap.r);
                break;
            }
            case 's':{
                imageId = R.mipmap.s;
//                        sign.setImageResource(R.mipmap.s);
                break;
            }
            case 't':{
                imageId = R.mipmap.t;
//                        sign.setImageResource(R.mipmap.t);
                break;
            }
            case 'u':{
                imageId = R.mipmap.u;
//                        sign.setImageResource(R.mipmap.u);
                break;
            }
            case 'v':{
                imageId = R.mipmap.v;
//                        sign.setImageResource(R.mipmap.v);
                break;
            }
            case 'w':{
                imageId = R.mipmap.w;
//                        sign.setImageResource(R.mipmap.w);
                break;
            }
            case 'x':{
                imageId = R.mipmap.x;
//                        sign.setImageResource(R.mipmap.x);
                break;
            }
            case 'y':{
                imageId = R.mipmap.y;
//                        sign.setImageResource(R.mipmap.y);
                break;
            }
            case 'z':{
                imageId = R.mipmap.z;
//                        sign.setImageResource(R.mipmap.z);
                break;
            }
            default: {
                Log.e("texttosign", "Invalid entry");
            }
        }
        return imageId;
    }

    public void mainActivity(View view) {
        Intent i = new Intent(TexttoSign.this,MainActivity.class);
        startActivity(i);
        finish();
    }
}