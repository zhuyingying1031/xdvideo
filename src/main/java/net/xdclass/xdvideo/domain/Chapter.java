package net.xdclass.xdvideo.domain;

import java.util.Date;

public class Chapter {
    private Integer id;

    private Integer videoId;

    private String title;

    private Integer ordered;

    private Date createTime;

    public Chapter(Integer id, Integer videoId, String title, Integer ordered, Date createTime) {
        this.id = id;
        this.videoId = videoId;
        this.title = title;
        this.ordered = ordered;
        this.createTime = createTime;
    }

    public Chapter() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}