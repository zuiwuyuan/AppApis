package com.lnyp.api.jiandan;

/**
 * 妹子图
 */
public class DuanziBean {
    public String author;
    public String lastUpdateTime;
    public String content;

    @Override
    public String toString() {
        return "DuanziBean{" +
                "author='" + author + '\'' +
                ", lastUpdateTime='" + lastUpdateTime + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
