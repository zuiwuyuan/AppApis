package com.lnyp.api;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lnyp.api.http.JianDanUtil;
import com.lnyp.api.juzi.JuziApi;
import com.lnyp.api.juzi.JuziUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick1(View view) {

        JianDanUtil jianDanUtil = new JianDanUtil();
        jianDanUtil.getNewThings("2016/08/19");
    }

    public void onClick2(View view) {

        String url = "http://jandan.net/2016/08/16/two-countries-hotel.html";

        JianDanUtil jianDanUtil = new JianDanUtil();
        jianDanUtil.getNewThingDetail(url);
    }


    public void onClick3(View view) {

        int page = 0;
        String url = JuziApi.ALLARTICLE_JINGDIANTAICI + page;

        JuziUtil juziUtil = new JuziUtil();
        juziUtil.getMemorableQuotes(url);
    }

    public void onClick4(View view) {

//        String page = "?page=" + 0;
//        final String url = JuziApi.ALLARTICLE_COLLECT_LIST + page;

        int page = 0;
        String url = JuziApi.ORIGINAL_JU + page;

        JuziUtil juziUtil = new JuziUtil();
        juziUtil.getAllarticleCollectList(url);
    }

    public void onClick5(View view) {

        int page = 0;
        final String url = JuziApi.ALBUMS + page;

        JuziUtil juziUtil = new JuziUtil();
        juziUtil.getJuziCollection(url);
    }
}
