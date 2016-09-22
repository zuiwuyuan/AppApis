package com.lnyp.api.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lnyp.api.R;
import com.lnyp.api.tietu.TieTuApi;
import com.lnyp.api.tietu.TietuUtil;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

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

                    if (doc != null) {
                        TietuUtil tietuUtil = new TietuUtil();
                        tietuUtil.getTietuShouye(TieTuActivity.this, doc);
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
                    if (doc != null) {
                        TietuUtil tietuUtil = new TietuUtil();
                        tietuUtil.getTietuListByType(TieTuActivity.this, doc);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    public void getTietuDetail(View view) {
        final String url = TieTuApi.TIETU_DETAIL2;

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(url);

                try {
                    Document doc = Jsoup.connect(url).timeout(10000).get();
//                    System.out.println(doc);
                    if (doc != null) {
                        TietuUtil tietuUtil = new TietuUtil();
                        tietuUtil.getTietuDetail(TieTuActivity.this, doc);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
