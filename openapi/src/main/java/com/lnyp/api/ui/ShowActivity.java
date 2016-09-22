package com.lnyp.api.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.lnyp.api.R;

/**
 * 展示数据
 */
public class ShowActivity extends AppCompatActivity {

    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        data = getIntent().getStringExtra("data");

        TextView textData = (TextView) findViewById(R.id.textData);
        textData.setText(data);

    }
}
