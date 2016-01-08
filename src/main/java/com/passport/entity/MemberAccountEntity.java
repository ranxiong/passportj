package com.passport.entity;

import javax.persistence.*;

/**
 * Created by panyao on 15/10/11.
 */
@Entity
@Table(name = "member_account", schema = "", catalog = "uc")
public class MemberAccountEntity {
    private String account;
    private int userId;
    private byte accountType;

    @Id
    @Column(name = "account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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
    @Column(name = "account_type")
    public byte getAccountType() {
        return accountType;
    }

    public void setAccountType(byte accountType) {
        this.accountType = accountType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MemberAccountEntity that = (MemberAccountEntity) o;

        if (userId != that.userId) return false;
        if (accountType != that.accountType) return false;
        if (account != null ? !account.equals(that.account) : that.account != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = account != null ? account.hashCode() : 0;
        result = 31 * result + userId;
        result = 31 * result + (int) accountType;
        return result;
    }
}
