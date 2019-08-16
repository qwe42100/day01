/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: PatternUtils.java 
 * @Prject: lixiaolong-common
 * @Package: com.lixiaolong.utils 
 * @Description: TODO
 * @author: ASUS   
 * @date: 2019年8月11日 下午8:29:07 
 * @version: V1.0   
 */
package com.lixiaolong.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * @ClassName: PatternUtils 
 * @Description: TODO
 * @author: ASUS
 * @date: 2019年8月11日 下午8:29:07  
 */
public class PatternUtils {
	
	public static String getLastNum(String url) {
		String[] split = url.split("\\|");
		String num = split[split.length-1];
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if(StringUtil.isNumber(num)) {
			num = format.format(new Date());
		}
		return num;
	}
	/** 
	 * @Title: SimpleDateFormat 
	 * @Description: TODO
	 * @param string
	 * @return: void
	 */
	public static Integer getthrid(String url) {
		String[] split = url.split("\\|");
		String string = split[split.length-2];
		if (StringUtil.hasText(string)) {
			if(!StringUtil.isNumber(string)) {
				string = split[split.length-1];
			}
			return Integer.parseInt(string);
		}
		return Integer.parseInt("0");
	}
	/**
	 * 
	 * @Title: getFirstNumFormUrl 
	 * @Description: 获取第一个数字
	 * @param url
	 * @return
	 * @return: Integer
	 */
	public static String getFirstNum(String url) {
	    String[] split = url.split("\\|");
	     return split[0];
	}
	
	public static String getsec(String url) {
		String[] split = url.split("\\|");
		return split[1];
	}
}
