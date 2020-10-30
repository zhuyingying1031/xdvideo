package net.xdclass.xdvideo.domain;

import java.util.Date;

public class Video {
    private Integer id;

    private String title;

    private String summary;

    private String coverImg;

    private Integer price;

    private Date createTime;

    private Integer cId;

    private Double point;

    public Video(Integer id, String title, String summary, String coverImg, Integer price, Date createTime, Integer cId, Double point) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.coverImg = coverImg;
        this.price = price;
        this.createTime = createTime;
        this.cId = cId;
        this.point = point;
    }

    public Video() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg == null ? null : coverImg.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }
}