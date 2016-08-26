package com.lnyp.api.pengfu;

import java.util.List;

/**
 * 最新笑话
 */
public class JokeBean {

    private String userName;
    private String lastTime;
    private String userAvatar;
    private List<String> tags;

    private DataBean dataBean;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public DataBean getDataBean() {
        return dataBean;
    }

    public void setDataBean(DataBean dataBean) {
        this.dataBean = dataBean;
    }

    public static class DataBean {

        private String content;
        private String showImg;
        private String gifsrcImg;
        private String width;
        private String height;


        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getShowImg() {
            return showImg;
        }

        public void setShowImg(String showImg) {
            this.showImg = showImg;
        }

        public String getGifsrcImg() {
            return gifsrcImg;
        }

        public void setGifsrcImg(String gifsrcImg) {
            this.gifsrcImg = gifsrcImg;
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

        @Override
        public String toString() {
            return "DataBean{" +
                    "content='" + content + '\'' +
                    ", showImg='" + showImg + '\'' +
                    ", gifsrcImg='" + gifsrcImg + '\'' +
                    ", width='" + width + '\'' +
                    ", height='" + height + '\'' +
                    '}';
        }
    }

}
