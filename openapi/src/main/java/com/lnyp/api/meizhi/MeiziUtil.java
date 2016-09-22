package com.lnyp.api.meizhi;

import android.content.Context;
import android.content.Intent;

import com.apkfuns.logutils.LogUtils;
import com.lnyp.api.ui.ShowActivity;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 句子工具类
 */
public class MeiziUtil {

    /**
     * 妹纸列表
     *
     * @param url
     */
    public void getMeiZilist(Context mContext, final String url) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(url);

                try {

                    Document doc = Jsoup.connect(url).timeout(10000).userAgent("Opera/9.80 (Macintosh; Intel Mac OS X 10.6.8; U; fr) Presto/2.9.168 Version/11.52").get();
//                    System.out.println(doc);


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

    /**
     * @param url
     */
    public void getMeiZiDetail(final Context mContext, final String url) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(url);

                try {

                    Document doc = Jsoup.connect(url).timeout(10000).userAgent("Opera/9.80 (Macintosh; Intel Mac OS X 10.6.8; U; fr) Presto/2.9.168 Version/11.52").get();
//                    System.out.println(doc);

                    MeiziDetail meiziDetail = new MeiziDetail();

                    Element showImg = doc.getElementById("showImg");

                    if (showImg != null) {

                        Elements liElements = showImg.select("li");

                        if (liElements != null && liElements.size() > 0) {

                            List<MeiziDetail.ImageBean> imageBeans = new ArrayList<>();

                            for (int i = 0; i < liElements.size(); i++) {

                                if (liElements.get(i) != null) {

                                    String detailUrl = liElements.get(i).select("a").attr("href");
                                    String imgUrl = liElements.get(i).select("img").attr("data-original");
                                    String width = liElements.get(i).select("img").attr("width");
                                    String height = liElements.get(i).select("img").attr("height");
                                    String title = liElements.get(i).select("img").attr("alt");


                                    String imgUrlLarge = imgUrl.replaceAll("thumb\\/84x125", "img");

                                    String[] datas = imgUrlLarge.split("img\\/");

                                    if (datas != null && datas.length == 2) {

                                        String new_data = datas[1].replaceAll("\\/", ",");

                                        imgUrlLarge = datas[0] + "img/" + new_data;
                                    }


                                    MeiziDetail.ImageBean imageBean = new MeiziDetail.ImageBean();
                                    imageBean.setDetailUrl(detailUrl);
                                    imageBean.setImgUrl(imgUrl);
                                    imageBean.setImgUrlLarge(imgUrlLarge);
                                    imageBean.setWidth(width);
                                    imageBean.setHeight(height);
                                    imageBean.setTitle(title);

                                    imageBeans.add(imageBean);

                                }
                            }

                            meiziDetail.setImgBeans(imageBeans);
                        }


                        // 获取标签
                        List<String> tags = new ArrayList<>();

                        Elements tagscfs = doc.getElementsByTag("ml10");
                        if (tagscfs != null && tagscfs.size() > 0) {
                            for (int i = 0; i < tagscfs.size(); i++) {

                                Element tagscf = tagscfs.get(i);

                                String tag = tagscf.text();

                                tags.add(tag);
                            }
                            meiziDetail.setTag(tags);
                        }
                    }

                    LogUtils.e(meiziDetail.getImgBeans());


                    Intent intent = new Intent(mContext, ShowActivity.class);
                    intent.putExtra("data", meiziDetail.toString());
                    mContext.startActivity(intent);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }


    /**
     * 妹纸列表
     * 主要针对于m站的url
     *
     * @param url
     */
    public void getMeiZilistMobile(final Context mContext,final String url) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(url);

                try {

                    Document doc = Jsoup.connect(url).timeout(10000).userAgent("Opera/9.80 (Macintosh; Intel Mac OS X 10.6.8; U; fr) Presto/2.9.168 Version/11.52").get();
//                    System.out.println(doc);


                    Elements liboxs = doc.getElementsByClass("libox");
                    if (liboxs != null) {
                        List<MeiziSimple> meiziSimples = new ArrayList<>();

                        for (int i = 0; i < liboxs.size(); i++) {

                            Element libox = liboxs.get(i);
                            if (libox != null) {

                                MeiziSimple meiziSimple = new MeiziSimple();

                                String detailUrl = libox.select("a").attr("href");
                                String imgUrl = libox.select("img").attr("data-original");
                                String title = libox.select("span").text();

                                meiziSimple.setTitle(title);
                                meiziSimple.setDetailUrl(detailUrl);
                                meiziSimple.setImgUrl(imgUrl);

                                LogUtils.e(meiziSimple);
                                meiziSimples.add(meiziSimple);
                            }
                        }

                        StringBuffer sb = new StringBuffer();
                        for (int i = 0; i < meiziSimples.size(); i++) {
                            String data = meiziSimples.get(i).toString();
                            sb.append(data).append("\n");
                        }

                        Intent intent = new Intent(mContext, ShowActivity.class);
                        intent.putExtra("data", sb.toString());
                        mContext.startActivity(intent);

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    /**
     * 获取妹纸详情
     * 针对于 M站的
     *
     * @param url
     */
    public void getMeiZiDetailtMobile(final String url) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(url);

                try {

                    Document doc = Jsoup.connect(url).timeout(10000).userAgent("Opera/9.80 (Macintosh; Intel Mac OS X 10.6.8; U; fr) Presto/2.9.168 Version/11.52").get();
//                    System.out.println(doc);

                    Elements tagLists = doc.getElementsByClass("tag-list");

                    if (tagLists != null) {

                        List<MeiziDetail> meiziDetails = new ArrayList<>();

                        for (int i = 0; i < tagLists.size(); i++) {

                            MeiziDetail meiziDetail = new MeiziDetail();

                            Element tagList = tagLists.get(i);
                            if (tagList != null) {
                                Elements tagElements = tagList.select("a");

                                List<String> tags = new ArrayList<>();

                                for (int j = 0; j < tagElements.size(); j++) {
                                    String tag = tagElements.get(j).text();

                                    tags.add(tag);
                                }
                                meiziDetail.setTag(tags);

                                LogUtils.e(tags);
                            }
                        }
                    }

                    Elements showImgs = doc.getElementsByClass("show-img");

                    if (showImgs != null) {

                        for (int i = 0; i < showImgs.size(); i++) {

                            Element showImg = showImgs.get(i);

                            String imgUrl = showImg.select("img").attr("src");

                            LogUtils.e(imgUrl);
                        }
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

}
