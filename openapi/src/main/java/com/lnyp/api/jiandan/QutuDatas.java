package com.lnyp.api.jiandan;

import java.util.List;

/**
 * Created by lining on 2016/8/26.
 */
public class QutuDatas {
    // 当前页
    public String current_comment_page;

    public List<QutuBean> jianDanQutuBeenList;

    @Override
    public String toString() {
        return "QutuDatas{" +
                "current_comment_page='" + current_comment_page + '\'' +
                ", jianDanQutuBeenList=" + jianDanQutuBeenList +
                '}';
    }
}
