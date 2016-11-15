package com.guylaf.holdall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class PicassoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);
        String url = "http://manosque-tennis.asptt.com/files/2016/01/tennis.jpg";
        ImageView imageView = (ImageView) findViewById(R.id.image);
        Picasso.with(this).load(url).into(imageView);

    }
}

