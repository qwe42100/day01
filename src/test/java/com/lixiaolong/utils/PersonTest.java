/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: PersonTest.java 
 * @Prject: lixiaolong-common
 * @Package: com.lixiaolong.utils 
 * @Description: TODO
 * @author: ASUS   
 * @date: 2019年8月9日 下午1:43:32 
 * @version: V1.0   
 */
package com.lixiaolong.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.lixiaolong.utils.entity.Person;

/** 
 * @ClassName: PersonTest 
 * @Description: TODO
 * @author: ASUS
 * @date: 2019年8月9日 下午1:43:32  
 */
public class PersonTest {
	/**
	 * 姓名属性值调用StringUtil.generateChineseName()创建（4分）
年龄属性值调用RandomUtil.random()创建，必须在1-120岁之间（4分）
介绍属性值调用StringUtil.randomChineseString()创建，字数为140个随机汉字（4分）
注册日期属性值模拟2010年1月1日至今任意随机时间（4分）。
批量生成1万个，并在控制台输出（4分）
	 * @Title: test1 
	 * @Description: TODO
	 * @return: void
	 * @throws Exception 
	 * @throws ParseException 
	 */
	@Test
	public void test() throws Exception {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String startDate = "2010-01-01"; 
		for (int i = 0; i < 100; i++) {
			String name = StringUtil.generateChineseName(); 
			Integer age = RandomUtil.random(1, 120);
			String about = StringUtil.randomChineseString(10);
			Date date = DateUtil.getRandom(df.parse(startDate),new Date());
			Person person = new Person(name, age, about, date);
			System.out.println(person);
		}
		
	}

}
