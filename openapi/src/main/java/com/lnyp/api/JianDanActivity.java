package com.lnyp.api;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.apkfuns.logutils.LogUtils;
import com.lnyp.api.http.HttpUtils;
import com.lnyp.api.http.JianDanUtil;
import com.lnyp.api.jiandan.JianDanMeizhiBean;
import com.lnyp.api.jiandan.JianDanQutuBean;
import com.lnyp.api.jiandan.MeizhiSimple;
import com.lnyp.api.jiandan.QutuSimple;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class JianDanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jian_dan);
    }

    public void onClick1(View view) {

        JianDanUtil jianDanUtil = new JianDanUtil();
        jianDanUtil.getNewThings("2016/08/26");
    }

    public void onClick2(View view) {

        String url = "http://jandan.net/2016/08/26/self-powered-robot.html";

        JianDanUtil jianDanUtil = new JianDanUtil();
        jianDanUtil.getNewThingDetail(url);

    }

    public void onClick3(View view) {

        final String url = "http://jandan.net/duan/";

        HttpUtils.doGetAsyn(url, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {
                Document doc = Jsoup.parse(result);
//                System.out.println(doc.toString());

                Element commentsElement = doc.getElementById("body").getElementById("content").getElementById("comments");

                String current_comment_page = commentsElement.getElementsByClass("current-comment-page").get(0).text();
                current_comment_page = current_comment_page.substring(1, current_comment_page.length() - 1);

                LogUtils.e(current_comment_page);

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
        });
    }

    public void onClick4(View view) {

        final String url = "http://jandan.net/ooxx/";

        HttpUtils.doGetAsyn(url, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {
                Document doc = Jsoup.parse(result);
//                System.out.println(doc.toString());

                MeizhiSimple meizhiSimple = new MeizhiSimple();

                Element commentsElement = doc.getElementById("body").getElementById("content").getElementById("comments");

                String current_comment_page = commentsElement.getElementsByClass("current-comment-page").get(0).text();
                meizhiSimple.current_comment_page = current_comment_page.substring(1, current_comment_page.length() - 1);

                LogUtils.e(meizhiSimple.current_comment_page);

                Elements commentlists = commentsElement.select("ol");
                if (commentlists != null && commentlists.size() > 0) {
                    Element commentlist = commentlists.get(0);

                    Elements rows = commentlist.select("li");
                    LogUtils.e(rows.size());

                    List<JianDanMeizhiBean> jianDanMeizhiBeanList = new ArrayList<JianDanMeizhiBean>();

                    for (int i = 0; i < rows.size(); i++) {

                        JianDanMeizhiBean jianDanMeizhiBean = new JianDanMeizhiBean();

                        Elements strong = rows.get(i).select("strong");
                        String author = null;
                        if (strong != null && strong.size() > 0) {
                            author = strong.get(0).text().replaceAll(" ", "\n");
                            jianDanMeizhiBean.author = author;
                        }

                        Elements small = rows.get(i).select("small");
                        String lastUpdateTime = null;
                        if (small != null && small.size() > 0) {
                            lastUpdateTime = small.get(0).text().replaceAll("@", "");
                            jianDanMeizhiBean.lastUpdateTime = lastUpdateTime;
                        }

                        Elements textElemnents = rows.get(i).getElementsByClass("text");
                        if (textElemnents != null && textElemnents.size() > 0 && textElemnents.get(0) != null) {
                            Element textElement = textElemnents.get(0);

                            Elements pElemnents = textElement.select("p");
                            if (pElemnents != null && pElemnents.size() > 0) {

                                List<String> imgs = new ArrayList<String>();
                                for (int j = 0; j < pElemnents.size(); j++) {
                                    String href = pElemnents.get(j).select("a").get(0).attr("href");
//                                    LogUtils.e("href : " + href);
                                    imgs.add(href);
                                }

                                jianDanMeizhiBean.imgs = imgs;
                            }
                        }

                        LogUtils.e(jianDanMeizhiBean);
                        jianDanMeizhiBeanList.add(jianDanMeizhiBean);

                        meizhiSimple.jianDanMeizhiBeanList = jianDanMeizhiBeanList;
                    }
                }
            }
        });

    }

    public void onClick5(View view) {

        final String url = "http://jandan.net/pic/";

        HttpUtils.doGetAsyn(url, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {
                Document doc = Jsoup.parse(result);
//                System.out.println(doc.toString());

                QutuSimple qutuSimple = new QutuSimple();

                Element commentsElement = doc.getElementById("body").getElementById("content").getElementById("comments");

                String current_comment_page = commentsElement.getElementsByClass("current-comment-page").get(0).text();
                qutuSimple.current_comment_page = current_comment_page.substring(1, current_comment_page.length() - 1);

                LogUtils.e(qutuSimple.current_comment_page);

                Elements commentlists = commentsElement.select("ol");
                if (commentlists != null && commentlists.size() > 0) {
                    Element commentlist = commentlists.get(0);

                    Elements rows = commentlist.select("li");
//                    LogUtils.e(rows.size());

                    List<JianDanQutuBean> jianDanQutuBeenList = new ArrayList<>();
                    for (int i = 0; i < rows.size(); i++) {

                        JianDanQutuBean jianDanQutuBean = new JianDanQutuBean();

                        Elements strong = rows.get(i).select("strong");
                        String author = null;
                        if (strong != null && strong.size() > 0) {
                            author = strong.get(0).text().replaceAll(" ", "\n");
                            jianDanQutuBean.author = author;
                        }

                        Elements small = rows.get(i).select("small");
                        String lastUpdateTime = null;
                        if (small != null && small.size() > 0) {
                            lastUpdateTime = small.get(0).text().replaceAll("@", "");
                            jianDanQutuBean.lastUpdateTime = lastUpdateTime;
                        }

                        Elements textElemnents = rows.get(i).getElementsByClass("text");
                        if (textElemnents != null && textElemnents.size() > 0 && textElemnents.get(0) != null) {
                            Element textElement = textElemnents.get(0);

                            Elements pElemnents = textElement.select("p");
                            if (pElemnents != null && pElemnents.size() > 0) {

                                List<String> imgs = new ArrayList<String>();
                                for (int j = 0; j < pElemnents.size(); j++) {
                                    String href = pElemnents.get(j).select("a").get(0).attr("href");
//                                    LogUtils.e("href : " + href);
                                    imgs.add(href);
                                }

                                jianDanQutuBean.imgs = imgs;
                            }
                        }

                        LogUtils.e(jianDanQutuBean);
                        jianDanQutuBeenList.add(jianDanQutuBean);

                        qutuSimple.jianDanQutuBeenList = jianDanQutuBeenList;
                    }

                }
            }
        });
    }
}
