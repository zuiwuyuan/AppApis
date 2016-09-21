package com.lnyp.api.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.lnyp.api.R;
import com.lnyp.api.other.ShowMaxImageView;

public class ShowImageActivity extends AppCompatActivity {


    public ShowMaxImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image);

        imgView = (ShowMaxImageView) findViewById(R.id.imgView);

        Glide.with(this).load("http://ww2.sinaimg.cn/large/00625EYFgw1f70kqilkhdj30sg0zk77i.jpg").asBitmap().into(imgView);
    }
}
