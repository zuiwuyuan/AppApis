package com.lnyp.api.tietu;

/**
 * 贴图列表
 */
public class TieTuListBean {

//    一组清新调皮的可爱女生图  http://m.51tietu.net/tp/42289.html  http://img2.51tietu.net/upload/thumb/20160921/201607182247340z1brh0cq2f280x180.jpg

    public String title;
    public String imgUrl;
    public String detailUrl;

    @Override
    public String toString() {
        return "TieTuListBean{" +
                "title='" + title + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", detailUrl='" + detailUrl + '\'' +
                '}';
    }
}

