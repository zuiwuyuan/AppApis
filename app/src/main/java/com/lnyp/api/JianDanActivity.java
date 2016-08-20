package com.lnyp.api;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.apkfuns.logutils.LogUtils;
import com.lnyp.api.http.JianDanUtil;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JianDanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jian_dan);
    }

    public void onClick1(View view) {

        JianDanUtil jianDanUtil = new JianDanUtil();
        jianDanUtil.getNewThings("2016/08/20");
    }

    public void onClick2(View view) {

        String url = "http://jandan.net/2016/08/20/not-use-google.html";

        JianDanUtil jianDanUtil = new JianDanUtil();
        jianDanUtil.getNewThingDetail(url);
    }

    public void onClick3(View view) {

        final String url = "http://jandan.net/duan";

       /* HttpUtils.doGetAsyn(url, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {
                Document doc = Jsoup.parse(result);
                System.out.println(doc.toString());
                Element commentsElement = doc.getElementById("body").getElementById("content").getElementById("comments");
                Elements commentlists = commentsElement.select("ol");
                if (commentlists != null && commentlists.size() > 0) {
                    Element commentlist = commentlists.get(0);

                    Elements rows = commentlist.select("li");
                    LogUtils.e(rows.size());
                    for (int i = 0; i < rows.size(); i++) {

                        Elements row = rows.select("p");
                        String text = row.get(i).text().replaceAll(" ", "\n");

                        Elements strong = rows.select("strong");
                        String author = strong.get(i).text().replaceAll(" ", "\n");

                        Elements small = rows.select("small");
                        String lastUpdateTime = small.get(i).text().replaceAll("@", "");

                        LogUtils.e(author + "   " + lastUpdateTime + "   " + text);
                    }

                }

            }
        });*/


        new Thread(new Runnable() {
            @Override
            public void run() {

                try {

                    Document doc = Jsoup.connect(url).timeout(10000).userAgent("Opera/9.80 (Macintosh; Intel Mac OS X 10.6.8; U; fr) Presto/2.9.168 Version/11.52").get();

                    Element commentsElement = doc.getElementById("body").getElementById("content").getElementById("comments");
                    Elements commentlists = commentsElement.select("ol");
                    if (commentlists != null && commentlists.size() > 0) {
                        Element commentlist = commentlists.get(0);

                        Elements rows = commentlist.select("li");
                        LogUtils.e(rows.size());
                        for (int i = 0; i < rows.size(); i++) {

                            Elements row = rows.select("p");
                            String text = row.get(i).text().replaceAll(" ", "\n");

                            Elements strong = rows.select("strong");
                            String author = strong.get(i).text().replaceAll(" ", "\n");

                            Elements small = rows.select("small");
                            String lastUpdateTime = small.get(i).text().replaceAll("@", "");

                            LogUtils.e(author + "   " + lastUpdateTime + "   " + text);
                        }

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
