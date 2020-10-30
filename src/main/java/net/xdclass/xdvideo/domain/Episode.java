package net.xdclass.xdvideo.domain;

import java.util.Date;

public class Episode {
    private Integer id;

    private String title;

    private Integer num;

    private Integer ordered;

    private String playUrl;

    private Integer chapterId;

    private Byte free;

    private String coverImg;

    private Integer videoId;

    private Date createTime;

    public Episode(Integer id, String title, Integer num, Integer ordered, String playUrl, Integer chapterId, Byte free, String coverImg, Integer videoId, Date createTime) {
        this.id = id;
        this.title = title;
        this.num = num;
        this.ordered = ordered;
        this.playUrl = playUrl;
        this.chapterId = chapterId;
        this.free = free;
        this.coverImg = coverImg;
        this.videoId = videoId;
        this.createTime = createTime;
    }

    public Episode() {
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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl == null ? null : playUrl.trim();
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Byte getFree() {
        return free;
    }

    public void setFree(Byte free) {
        this.free = free;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg == null ? null : coverImg.trim();
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}