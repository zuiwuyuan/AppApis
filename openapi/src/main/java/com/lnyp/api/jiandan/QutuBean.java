package com.lnyp.api.jiandan;

import java.util.List;

/**
 * 无聊图
 */
public class QutuBean {

    public String author;
    public String lastUpdateTime;
    public List<String> imgs;

    @Override
    public String toString() {
        return "QutuBean{" +
                "author='" + author + '\'' +
                ", lastUpdateTime='" + lastUpdateTime + '\'' +
                ", imgs=" + imgs +
                '}';
    }
}
