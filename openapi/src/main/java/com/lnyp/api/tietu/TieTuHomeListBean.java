package com.lnyp.api.tietu;

/**
 * 贴图-首页列表
 */
public class TieTuHomeListBean {

    public String title;
    public String imgUrl;
    public String detailUrl;

    @Override
    public String toString() {
        return "TieTuHomeListBean{" +
                "title='" + title + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", detailUrl='" + detailUrl + '\'' +
                '}';
    }
}
