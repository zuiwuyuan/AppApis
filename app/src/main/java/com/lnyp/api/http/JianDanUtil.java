package com.lnyp.api.http;

import android.text.TextUtils;

import com.lnyp.api.jiandan.JianDanDetail;
import com.lnyp.api.jiandan.JianDanSimple;
import com.lnyp.api.jiandan.JiandanApi;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 煎蛋工具类
 */
public class JianDanUtil {

    public void getNewThings(final String date) {

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


    public void getNewThingDetail(final String url) {

        new Thread(new Runnable() {
            @Override
            public void run() {


                System.out.println(url);

                try {

                    Document doc = Jsoup.connect(url).get();

                    Elements posthitElements = doc.getElementsByClass("entry");
                    Element entryElement = posthitElements.get(0);

                    Elements ps = entryElement.getElementsByTag("p");

                    List<JianDanDetail> jianDanDetails = new ArrayList<JianDanDetail>();

                    for (int i = 0; i < ps.size(); i++) {

                        Elements imgs = ps.get(i).getElementsByTag("img");

                        String imgSmall = null;
                        String imgMedium = null;
                        String text = null;

                        if (imgs != null && imgs.size() > 0) {

                            imgSmall = imgs.get(0).attr("data-original");
                            imgMedium = imgs.get(0).attr("data-original").replaceAll("small", "medium");

                        } else {
                            text = ps.get(i).text();
                        }


                        JianDanDetail jianDanDetail = new JianDanDetail();

                        if (!TextUtils.isEmpty(imgSmall)) {
                            jianDanDetail.setType(1);
                            jianDanDetail.setImgSmall(imgSmall);
                            jianDanDetail.setImgMedium(imgMedium);
                        } else {
                            jianDanDetail.setType(2);
                            jianDanDetail.setDesc(text);
                        }

                        System.out.println(jianDanDetail);

                        jianDanDetails.add(jianDanDetail);
                    }


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
