package com.example.demo.mapper;

import com.example.demo.pojo.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserMapperCustom {

	List<SysUser> queryUserSimplyInfoById(String id);
}
