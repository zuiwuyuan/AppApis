package com.lnyp.api;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View view) {
        startActivity(new Intent(this, JianDanActivity.class));
    }

    public void onClick2(View view) {
        startActivity(new Intent(this, SentenceActivity.class));
    }

    public void onClick3(View view) {
        startActivity(new Intent(this, MeiziActivity.class));
    }

    public void onClick4(View view) {
        startActivity(new Intent(this, PengfuActivity.class));
    }
}