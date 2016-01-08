package com.passport.model;

import com.passport.entity.MemberEntity;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/12/11.
 */
@Repository("userDao")
public class UserDao {

    public MemberEntity getEntityByAccountId(String accountId){

        return null;
    }

}
