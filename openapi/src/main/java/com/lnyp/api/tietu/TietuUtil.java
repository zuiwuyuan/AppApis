package com.lnyp.api.tietu;

import android.content.Context;
import android.content.Intent;

import com.apkfuns.logutils.LogUtils;
import com.lnyp.api.ui.ShowActivity;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * 句子工具类
 */
public class TietuUtil {

    /**
     * 最新笑话列表
     *
     * @param doc
     */
    public void getTietuShouye(Context mContext, Document doc) {
        TieTuHomeData tieTuHomeData = new TieTuHomeData();

        List<TieTuBannerBean> tieTuBannerBeens = new ArrayList<>();

        List<TieTuHomeListBean> tpGuanchangBeans = new ArrayList<>();
        List<TieTuHomeListBean> tpNewBeans = new ArrayList<>();
        List<TieTuHomeListBean> tpRecommendBeans = new ArrayList<>();
        List<TieTuHomeListBean> tpMeiwenBeans = new ArrayList();

        Elements bannerEles = doc.getElementsByClass("banner");
        if (bannerEles != null && bannerEles.size() > 0) {
            Element bannerEle = bannerEles.get(0);
            if (bannerEle != null) {
                Elements bdEles = bannerEle.getElementsByClass("bd");
                if (bdEles != null && bdEles.size() > 0) {
                    Element bdEle = bdEles.get(0);
                    if (bdEle != null) {
                        Elements bannerLists = bdEle.select("li");


                        for (int i = 0; i < bannerLists.size(); i++) {

                            TieTuBannerBean tieTuBannerBean = new TieTuBannerBean();

                            Element banners = bannerLists.get(i);

                            Elements b_hrefs = banners.select("a");
                            if (b_hrefs != null && b_hrefs.size() > 0) {
                                String href = b_hrefs.get(0).attr("href");
                                tieTuBannerBean.detailUrl = href;
                            }

                            Elements img_srcs = banners.select("img");
                            if (img_srcs != null && img_srcs.size() > 0) {
                                String src = img_srcs.get(0).attr("src");
                                tieTuBannerBean.imgUrl = src;
                            }

                            tieTuBannerBeens.add(tieTuBannerBean);
                        }

                        tieTuHomeData.tieTuBannerBeens = tieTuBannerBeens;
                    }
                }
            }
        }

        Elements mindexcEles = doc.getElementsByClass("mindexc1");

        for (int i = 0; i < mindexcEles.size(); i++) {

            Element indexEle = mindexcEles.get(i);

            if (indexEle != null) {


                Elements bannerLists = indexEle.select("li");

                for (int j = 0; j < bannerLists.size(); j++) {

                    TieTuHomeListBean tieTuHomeListBean = new TieTuHomeListBean();
                    Element banners = bannerLists.get(j);

                    Elements b_hrefs = banners.select("a");
                    if (b_hrefs != null && b_hrefs.size() > 0) {
                        String href = "http://m.51tietu.net" + b_hrefs.get(0).attr("href");
                        tieTuHomeListBean.detailUrl = href;
                    }

                    Elements img_srcs = banners.select("img");
                    if (img_srcs != null && img_srcs.size() > 0) {
                        String src = img_srcs.get(0).attr("src");
                        String title = img_srcs.get(0).attr("title");

                        tieTuHomeListBean.title = title;
                        tieTuHomeListBean.imgUrl = src;
                    }

                    if (i == 0) {
                        System.out.println(tieTuHomeListBean);
                        tpGuanchangBeans.add(tieTuHomeListBean);
                    } else if (i == 1) {
                        tpNewBeans.add(tieTuHomeListBean);
                    } else if (i == 2) {
                        tpRecommendBeans.add(tieTuHomeListBean);
                    } else if (i == 3) {
                        tpMeiwenBeans.add(tieTuHomeListBean);
                    }
                }
            }
        }

        tieTuHomeData.tpGuanchangBeans = tpGuanchangBeans;
        tieTuHomeData.tpNewBeans = tpNewBeans;
        tieTuHomeData.tpRecommendBeans = tpRecommendBeans;
        tieTuHomeData.tpMeiwenBeans = tpMeiwenBeans;


        // 展示数据
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < tieTuHomeData.tieTuBannerBeens.size(); i++) {
            String data = tieTuHomeData.tieTuBannerBeens.get(i).toString();
            sb.append(data).append("\n");
        }
        for (int i = 0; i < tieTuHomeData.tpNewBeans.size(); i++) {
            String data = tieTuHomeData.tpNewBeans.get(i).toString();
            sb.append(data).append("\n");
        }
        for (int i = 0; i < tieTuHomeData.tpRecommendBeans.size(); i++) {
            String data = tieTuHomeData.tpRecommendBeans.get(i).toString();
            sb.append(data).append("\n");
        }
        for (int i = 0; i < tieTuHomeData.tpMeiwenBeans.size(); i++) {
            String data = tieTuHomeData.tpMeiwenBeans.get(i).toString();
            sb.append(data).append("\n");
        }

        Intent intent = new Intent(mContext, ShowActivity.class);
        intent.putExtra("data", sb.toString());
        mContext.startActivity(intent);
    }

    public void getTietuListByType(Context mContext, Document doc) {

        Elements imgtcEles = doc.getElementsByClass("imgtc");

        Element imgtcEle = imgtcEles.get(0);

        if (imgtcEle != null) {

            Elements bannerLists = imgtcEle.select("li");

            List<TieTuListBean> tieTuListBeens = new ArrayList<>();

            for (int i = 0; i < bannerLists.size(); i++) {

                TieTuListBean tieTuListBean = new TieTuListBean();

                Element banners = bannerLists.get(i);

                Elements b_hrefs = banners.select("a");
                if (b_hrefs != null && b_hrefs.size() > 0) {
                    String href = "http://m.51tietu.net" + b_hrefs.get(0).attr("href");
                    String title = b_hrefs.get(0).attr("title");

                    tieTuListBean.title = title;
                    tieTuListBean.detailUrl = href;
                }

                Elements b_imgs = banners.select("img");
                if (b_imgs != null && b_imgs.size() > 0) {
                    String src = b_imgs.get(0).attr("src");

                    tieTuListBean.imgUrl = src;
                }

                LogUtils.e(tieTuListBean);
                tieTuListBeens.add(tieTuListBean);
            }


            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < tieTuListBeens.size(); i++) {
                String data = tieTuListBeens.get(i).toString();
                sb.append(data).append("\n");
            }

            Intent intent = new Intent(mContext, ShowActivity.class);
            intent.putExtra("data", sb.toString());
            mContext.startActivity(intent);
        }
    }


    public void getTietuDetail(Context mContext, Document doc) {
        Elements contshowEles = doc.getElementsByClass("contshow");
        if (contshowEles != null && contshowEles.size() > 0) {
            Element contentShowEle = contshowEles.first();

            if (contentShowEle != null) {
                Elements pEles = contentShowEle.select("p");

                List<TieTuDetailBean> tieTuDetailBeens = new ArrayList<>();

                for (int i = 0; i < pEles.size(); i++) {

                    TieTuDetailBean tieTuDetailBean = new TieTuDetailBean();

                    if (i == pEles.size() - 1) {// 最后一个是标签tags

                        Element pEle = pEles.get(i);
                        Elements aEles = pEle.select("a");
                        if (aEles != null) {

                            for (int j = 0; j < aEles.size(); j++) {
                                String tag = aEles.get(j).text();
                                LogUtils.e(tag);
                            }
                        }
                    } else {
                        Element pEle = pEles.get(i);
                        if (pEle != null) {
                            Elements imgeles = pEle.select("img");

                            if (imgeles != null && imgeles.size() > 0) {
                                Element imgEle = imgeles.first();
                                String src = imgEle.attr("src");
//                                            String alt = imgEle.attr("alt");

                                tieTuDetailBean.imgUrl = src;

                            } else {

                                String text = pEle.text();

                                tieTuDetailBean.desc = text;
                            }
                        }
                        LogUtils.e(tieTuDetailBean);
                        tieTuDetailBeens.add(tieTuDetailBean);
                    }
                }

                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < tieTuDetailBeens.size(); i++) {
                    String data = tieTuDetailBeens.get(i).toString();
                    sb.append(data).append("\n");
                }

                Intent intent = new Intent(mContext, ShowActivity.class);
                intent.putExtra("data", sb.toString());
                mContext.startActivity(intent);
            }
        }
    }

}
