package com.passport.entity;

import javax.persistence.*;

/**
 * Created by panyao on 15/10/11.
 */
@Entity
@Table(name = "member_log", schema = "", catalog = "uc")
public class MemberLogEntity {
    private long id;
    private int userId;
    private int loginTime;
    private String loginIp;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "login_time")
    public int getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(int loginTime) {
        this.loginTime = loginTime;
    }

    @Basic
    @Column(name = "login_ip")
    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MemberLogEntity that = (MemberLogEntity) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (loginTime != that.loginTime) return false;
        if (loginIp != null ? !loginIp.equals(that.loginIp) : that.loginIp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + userId;
        result = 31 * result + loginTime;
        result = 31 * result + (loginIp != null ? loginIp.hashCode() : 0);
        return result;
    }
}
