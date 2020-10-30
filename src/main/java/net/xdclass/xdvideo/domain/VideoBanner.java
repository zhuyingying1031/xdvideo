package net.xdclass.xdvideo.domain;

import java.util.Date;

public class VideoBanner {
    private Integer id;

    private String url;

    private String img;

    private Date createTime;

    private Integer weight;

    public VideoBanner(Integer id, String url, String img, Date createTime, Integer weight) {
        this.id = id;
        this.url = url;
        this.img = img;
        this.createTime = createTime;
        this.weight = weight;
    }

    public VideoBanner() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}