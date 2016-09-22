package com.lnyp.api.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lnyp.api.R;
import com.lnyp.api.jiandan.JianDanUtil;
import com.lnyp.api.jiandan.JiandanApi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JianDanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jian_dan);
    }

    public void onClick1(View view) {

        JianDanUtil jianDanUtil = new JianDanUtil();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/mm/dd");
        Date now = new Date();
        String date = simpleDateFormat.format(now);

        jianDanUtil.getNewThings(date);
    }

    public void onClick2(View view) {

        String url = "http://jandan.net/2016/08/26/self-powered-robot.html";

        JianDanUtil jianDanUtil = new JianDanUtil();
        jianDanUtil.getNewThingDetail(url);

    }

    public void onClick3(View view) {

        final String url = JiandanApi.DUANZI;

        JianDanUtil jianDanUtil = new JianDanUtil();
        jianDanUtil.getDuans(url);
    }

    public void onClick4(View view) {

        final String url = JiandanApi.OOXX;

        JianDanUtil jianDanUtil = new JianDanUtil();
        jianDanUtil.getMeizis(url);
    }

    public void onClick5(View view) {

        final String url = JiandanApi.PIC;

        JianDanUtil jianDanUtil = new JianDanUtil();
        jianDanUtil.getQutus(url);
    }
}
