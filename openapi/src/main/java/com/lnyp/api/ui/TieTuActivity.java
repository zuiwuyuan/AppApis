package com.lnyp.api.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.apkfuns.logutils.LogUtils;
import com.lnyp.api.R;
import com.lnyp.api.tietu.TieTuApi;
import com.lnyp.api.tietu.TieTuBannerBean;
import com.lnyp.api.tietu.TieTuHomeData;
import com.lnyp.api.tietu.TieTuHomeListBean;
import com.lnyp.api.tietu.TieTuListBean;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 51贴图 api 测试
 */
public class TieTuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tietu);
    }

    public void getTietuShouye(View view) {

        final String url = TieTuApi.TIETU_MAIN;

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(url);

                try {

                    Document doc = Jsoup.connect(url).timeout(10000).get();
//                    System.out.println(doc);

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

                    for (int i = 0; i < tieTuHomeData.tieTuBannerBeens.size(); i++) {
                        System.out.println(tieTuHomeData.tieTuBannerBeens.get(i));
                    }
                    for (int i = 0; i < tieTuHomeData.tpNewBeans.size(); i++) {
                        System.out.println(tieTuHomeData.tpNewBeans.get(i));
                    }
                    for (int i = 0; i < tieTuHomeData.tpRecommendBeans.size(); i++) {
                        System.out.println(tieTuHomeData.tpRecommendBeans.get(i));
                    }
                    for (int i = 0; i < tieTuHomeData.tpMeiwenBeans.size(); i++) {
                        System.out.println(tieTuHomeData.tpMeiwenBeans.get(i));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void getTietuListByType(View view) {

        int page = 0;
        final String url = TieTuApi.TIETU_TYPE_TP + page;

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(url);

                try {
                    Document doc = Jsoup.connect(url).timeout(10000).get();
//                    System.out.println(doc);

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
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    public void getTietuDetail(View view) {
        final String url = TieTuApi.TIETU_DETAIL;

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(url);

                try {
                    Document doc = Jsoup.connect(url).timeout(10000).get();
                    System.out.println(doc);

//                    Elements imgtcEles = doc.getElementsByClass("imgtc");
/*
                    <div class="show-simg">

                    <p align="center"><img alt="2016唯美个性长发女生图片" src="http://img2.51tietu.net/upload/www.51tietu.net/2016-071822/20160718221327mlu5ssg2cqe.jpg" /></p>
                    <p align="center">只是我们缺少发现，因为幸福就在我们身边。</p>
                    <p align="center"><img alt="2016唯美个性长发女生图片(2)" src="http://img2.51tietu.net/upload/www.51tietu.net/2016-071822/20160718221327vssv05cvyis.jpg" /></p>
                    <p align="center">不要等待，因为你不知道等待需要花费多少的时间。</p>
                    <p align="center"><img alt="2016唯美个性长发女生图片(3)" src="http://img2.51tietu.net/upload/www.51tietu.net/2016-071822/20160718221327xz4uh4z5gkd.jpg" /></p>
                    <p align="center">今天是世界对称日，是不是“我爱你”就会“你爱我”伤害最爱自己的人，只不过是仗着他爱你，向来都与勇敢无关。</p>
                    <p align="center"><img alt="2016唯美个性长发女生图片(4)" src="http://img2.51tietu.net/upload/www.51tietu.net/2016-071822/201607182213271iojnk5yps1.jpg" /></p>
                    <p align="center">阳光如细碎的金子慵懒的洒遍大地，秋风阵阵吹起湖畔的柳树，也撩拨起深秋的发丝，湖面折射半脸的夕阳，打在你的脸庞，如此好看。谁的故事，又在哪年过去之后，又被演绎，这场爱情，氤氲在微湿的空气里，如果有夕阳能再暖合点，如果过去我能主动点，十年后的我们，是不是又是另一番模样。</p><p align="center"><img alt="2016唯美个性长发女生图片(5)" src="http://img2.51tietu.net/upload/www.51tietu.net/2016-071822/20160718221328ol1pj20eqgw.jpg" /></p>
                    <p align="center">蘸一缕花香，在月夜下描一副永恒的情长，临摹一段远古的尘烟，至千年韶光的落红断香处，穿越成笔尖美丽的荒芜。于遥远的羌笛唤醒的无限爱意，点燃颊上那一抹桃红柳绿的春幕！把午夜里的心思，摇曳成寂寞的百合，将温情写满星星的眼泪，自此隔守天涯。</p>

                    <p class="content-tag"> <a target="_blank" href="/tag/%E5%A5%B3%E7%94%9F/">女生</a>  <a target="_blank" href="/tag/%E5%94%AF%E7%BE%8E/">唯美</a>  <a target="_blank" href="/tag/%E5%A5%B3%E7%94%9F/">女生</a>  <a target="_blank" href="/tag/%E9%95%BF%E5%8F%91/">长发</a>  <a target="_blank" href="/tag/%E5%A5%B3%E7%94%9F%E5%9B%BE/">女生图</a>  <a target="_blank" href="/tag/%E5%94%AF%E7%BE%8E%E4%B8%AA%E6%80%A7/">唯美个性</a>  <a target="_blank" href="/tag/2016/">2016</a>  &nbsp;</p>

                    </div>
                    */

                    Elements contshowEles = doc.getElementsByClass("contshow");
                    if (contshowEles != null && contshowEles.size() > 0) {
                        Element contentShowEle = contshowEles.get(0);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
