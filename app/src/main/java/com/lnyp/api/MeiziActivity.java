package com.lnyp.api;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.apkfuns.logutils.LogUtils;
import com.lnyp.api.meizhi.MeizhiApi;
import com.lnyp.api.meizhi.MeiziSimple;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 51妹子 api 测试
 */
public class MeiziActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meizi);
    }

    public void onClick1(View view) {

        int page = 1;

        final String url = MeizhiApi.MEIZI_NEW + page + MeizhiApi.URL_SUFFIX;

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(url);

                try {

                    Document doc = Jsoup.connect(url).timeout(10000).get();
                    System.out.println(doc);


                    Elements mainLists = doc.getElementsByClass("m-list-main");
                    if (mainLists != null) {

                        List<MeiziSimple> meiziSimples = new ArrayList<>();

                        for (int i = 0; i < mainLists.size(); i++) {

                            MeiziSimple meiziSimple = new MeiziSimple();

                            Element mainList = mainLists.get(i);

                            if (mainList != null) {

                                if (mainList.getElementsByClass("u-img") != null) {

                                    for (int j = 0; j < mainList.getElementsByClass("u-img").size(); j++) {

                                        Element imgElement = mainList.getElementsByClass("u-img").get(j);
                                        if (imgElement.select("a") != null && imgElement.select("a").size() > 0) {

                                            Element dataElement = imgElement.select("a").get(0);
                                            if (dataElement != null) {
                                                String detailUrl = dataElement.attr("href");
                                                String title = dataElement.attr("title");

                                                meiziSimple.setTitle(title);
                                                meiziSimple.setDetailUrl(detailUrl);

                                                if (dataElement.select("img") != null && dataElement.select("img").size() > 0) {
                                                    Element imgEle = dataElement.select("img").get(0);
                                                    if (imgEle != null) {
                                                        String imgUrl = imgEle.attr("data-original");
                                                        meiziSimple.setImgUrl(imgUrl);
                                                    }
                                                }

                                                LogUtils.e(meiziSimple);

                                                meiziSimples.add(meiziSimple);
                                            }
                                        }

                                    }
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

    public void onClick2(View view) {
    }
}
