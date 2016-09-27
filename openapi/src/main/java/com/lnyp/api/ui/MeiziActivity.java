package com.lnyp.api.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lnyp.api.R;
import com.lnyp.api.meizhi.MeizhiApi;
import com.lnyp.api.meizhi.MeiziUtil;

/**
 * 51妹子 api 测试
 */
public class MeiziActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meizi);
    }

    /**
     * 获取网页的妹子列表
     * <p/>
     * 最新
     * 最热
     * 推荐
     * 日榜
     * 周榜
     * 月榜
     * <p/>
     * 妹子列表的数据解析方式是一样的，所以通过一种方式就ok
     *
     * @param view
     */
   public void getMeiZiListByPc(View view) {

        int page = 1;

        final String url = MeizhiApi.MEIZI_WEEK + page + MeizhiApi.URL_SUFFIX_PC;

        MeiziUtil meiziUtil = new MeiziUtil();

        meiziUtil.getMeiZilist(this,url);
    }

    public void getMeiZiDetailByPc(View view) {

        final String url = "http://www.51xw.net/meizi/3863.html";

        MeiziUtil meiziUtil = new MeiziUtil();
        meiziUtil.getMeiZiDetail(this,url);

    }

    /*public void getMeiZiListByMobile(View view) {

        int page = 1;

        final String url = MeizhiApi.MOBILE_MEIZI_NEW + page + MeizhiApi.URL_SUFFIX;

//        final String url = MeizhiApi.MOBILE_MEIZI_HOT + page + MeizhiApi.URL_SUFFIX;
//        final String url = MeizhiApi.MOBILE_MEIZI_BEST + page + MeizhiApi.URL_SUFFIX;
//        final String url = MeizhiApi.MOBILE_MEIZI_DAY + page + MeizhiApi.URL_SUFFIX;
//        final String url = MeizhiApi.MOBILE_MEIZI_WEEK + page + MeizhiApi.URL_SUFFIX;
//        final String url = MeizhiApi.MOBILE_MEIZI_MONTH + page + MeizhiApi.URL_SUFFIX;

        MeiziUtil meiziUtil = new MeiziUtil();

        meiziUtil.getMeiZilistMobile(this, url);

    }

    public void getMeiZiDetailByMobile(View view) {

        final String url = "http://m.51xw.net/meizi/3846.html";

        MeiziUtil meiziUtil = new MeiziUtil();
        meiziUtil.getMeiZiDetailtMobile(url);
    }*/
}
