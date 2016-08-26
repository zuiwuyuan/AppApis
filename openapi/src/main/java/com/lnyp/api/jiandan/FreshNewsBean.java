package com.lnyp.api.jiandan;

/**
 * 煎蛋-新鲜事列表
 */
public class FreshNewsBean {

    private String title;

    private String detailUrl;

    private String imgUrl;

    private String keyWords;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    @Override
    public String toString() {
        return "FreshNewsBean{" +
                "title='" + title + '\'' +
                ", detailUrl='" + detailUrl + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", keyWords='" + keyWords + '\'' +
                '}';
    }
}
