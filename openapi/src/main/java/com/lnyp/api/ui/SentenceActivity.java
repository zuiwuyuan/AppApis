package com.lnyp.api.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lnyp.api.R;
import com.lnyp.api.juzi.JuziApi;
import com.lnyp.api.juzi.JuziUtil;

/**
 * 句子迷 api 测试
 */
public class SentenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentence);
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

    public void onClick6(View view) {

        int page = 0;
        final String url = JuziApi.NEWALBUMS + page;

        JuziUtil juziUtil = new JuziUtil();
        juziUtil.getJuziCollection(url);
    }

    public void onClick7(View view) {

        int page = 1;
        final String url = JuziApi.MEITUMEIJU + page;

        JuziUtil juziUtil = new JuziUtil();
        juziUtil.getSentenceImgText(url);

    }
}
