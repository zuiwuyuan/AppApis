package com.lnyp.api;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.apkfuns.logutils.LogUtils;
import com.google.gson.Gson;
import com.lnyp.api.http.JianDanUtil;
import com.lnyp.api.juzi.JuziApi;
import com.lnyp.api.juzi.JuziUtil;
import com.lnyp.api.juzi.SentenceImageText;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    public void onClick6(View view) {

        int page = 0;
        final String url = JuziApi.NEWALBUMS + page;

        JuziUtil juziUtil = new JuziUtil();
        juziUtil.getJuziCollection(url);
    }

    public void onClick7(View view) {

        int page = 1;
        final String url = JuziApi.MEITUMEIJU_JINGDIANDUIBAI + page;

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(url);

                try {

                    Document doc = Jsoup.connect(url).timeout(10000).get();

                    System.out.println(doc);

                    List<SentenceImageText> sentenceImageTexts = new ArrayList<>();

                    Gson gson = new Gson();
                    Elements views_field_sns_values = doc.getElementsByClass("alljmojusharecon");
                    for (int i = 0; i < views_field_sns_values.size(); i++) {
                        Element views_field_sns_value = views_field_sns_values.get(i);
                        if (views_field_sns_value != null) {
                            Element bdshare = views_field_sns_value.getElementById("bdshare");
                            if (bdshare != null) {

                                String data = bdshare.attr("data");

                                if (data != null) {
                                    SentenceImageText sentenceImageText = gson.fromJson(data, SentenceImageText.class);

                                    if (sentenceImageText != null) {
                                        sentenceImageTexts.add(sentenceImageText);
                                    }
                                    LogUtils.e(sentenceImageText);
                                }
                            }
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}