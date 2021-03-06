package com.mall.pojo;

import java.util.Date;

public class Review {
    private Integer id;

    private String content;

    private Integer uid;

    private Integer pid;

    private Date createDate;
    /**/
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Review(Integer id, String content, Integer uid, Integer pid, Date createDate) {
        this.id = id;
        this.content = content;
        this.uid = uid;
        this.pid = pid;
        this.createDate = createDate;
    }

    public Review() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}