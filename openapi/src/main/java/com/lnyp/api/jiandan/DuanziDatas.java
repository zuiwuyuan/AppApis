package com.lnyp.api.jiandan;

import java.util.List;

public class DuanziDatas {

    // 当前页
    public String current_comment_page;

    public List<DuanziBean> duanziBeanList;

    @Override
    public String toString() {
        return "DuanziDatas{" +
                "current_comment_page='" + current_comment_page + '\'' +
                ", duanziBeanList=" + duanziBeanList +
                '}';
    }
}
