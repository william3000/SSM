package com.cpic.chinterface.service;

import com.cpic.chinterface.model.CenterAccount;

public interface IUserService {
	//public CenterAccount getUserByIdcard(String idcard);
	 public CenterAccount findById(Long id);
}
