package com.nba.model;

import java.io.Serializable;

/**
 * bbs_thread
 * @author 
 */
public class BbsThread implements Serializable {
    private Integer tid;

    private Boolean top;

    private Integer uid;

    private String subject;

    private Integer createDate;

    private Integer lastDate;

    private Integer views;

    private Integer posts;

    private Boolean closed;

    private Integer firstpid;

    private static final long serialVersionUID = 1L;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Boolean getTop() {
        return top;
    }

    public void setTop(Boolean top) {
        this.top = top;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    public Integer getLastDate() {
        return lastDate;
    }

    public void setLastDate(Integer lastDate) {
        this.lastDate = lastDate;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getPosts() {
        return posts;
    }

    public void setPosts(Integer posts) {
        this.posts = posts;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Integer getFirstpid() {
        return firstpid;
    }

    public void setFirstpid(Integer firstpid) {
        this.firstpid = firstpid;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BbsThread other = (BbsThread) that;
        return (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getTop() == null ? other.getTop() == null : this.getTop().equals(other.getTop()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getSubject() == null ? other.getSubject() == null : this.getSubject().equals(other.getSubject()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getLastDate() == null ? other.getLastDate() == null : this.getLastDate().equals(other.getLastDate()))
            && (this.getViews() == null ? other.getViews() == null : this.getViews().equals(other.getViews()))
            && (this.getPosts() == null ? other.getPosts() == null : this.getPosts().equals(other.getPosts()))
            && (this.getClosed() == null ? other.getClosed() == null : this.getClosed().equals(other.getClosed()))
            && (this.getFirstpid() == null ? other.getFirstpid() == null : this.getFirstpid().equals(other.getFirstpid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getTop() == null) ? 0 : getTop().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getSubject() == null) ? 0 : getSubject().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getLastDate() == null) ? 0 : getLastDate().hashCode());
        result = prime * result + ((getViews() == null) ? 0 : getViews().hashCode());
        result = prime * result + ((getPosts() == null) ? 0 : getPosts().hashCode());
        result = prime * result + ((getClosed() == null) ? 0 : getClosed().hashCode());
        result = prime * result + ((getFirstpid() == null) ? 0 : getFirstpid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tid=").append(tid);
        sb.append(", top=").append(top);
        sb.append(", uid=").append(uid);
        sb.append(", subject=").append(subject);
        sb.append(", createDate=").append(createDate);
        sb.append(", lastDate=").append(lastDate);
        sb.append(", views=").append(views);
        sb.append(", posts=").append(posts);
        sb.append(", closed=").append(closed);
        sb.append(", firstpid=").append(firstpid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}