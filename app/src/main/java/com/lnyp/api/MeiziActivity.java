package com.lnyp.api;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

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

    public void onClick1(View view) {

        int page = 1;

        final String url = MeizhiApi.MOBILE_MEIZI_HOT + page + MeizhiApi.URL_SUFFIX_MOBILE;

        MeiziUtil meiziUtil = new MeiziUtil();

        meiziUtil.getMeiZilistMobile(url);

    }

    public void onClick2(View view) {
    }
}
