package com.example.demo.pojo;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;
@Data
@Table(name = "sys_user")
public class SysUser {
    @Id
    private Long id;

    private String name;

    private String password;

    private String email;

    @Column(name = "create_time")
    private Date createTime;


}