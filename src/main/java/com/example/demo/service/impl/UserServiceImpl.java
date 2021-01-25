package com.example.demo.service.impl;

import com.example.demo.mapper.SysUserMapper;
import com.example.demo.mapper.SysUserMapperCustom;
import com.example.demo.pojo.SysUser;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private SysUserMapper sysUserMapper;

	@Autowired
	private SysUserMapperCustom sysUserMapperCustom;

	@Override
	public void saveUser(SysUser user) throws Exception {
		sysUserMapper.insert(user);
	}

	@Override
	public List<SysUser> queryList() {
		return sysUserMapper.selectAll();
	}

	@Override
	public void update(SysUser user) {
		sysUserMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public List<SysUser> queryListPage(SysUser user, Integer page, Integer pageSize) {
		PageHelper.startPage(page,pageSize);
		Example example = new Example(SysUser.class);
		Example.Criteria criteria = example.createCriteria();
		example.orderBy("createTime").desc();
		List<SysUser> sysUsers = sysUserMapper.selectByExample(example);
		return sysUsers;
	}

	@Override
	public List<SysUser> queryCustomer(String id) {
		return  sysUserMapperCustom.queryUserSimplyInfoById(id);
	}


}
