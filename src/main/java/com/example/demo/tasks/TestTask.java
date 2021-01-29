package com.example.demo.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component //这个注解表示这是一个组件
public class TestTask {
	private  static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	//这个注释表示每隔3秒执行一次
	//@Scheduled(fixedRate = 3000)

	@Scheduled(cron = "") //支持表达式 网站地址    cron.qqe2.com
	public void reportCurrentTime(){
		System.out.println("现在时间："+dateFormat.format(new Date()));
	}
}
