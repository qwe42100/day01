/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtilTest.java 
 * @Prject: lixiaolong-common
 * @Package: com.lixiaolong.utils 
 * @Description: TODO
 * @author: ASUS   
 * @date: 2019年8月7日 下午8:34:07 
 * @version: V1.0   
 */
package com.lixiaolong.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

/** 
 * @ClassName: DateUtilTest 
 * @Description: TODO
 * @author: ASUS
 * @date: 2019年8月7日 下午8:34:07  
 */
public class DateUtilTest {

	@Test
	public void test() {
		Date date = DateUtil.getDateByInitMonth(new Date());
		SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(dd.format(date));
	}
	@Test
	public void test1() {
		Date date = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(dd.format(date));
	}
	@Test
	public void test2() {
		/***
		 * String sql = "select * from t_order where create_time>='{1}'
		 *  and create_time<='{2}' ";
	将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换，
	将上面{2}的位置使用DateUtil工具类中的getDateByFullMonth()返回值替换。
	最后打印出正确拼接的SQL字符串。
		 * @Title: test1 
		 * @Description: TODO
		 * @return: void
		 */
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}'";
		Date date = DateUtil.getDateByInitMonth(new Date());
		Date date1 = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sql1= sql.replace("{1}",dd.format(date)).replace("{2}", dd.format(date1));
		System.out.println(sql1);
	}
}
