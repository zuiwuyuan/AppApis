package com.lnyp.api;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bumptech.glide.Glide;

public class ShowImageActivity extends AppCompatActivity {


    public ShowMaxImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image);

        imgView = (ShowMaxImageView) findViewById(R.id.imgView);

        Glide.with(this).load("http://data.meitu.xunlei.com/data/image/bailu0809/3.jpg").asBitmap().into(imgView);
    }
}
