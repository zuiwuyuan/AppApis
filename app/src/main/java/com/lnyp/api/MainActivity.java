package com.lnyp.api;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lnyp.api.http.JianDanUtil;
import com.lnyp.api.jiandan.JianDanSimple;
import com.lnyp.api.jiandan.JiandanApi;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
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

    private void getNewThings(final String date) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                String url = JiandanApi.NEW_THINGS + date;
                System.out.println(url);

                try {

                    Document doc = Jsoup.connect(url).get();

                    List<JianDanSimple> jianDanSimples = new ArrayList<>();

                    Elements posthitElements = doc.getElementsByClass("posthit");
                    for (int i = 0; i < posthitElements.size(); i++) {

                        String detailUrl = posthitElements.get(i).select("a").get(0).attr("href");
                        String imgUrl = "http:" + posthitElements.get(i).select("img").get(0).attr("data-original").replaceAll("square", "custom");
                        String title = posthitElements.get(i).select("a").get(1).text();
                        String keyWords = posthitElements.get(i).getElementsByClass("indexs").get(0).text();

                        JianDanSimple jianDanSimple = new JianDanSimple();
                        jianDanSimple.setTitle(title);
                        jianDanSimple.setKeyWords(keyWords);
                        jianDanSimple.setImgUrl(imgUrl);
                        jianDanSimple.setDetailUrl(detailUrl);

                        System.out.println(jianDanSimple.toString());

                        jianDanSimples.add(jianDanSimple);
                    }


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    public void onClick(View view) {

        JianDanUtil jianDanUtil = new JianDanUtil();
        jianDanUtil.getNewThings("2016/08/19");
    }

    public void onDetail(View view) {


        String url = "http://jandan.net/2016/08/16/two-countries-hotel.html";

        JianDanUtil jianDanUtil = new JianDanUtil();
        jianDanUtil.getNewThingDetail(url);
    }
}
