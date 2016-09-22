package com.lnyp.api.meizhi;

import java.util.List;

/**
 * 妹子详情
 */
public class MeiziDetail {

    private List<String> tag;

    private List<ImageBean> imgBeans;

    public List<String> getTag() {
        return tag;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }

    public List<ImageBean> getImgBeans() {
        return imgBeans;
    }

    public void setImgBeans(List<ImageBean> imgBeans) {
        this.imgBeans = imgBeans;
    }

    public static class ImageBean {
        private String detailUrl;
        private String imgUrl;
        private String imgUrlLarge;
        private String width;
        private String height;
        private String title;

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

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImgUrlLarge() {
            return imgUrlLarge;
        }

        public void setImgUrlLarge(String imgUrlLarge) {
            this.imgUrlLarge = imgUrlLarge;
        }

        @Override
        public String toString() {
            return "ImageBean{" +
                    "detailUrl='" + detailUrl + '\'' +
                    ", imgUrl='" + imgUrl + '\'' +
                    ", imgUrlLarge='" + imgUrlLarge + '\'' +
                    ", width='" + width + '\'' +
                    ", height='" + height + '\'' +
                    ", title='" + title + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "MeiziDetail{" +
                "tag=" + tag +
                ", imgBeans=" + imgBeans +
                '}';
    }
}
