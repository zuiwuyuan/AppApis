package com.lnyp.api.pengfu;

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
public class JokeUtil {

    /**
     * 最新笑话列表
     *
     * @param doc
     */
    public void getNewJokelist(Context mContext, Document doc) {

        //class等于list-item的div标签
        Elements list_item_elements = doc.select("div.list-item");

        List<JokeBean> jokeBeanList = new ArrayList<>();

        if (list_item_elements.size() > 0) {

            for (int i = 0; i < list_item_elements.size(); i++) {

                JokeBean jokeBean = new JokeBean();


                Element list_item_element = list_item_elements.get(i);

                Elements head_name_elements = list_item_element.select("div.head-name");

                if (head_name_elements.size() > 0) {
                    Element head_name_element = head_name_elements.first();
                    if (head_name_element != null) {
                        String userAvatar = head_name_element.select("img").first().attr("src");
                        String userName = head_name_element.select("a[href]").get(1).text(); //带有href属性的a元素
                        String lastTime = head_name_element.getElementsByClass("dp-i-b").first().text(); //带有href属性的a元素

                        jokeBean.setUserAvatar(userAvatar);
                        jokeBean.setUserName(userName);
                        jokeBean.setLastTime(lastTime);
                    }
                }

                Element con_img_elements = list_item_element.select("div").get(2);
                if (con_img_elements != null) {
                    if (con_img_elements.select("img") != null) {

                        Element img_element = con_img_elements.select("img").first();

                        JokeBean.DataBean dataBean = new JokeBean.DataBean();

                        if (img_element != null) {
                            String showImg = img_element.attr("src");
                            String gifsrcImg = img_element.attr("gifsrc");
                            String width = img_element.attr("width");
                            String height = img_element.attr("height");

                            dataBean.setShowImg(showImg);
                            dataBean.setGifsrcImg(gifsrcImg);
                            dataBean.setWidth(width);
                            dataBean.setHeight(height);

                        } else {
                            String content = con_img_elements.text();
                            dataBean.setContent(content);
                        }

                        jokeBean.setDataBean(dataBean);

                    }
                }


                Element tagwrap_clearfix_elements = list_item_element.select("div").get(3);
                if (tagwrap_clearfix_elements != null) {

                    Elements clearfixs = tagwrap_clearfix_elements.select("a[href]"); //带有href属性的a元素

                    List<String> tags = new ArrayList<>();

                    for (int j = 0; j < clearfixs.size(); j++) {

                        String tag = clearfixs.get(j) != null ? clearfixs.get(j).text() : "";
                        tags.add(tag);
                    }

                    jokeBean.setTags(tags);
                }

                jokeBeanList.add(jokeBean);
            }

            for (JokeBean jokeBean : jokeBeanList) {
                LogUtils.e(jokeBean);
                LogUtils.e(jokeBean.getTags());
                LogUtils.e(jokeBean.getDataBean().toString());
//                if (jokeBean != null && jokeBean.getDataBean() != null) {
//                    LogUtils.e(jokeBean.getDataBean().toString());
//                }

            }

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < jokeBeanList.size(); i++) {
                String data = jokeBeanList.get(i).toString();
                sb.append(data).append("\n");
            }

            Intent intent = new Intent(mContext, ShowActivity.class);
            intent.putExtra("data", sb.toString());
            mContext.startActivity(intent);

        }

    }
}
