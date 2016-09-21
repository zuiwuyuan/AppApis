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

    public void getMeiZiListByPc(View view) {

        int page = 1;

        final String url = MeizhiApi.MEIZI_WEEK + page + MeizhiApi.URL_SUFFIX_PC;

        MeiziUtil meiziUtil = new MeiziUtil();

        meiziUtil.getMeiZilist(url);
    }

    public void getMeiZiDetailByPc(View view) {

        final String url = "http://www.51xw.net/meizi/3863.html";

        MeiziUtil meiziUtil = new MeiziUtil();
        meiziUtil.getMeiZiDetail(url);

    }


    public void getMeiZiListByMobile(View view) {

        int page = 1;

        final String url = MeizhiApi.MOBILE_MEIZI_NEW + page + MeizhiApi.URL_SUFFIX;
//        final String url = MeizhiApi.MOBILE_MEIZI_HOT + page + MeizhiApi.URL_SUFFIX;
//        final String url = MeizhiApi.MOBILE_MEIZI_BEST + page + MeizhiApi.URL_SUFFIX;
//        final String url = MeizhiApi.MOBILE_MEIZI_DAY + page + MeizhiApi.URL_SUFFIX;
//        final String url = MeizhiApi.MOBILE_MEIZI_WEEK + page + MeizhiApi.URL_SUFFIX;
//        final String url = MeizhiApi.MOBILE_MEIZI_MONTH + page + MeizhiApi.URL_SUFFIX;

        MeiziUtil meiziUtil = new MeiziUtil();

        meiziUtil.getMeiZilistMobile(url);

    }

    public void getMeiZiDetailByMobile(View view) {

        final String url = "http://m.51xw.net/meizi/3846.html";

        MeiziUtil meiziUtil = new MeiziUtil();
        meiziUtil.getMeiZiDetailtMobile(url);
    }
}
