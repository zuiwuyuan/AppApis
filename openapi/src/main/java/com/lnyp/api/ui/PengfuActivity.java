package com.lnyp.api.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lnyp.api.R;
import com.lnyp.api.http.HttpUtils;
import com.lnyp.api.pengfu.JokeApi;
import com.lnyp.api.pengfu.JokeUtil;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class PengfuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengfu);
    }

    public void onClick1(View view) {

        int page = 1;

        final String url = JokeApi.PENGFU_NEW_JOKES + page + JokeApi.URL_SUFFIX;

        HttpUtils.doGetAsyn(url, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {

                Document doc = Jsoup.parse(result);

                if (doc != null) {
                    JokeUtil jokeUtil = new JokeUtil();
                    jokeUtil.getNewJokelist(PengfuActivity.this, doc);
                }
            }
        });
    }

    public void onClick2(View view) {

        int page = 1;

        final String url = JokeApi.PENGFU_NEW_XIAOHUA + page + JokeApi.URL_SUFFIX;

        HttpUtils.doGetAsyn(url, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {

                Document doc = Jsoup.parse(result);
//                System.out.println(doc);

                if (doc != null) {
                    JokeUtil jokeUtil = new JokeUtil();
                    jokeUtil.getNewJokelist(PengfuActivity.this, doc);
                }
            }
        });

    }

    public void onClick3(View view) {
        int page = 1;

        final String url = JokeApi.PENGFU_NEW_QUTU + page + JokeApi.URL_SUFFIX;

        HttpUtils.doGetAsyn(url, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {

                Document doc = Jsoup.parse(result);
//                System.out.println(doc);

                if (doc != null) {
                    JokeUtil jokeUtil = new JokeUtil();
                    jokeUtil.getNewJokelist(PengfuActivity.this, doc);
                }
            }
        });
    }

    public void onClick4(View view) {

        int page = 1;

        final String url = JokeApi.PENGFU_NEW_SHEN + page + JokeApi.URL_SUFFIX;

        HttpUtils.doGetAsyn(url, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {

                Document doc = Jsoup.parse(result);
                if (doc != null) {
                    JokeUtil jokeUtil = new JokeUtil();
                    jokeUtil.getNewJokelist(PengfuActivity.this, doc);
                }
            }
        });

    }
}
