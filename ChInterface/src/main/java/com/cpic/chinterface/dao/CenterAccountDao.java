package com.cpic.chinterface.dao;

import org.springframework.stereotype.Repository;

import com.cpic.chinterface.model.CenterAccount;

@Repository
public interface CenterAccountDao  {
		/**
		 * 根据用户名查找
		 * @param account
		 * @return extends BaseDao<CenterAccount>
		 */
//		public CenterAccount findByAccount(String account){
//			CenterAccount userAccount = new CenterAccount();
//			userAccount.setAccount(account);
//			return findUniqueBySelective(userAccount);
//		}
		public CenterAccount findById(Long id);
	
}
