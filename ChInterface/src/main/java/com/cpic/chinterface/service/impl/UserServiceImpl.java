package com.cpic.chinterface.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cpic.chinterface.dao.CenterAccountDao;
import com.cpic.chinterface.model.CenterAccount;
import com.cpic.chinterface.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {  
    @Resource
    private CenterAccountDao centerAccountDao;  
    
//    public CenterAccount getUserByIdcard(String idcard) {  
//    	CenterAccount centerAccount = new CenterAccount();
//    	centerAccount.setIdcard(idcard);
//        return this.centerAccountDao.findUniqueBySelective(centerAccount);  
//    }  
    public CenterAccount findById(Long id){
    	return centerAccountDao.findById(id);
    }
}
