package com.example.demo.service;

import com.example.demo.pojo.SysUser;


import java.util.List;

/**
 * 用户接口类
 * @author Administrator
 */
public interface UserService {
	/**
	 * 保存
	 * @throws Exception
	 * @param user
	 */
	public  void saveUser(SysUser user) throws Exception;


	public List<SysUser> queryList() ;

	public void update(SysUser user);


	public List<SysUser> queryListPage(SysUser user,Integer page ,Integer pageSize) ;


	List<SysUser> queryCustomer(String id) ;

	/**
	 * 调试事务
	 */
	public  void saveLzy();

}
