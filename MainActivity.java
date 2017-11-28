package com.example.belkoff1.myapplication;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends ActionBarActivity {
    AnimationDrawable saladAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgFrame=(ImageView)findViewById(R.id.imgSalad);
        imgFrame.setBackgroundResource(R.drawable.animation);
        saladAnimation=(AnimationDrawable)imgFrame.getBackground();
        Button button1=(Button) findViewById(R.id.btnStart);
        Button button2=(Button) findViewById(R.id.btnStop);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saladAnimation.start();
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                saladAnimation.stop();
                startActivity(new Intent(MainActivity.this, Tween.class));

            }
        });
     }
}
