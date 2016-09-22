package com.lnyp.api.jiandan;

import android.text.TextUtils;

import com.apkfuns.logutils.LogUtils;
import com.lnyp.api.http.HttpUtils;

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

                    List<FreshNewsBean> freshNewsBeen = new ArrayList<>();

                    Elements posthitElements = doc.getElementsByClass("posthit");
                    for (int i = 0; i < posthitElements.size(); i++) {

                        String detailUrl = posthitElements.get(i).select("a").get(0).attr("href");
                        String imgUrl = "http:" + posthitElements.get(i).select("img").get(0).attr("data-original").replaceAll("square", "custom");
                        String title = posthitElements.get(i).select("a").get(1).text();
                        String keyWords = posthitElements.get(i).getElementsByClass("indexs").get(0).text();

                        FreshNewsBean freshNewsBean = new FreshNewsBean();
                        freshNewsBean.setTitle(title);
                        freshNewsBean.setKeyWords(keyWords);
                        freshNewsBean.setImgUrl(imgUrl);
                        freshNewsBean.setDetailUrl(detailUrl);

                        System.out.println(freshNewsBean.toString());

                        freshNewsBeen.add(freshNewsBean);
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

                    List<FreshNewsDetail> freshNewsDetails = new ArrayList<FreshNewsDetail>();

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


                        FreshNewsDetail freshNewsDetail = new FreshNewsDetail();

                        if (!TextUtils.isEmpty(imgSmall)) {
                            freshNewsDetail.setType(1);
                            freshNewsDetail.setImgSmall(imgSmall);
                            freshNewsDetail.setImgMedium(imgMedium);
                        } else {
                            freshNewsDetail.setType(2);
                            freshNewsDetail.setDesc(text);
                        }

                        System.out.println(freshNewsDetail);

                        freshNewsDetails.add(freshNewsDetail);
                    }


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }


    public void getDuans(final String url) {

        HttpUtils.doGetAsyn(url, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {
                Document doc = Jsoup.parse(result);
//                System.out.println(doc.toString());

                DuanziDatas duanziDatas = new DuanziDatas();

                Element commentsElement = doc.getElementById("body").getElementById("content").getElementById("comments");

                String current_comment_page = commentsElement.getElementsByClass("current-comment-page").get(0).text();
                current_comment_page = current_comment_page.substring(1, current_comment_page.length() - 1);

                duanziDatas.current_comment_page = current_comment_page;
                LogUtils.e(current_comment_page);

                Elements commentlists = commentsElement.select("ol");

                List<DuanziBean> duanziBeanList = new ArrayList<>();

                if (commentlists != null && commentlists.size() > 0) {
                    Element commentlist = commentlists.get(0);

                    Elements rows = commentlist.select("li");

                    for (int i = 0; i < rows.size(); i++) {

                        DuanziBean duanziBean = new DuanziBean();


                        Elements strong = rows.get(i).select("strong");
                        String author = strong.get(0).text().replaceAll(" ", "\n");
                        duanziBean.author = author;

                        Elements small = rows.get(i).select("small");
                        String lastUpdateTime = small.get(0).text().replaceAll("@", "");
                        duanziBean.lastUpdateTime = lastUpdateTime;


                        Elements row = rows.get(i).select("p");
                        StringBuffer stringBuffer = new StringBuffer();
                        if (row != null) {
                            for (int j = 0; j < row.size(); j++) {
                                stringBuffer = stringBuffer.append(row.get(j).text().replaceAll(" ", "\n"));
                            }
                        }

                        duanziBean.content = stringBuffer.toString();


                        duanziBeanList.add(duanziBean);

                        LogUtils.e(duanziBean);

                    }
                }

                duanziDatas.duanziBeanList = duanziBeanList;

            }
        });

    }

    public void getMeizis(final String url) {
        HttpUtils.doGetAsyn(url, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {
                Document doc = Jsoup.parse(result);
//                System.out.println(doc.toString());

                MeizhiDatas meizhiDatas = new MeizhiDatas();

                Element commentsElement = doc.getElementById("body").getElementById("content").getElementById("comments");

                String current_comment_page = commentsElement.getElementsByClass("current-comment-page").get(0).text();
                meizhiDatas.current_comment_page = current_comment_page.substring(1, current_comment_page.length() - 1);

                LogUtils.e(meizhiDatas.current_comment_page);

                Elements commentlists = commentsElement.select("ol");
                if (commentlists != null && commentlists.size() > 0) {
                    Element commentlist = commentlists.get(0);

                    Elements rows = commentlist.select("li");
                    LogUtils.e(rows.size());

                    List<MeizhiBean> meizhiBeanList = new ArrayList<MeizhiBean>();

                    for (int i = 0; i < rows.size(); i++) {

                        MeizhiBean meizhiBean = new MeizhiBean();

                        Elements strong = rows.get(i).select("strong");
                        String author = null;
                        if (strong != null && strong.size() > 0) {
                            author = strong.get(0).text().replaceAll(" ", "\n");
                            meizhiBean.author = author;
                        }

                        Elements small = rows.get(i).select("small");

                        String lastUpdateTime = null;
                        if (small != null && small.size() > 0) {
                            lastUpdateTime = small.get(0).text().replaceAll("@", "");
                            meizhiBean.lastUpdateTime = lastUpdateTime;
                        }

                        Elements textElemnents = rows.get(i).getElementsByClass("text");
                        if (textElemnents != null && textElemnents.size() > 0 && textElemnents.get(0) != null) {
                            Element textElement = textElemnents.get(0);

                            Elements pElemnents = textElement.select("p");
                            if (pElemnents != null && pElemnents.size() > 0) {

                                List<String> imgs = new ArrayList<String>();
                                for (int j = 0; j < pElemnents.size(); j++) {
                                    String href = pElemnents.get(j).select("a").get(0).attr("href");
                                    LogUtils.e("href : " + href);
                                    imgs.add(href);
                                }

                                meizhiBean.imgs = imgs;
                            }
                        }

                        LogUtils.e(meizhiBean);
                        meizhiBeanList.add(meizhiBean);

                        meizhiDatas.meizhiBeanList = meizhiBeanList;
                    }
                }
            }
        });
    }

    public void getQutus(final String url) {
        HttpUtils.doGetAsyn(url, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {
                Document doc = Jsoup.parse(result);
//                System.out.println(doc.toString());

                QutuDatas qutuDatas = new QutuDatas();

                Element commentsElement = doc.getElementById("body").getElementById("content").getElementById("comments");

                String current_comment_page = commentsElement.getElementsByClass("current-comment-page").get(0).text();
                qutuDatas.current_comment_page = current_comment_page.substring(1, current_comment_page.length() - 1);

                LogUtils.e(qutuDatas.current_comment_page);

                Elements commentlists = commentsElement.select("ol");
                if (commentlists != null && commentlists.size() > 0) {
                    Element commentlist = commentlists.get(0);

                    Elements rows = commentlist.select("li");
//                    LogUtils.e(rows.size());

                    List<QutuBean> jianDanQutuBeenList = new ArrayList<>();
                    for (int i = 0; i < rows.size(); i++) {

                        QutuBean qutuBean = new QutuBean();

                        Elements strong = rows.get(i).select("strong");
                        String author = null;
                        if (strong != null && strong.size() > 0) {
                            author = strong.get(0).text().replaceAll(" ", "\n");
                            qutuBean.author = author;
                        }

                        Elements small = rows.get(i).select("small");
                        String lastUpdateTime = null;
                        if (small != null && small.size() > 0) {
                            lastUpdateTime = small.get(0).text().replaceAll("@", "");
                            qutuBean.lastUpdateTime = lastUpdateTime;
                        }

                        Elements textElemnents = rows.get(i).getElementsByClass("text");
                        if (textElemnents != null && textElemnents.size() > 0 && textElemnents.get(0) != null) {
                            Element textElement = textElemnents.get(0);

                            Elements pElemnents = textElement.select("p");
                            if (pElemnents != null && pElemnents.size() > 0) {

                                List<String> imgs = new ArrayList<String>();
                                for (int j = 0; j < pElemnents.size(); j++) {
                                    String href = pElemnents.get(j).select("a").get(0).attr("href");

                                    imgs.add(href);
                                }
                                LogUtils.e("imgs : " + imgs.toString());
                                qutuBean.imgs = imgs;
                            }
                        }

                        LogUtils.e(qutuBean);
                        jianDanQutuBeenList.add(qutuBean);

                        qutuDatas.jianDanQutuBeenList = jianDanQutuBeenList;
                    }
                }
            }
        });
    }

}
