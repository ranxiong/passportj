package com.passport.service;

import com.passport.model.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/12/11.
 */
//@Transactional
@Service("loginService")
public class LoginService {

    //@Resource
    //private UserDao userDao = null;

    public boolean login(String accountId, String password) {

//        MemberEntity memberEntity = userDao.getEntityByAccountId(accountId);
//        System.out.println(memberEntity);

        return true;
    }
}
