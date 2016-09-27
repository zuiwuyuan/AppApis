package com.lnyp.api.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lnyp.api.R;
import com.lnyp.api.jiandan.JianDanUtil;
import com.lnyp.api.jiandan.JiandanApi;

import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * 测试煎蛋网数据
 */
public class JianDanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jian_dan);
    }

    /**
     * 简单-新鲜事列表
     * 请求url：http://jandan.net/2016/09/28
     *
     * @param view
     */
    public void onClick1(View view) {

        JianDanUtil jianDanUtil = new JianDanUtil();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/mm/dd");

        Date now = new Date();

        String date = simpleDateFormat.format(now);

        jianDanUtil.getNewThings(this, date);
    }

    /**
     * 新鲜事详情
     * 请求的url字段，可以从列表中拿到
     *
     * @param view
     */
    public void onClick2(View view) {

        // 测试的的详情url，具体的url字段，可以从列表中拿到
        String url = "http://jandan.net/2016/08/26/self-powered-robot.html";

        JianDanUtil jianDanUtil = new JianDanUtil();

        jianDanUtil.getNewThingDetail(this, url);

    }

    /**
     * 段子列表
     * 默认请求url：http://jandan.net/duan/
     * 拿到最初的（最新的）数据后，解析，拿到current_comment_page字段，也就是当前页。
     * 之后，通过url：“http://jandan.net/duan/page-current_comment_page”（如http://jandan.net/duan/page-1552）字段之后便可以逐次减1，实现分页功能
     *
     * @param view
     */
    public void onClick3(View view) {

        final String url = JiandanApi.DUANZI;

        JianDanUtil jianDanUtil = new JianDanUtil();
        jianDanUtil.getDuans(this, url);
    }

    /**
     * 妹子图列表
     * 默认请求url：http://jandan.net/ooxx/
     * 拿到最初的（最新的）数据后，解析，拿到current_comment_page字段，也就是当前页。
     * 之后，通过url：“http://jandan.net/ooxx/page-current_comment_page”（如http://jandan.net/ooxx/page-2144）字段之后便可以逐次减1，实现分页功能
     *
     * @param view
     */
    public void onClick4(View view) {

        final String url = JiandanApi.OOXX;

        JianDanUtil jianDanUtil = new JianDanUtil();
        jianDanUtil.getMeizis(this, url);
    }

    /**
     * 无聊图列表
     * 默认请求url：http://jandan.net/pic/
     * 拿到最初的（最新的）数据后，解析，拿到current_comment_page字段，也就是当前页。
     * 之后，通过url：“http://jandan.net/pic/page-current_comment_page”（如http://jandan.net/pic/page-2144）字段之后便可以逐次减1，实现分页功能
     *
     * @param view
     */
    public void onClick5(View view) {

        final String url = JiandanApi.PIC;

        JianDanUtil jianDanUtil = new JianDanUtil();
        jianDanUtil.getQutus(this, url);

    }
}
