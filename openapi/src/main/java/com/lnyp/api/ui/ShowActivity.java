package com.lnyp.api.ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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

        final ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);


        data = getIntent().getStringExtra("data");

        System.out.println("data" + data);

        TextView textData = (TextView) findViewById(R.id.textData);
        textData.setText(data);

        textData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ShowActivity.this, "已复制", Toast.LENGTH_SHORT).show();
                clipboard.setText(data);
            }
        });
    }
}
