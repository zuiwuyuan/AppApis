package com.lnyp.api.jiandan;

/**
 * 煎蛋-新鲜事列表
 */
public class JianDanDetail {

    // 1. 图
    // 2. 文
    private int type;

    private String desc;

    private String imgSmall;

    private String imgMedium;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImgSmall() {
        return imgSmall;
    }

    public void setImgSmall(String imgSmall) {
        this.imgSmall = imgSmall;
    }

    public String getImgMedium() {
        return imgMedium;
    }

    public void setImgMedium(String imgMedium) {
        this.imgMedium = imgMedium;
    }


    @Override
    public String toString() {
        return "JianDanDetail{" +
                "type=" + type +
                ", desc='" + desc + '\'' +
                ", imgSmall='" + imgSmall + '\'' +
                ", imgMedium='" + imgMedium + '\'' +
                '}';
    }
}
