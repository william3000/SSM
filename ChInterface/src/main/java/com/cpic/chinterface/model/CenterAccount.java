package com.cpic.chinterface.model;


import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author
 * @since 2016-07-27
 */
public class CenterAccount implements Serializable {

	/** 序列化ID */
	private static final long serialVersionUID = 1L;

	/** 账号,唯一 **/
	private String account;
	/** 手机号，唯一 **/
	private String mobile;
	/** email 唯一 **/
	private String email;
	/** 身份证号码 **/
	private String idcard;
	/** 用户头像,默认中心用户头像 **/
	private String avatar;
	/** 状态,0为未激活或临时用户不能登录,1为正常注册用户，可登录,2为临时禁用 3永久停用，需要人工授权才能打开 **/
	private Integer status;
	/** 密码,加密过的密码 **/
	private String passwd;
	/** 姓名，全名，如李四 **/
	private String fullname;
	/** 性别,M或F **/
	private String gender;
	/** 生日,日期格式 **/
	private Date birthday;
	/** 注册ip **/
	private String createdIp;
	/** 注册时间 **/
	private Date createdAt;
	/** 更新时间 **/
	private Date updatedAt;
	/** 最后登录时间 **/
	private Date lastLoginAt;
	/** 最后更新密码时间 **/
	private Date lastUpdatePwd;
	/** 注册时客户端信息,iphone6|ios|8.4.1 格式：model|系统|统版本号 **/
	private String createdClientInfo;
	/** 注册时客户端信息,iphone6|ios|8.4.1 格式：model|系统|系统版本号 **/
	private String lastClientInfo;
	/** 一般是系统分配的appid **/
	private String createdAppId;
	/** 从什么系统调用，可以通过系统的枚举 **/
	private String createdFromTag;
	/** 一般是系统分配的appid **/
	private String lastAppId;
	/** 从什么系统调用，可以通过系统的枚举 **/
	private String lastFromTag;
	/** 最后登录ip地址 **/
	private String lastLoginIp;
	/**
	 * 签名,1防止并发,2防止黑客修改,签名字段使用md5(account+created_ip+updated_at(格式是yyyyMMddHHmm)
	 * +约定key)取16位小写
	 **/
	private String signature;

	
	/**
	 * 获取属性:account 账号,唯一
	 * 
	 * @return account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * 设置属性:account 账号,唯一
	 * 
	 * @param account
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * 获取属性:mobile 手机号，唯一
	 * 
	 * @return mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 设置属性:mobile 手机号，唯一
	 * 
	 * @param mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 获取属性:email email 唯一
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 设置属性:email email 唯一
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 获取属性:avatar 用户头像,默认中心用户头像
	 * 
	 * @return avatar
	 */
	public String getAvatar() {
		return avatar;
	}

	/**
	 * 设置属性:avatar 用户头像,默认中心用户头像
	 * 
	 * @param avatar
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * 获取属性:status 状态,0为未激活或临时用户不能登录,1为正常注册用户，可登录,2为临时禁用 3永久停用，需要人工授权才能打开
	 * 
	 * @return status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 设置属性:status 状态,0为未激活或临时用户不能登录,1为正常注册用户，可登录,2为临时禁用 3永久停用，需要人工授权才能打开
	 * 
	 * @param status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * 获取属性:passwd 密码,加密过的密码
	 * 
	 * @return passwd
	 */
	public String getPasswd() {
		return passwd;
	}

	/**
	 * 设置属性:passwd 密码,加密过的密码
	 * 
	 * @param passwd
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	/**
	 * 获取属性:fullname 姓名，全名，如李四
	 * 
	 * @return fullname
	 */
	public String getFullname() {
		return fullname;
	}

	/**
	 * 设置属性:fullname 姓名，全名，如李四
	 * 
	 * @param fullname
	 */
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	/**
	 * 获取属性:gender 性别,M或F
	 * 
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * 设置属性:gender 性别,M或F
	 * 
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * 获取属性:birthday 生日,日期格式
	 * 
	 * @return birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * 设置属性:birthday 生日,日期格式
	 * 
	 * @param birthday
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * 获取属性:createdIp 注册ip
	 * 
	 * @return createdIp
	 */
	public String getCreatedIp() {
		return createdIp;
	}

	/**
	 * 设置属性:createdIp 注册ip
	 * 
	 * @param createdIp
	 */
	public void setCreatedIp(String createdIp) {
		this.createdIp = createdIp;
	}

	/**
	 * 获取属性:createdAt 注册时间
	 * 
	 * @return createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * 设置属性:createdAt 注册时间
	 * 
	 * @param createdAt
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * 获取属性:updatedAt 更新时间
	 * 
	 * @return updatedAt
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * 设置属性:updatedAt 更新时间
	 * 
	 * @param updatedAt
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * 获取属性:lastLoginAt 最后登录时间
	 * 
	 * @return lastLoginAt
	 */
	public Date getLastLoginAt() {
		return lastLoginAt;
	}

	/**
	 * 设置属性:lastLoginAt 最后登录时间
	 * 
	 * @param lastLoginAt
	 */
	public void setLastLoginAt(Date lastLoginAt) {
		this.lastLoginAt = lastLoginAt;
	}

	/**
	 * 获取属性:lastUpdatePwd 最后更新密码时间
	 * 
	 * @return lastUpdatePwd
	 */
	public Date getLastUpdatePwd() {
		return lastUpdatePwd;
	}

	/**
	 * 设置属性:lastUpdatePwd 最后更新密码时间
	 * 
	 * @param lastUpdatePwd
	 */
	public void setLastUpdatePwd(Date lastUpdatePwd) {
		this.lastUpdatePwd = lastUpdatePwd;
	}

	/**
	 * 获取属性:createdClientInfo 注册时客户端信息,iphone6|ios|8.4.1 格式：model|系统|统版本号
	 * 
	 * @return createdClientInfo
	 */
	public String getCreatedClientInfo() {
		return createdClientInfo;
	}

	/**
	 * 设置属性:createdClientInfo 注册时客户端信息,iphone6|ios|8.4.1 格式：model|系统|统版本号
	 * 
	 * @param createdClientInfo
	 */
	public void setCreatedClientInfo(String createdClientInfo) {
		this.createdClientInfo = createdClientInfo;
	}

	/**
	 * 获取属性:lastClientInfo 注册时客户端信息,iphone6|ios|8.4.1 格式：model|系统|系统版本号
	 * 
	 * @return lastClientInfo
	 */
	public String getLastClientInfo() {
		return lastClientInfo;
	}

	/**
	 * 设置属性:lastClientInfo 注册时客户端信息,iphone6|ios|8.4.1 格式：model|系统|系统版本号
	 * 
	 * @param lastClientInfo
	 */
	public void setLastClientInfo(String lastClientInfo) {
		this.lastClientInfo = lastClientInfo;
	}

	/**
	 * 获取属性:createdAppId 一般是系统分配的appid
	 * 
	 * @return createdAppId
	 */
	public String getCreatedAppId() {
		return createdAppId;
	}

	/**
	 * 设置属性:createdAppId 一般是系统分配的appid
	 * 
	 * @param createdAppId
	 */
	public void setCreatedAppId(String createdAppId) {
		this.createdAppId = createdAppId;
	}

	/**
	 * 获取属性:createdFromTag 从什么系统调用，可以通过系统的枚举
	 * 
	 * @return createdFromTag
	 */
	public String getCreatedFromTag() {
		return createdFromTag;
	}

	/**
	 * 设置属性:createdFromTag 从什么系统调用，可以通过系统的枚举
	 * 
	 * @param createdFromTag
	 */
	public void setCreatedFromTag(String createdFromTag) {
		this.createdFromTag = createdFromTag;
	}

	/**
	 * 获取属性:lastAppId 一般是系统分配的appid
	 * 
	 * @return lastAppId
	 */
	public String getLastAppId() {
		return lastAppId;
	}

	/**
	 * 设置属性:lastAppId 一般是系统分配的appid
	 * 
	 * @param lastAppId
	 */
	public void setLastAppId(String lastAppId) {
		this.lastAppId = lastAppId;
	}

	/**
	 * 获取属性:lastFromTag 从什么系统调用，可以通过系统的枚举
	 * 
	 * @return lastFromTag
	 */
	public String getLastFromTag() {
		return lastFromTag;
	}

	/**
	 * 设置属性:lastFromTag 从什么系统调用，可以通过系统的枚举
	 * 
	 * @param lastFromTag
	 */
	public void setLastFromTag(String lastFromTag) {
		this.lastFromTag = lastFromTag;
	}

	/**
	 * 获取属性:lastLoginIp 最后登录ip地址
	 * 
	 * @return lastLoginIp
	 */
	public String getLastLoginIp() {
		return lastLoginIp;
	}

	/**
	 * 设置属性:lastLoginIp 最后登录ip地址
	 * 
	 * @param lastLoginIp
	 */
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	/**
	 * 获取属性:signature
	 * 签名,1防止并发,2防止黑客修改,签名字段使用md5(account+created_ip+updated_at(格式是yyyyMMddHHmm)
	 * +约定key)取16位小写
	 * 
	 * @return signature
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * 设置属性:signature
	 * 签名,1防止并发,2防止黑客修改,签名字段使用md5(account+created_ip+updated_at(格式是yyyyMMddHHmm)
	 * +约定key)取16位小写
	 * 
	 * @param signature
	 */
	public void setSignature(String signature) {
		this.signature = signature;
	}
	
	
	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	@Override
	public String toString() {
		return String.format("id:%d,account:%s", idcard, account);
	}

}