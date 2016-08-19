package com.lnyp.api.meizhi;

import com.apkfuns.logutils.LogUtils;

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
    public void getMeiZilist(final String url) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(url);

                try {

                    Document doc = Jsoup.connect(url).timeout(10000).get();
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
     * 妹纸列表
     *
     * @param url
     */
    public void getMeiZilistMobile(final String url) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(url);

                try {

                    Document doc = Jsoup.connect(url).timeout(10000).get();
//                    System.out.println(doc);


                    Elements liboxs = doc.getElementsByClass("libox");
                    if (liboxs != null) {
                        List<MeiziSimple> meiziSimples = new ArrayList<>();

                        for (int i = 0; i < liboxs.size(); i++) {

//                            <a href="http://m.51xw.net/meizi/3390.html">
//                            <img data-original="http://c15.51xw.net/thumb/236x354/3/01536967261359.jpg" src="http://img.51xw.net/static/aitaotu/img/touming.png" alt="[NAKED-ART]NO.005美女套图,[NAKED-ART]NO.005 OL美腳"><span>[NAKED-ART]NO.005美女套图,[NAKED-ART]NO.005 OL美腳</span></a>
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

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
