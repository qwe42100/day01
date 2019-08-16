/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: PatternUtilsTest.java 
 * @Prject: lixiaolong-common
 * @Package: com.lixiaolong.utils 
 * @Description: TODO
 * @author: ASUS   
 * @date: 2019年8月12日 上午10:31:29 
 * @version: V1.0   
 */
package com.lixiaolong.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @ClassName: PatternUtilsTest 
 * @Description: TODO
 * @author: ASUS
 * @date: 2019年8月12日 上午10:31:29  
 */
public class PatternUtilsTest {

	/**
	 * Test method for {@link com.lixiaolong.utils.PatternUtils#getthrid(java.lang.String)}.
	 */
	@Test
	public void testGetthrid() {
		String string = "外汇局：美国认定中国“汇率操纵”根本站不住脚|http://news.cnstock.com/news,yw-201908-4413224.htm|8|2019-08-08 07:37:32";
		Integer string2 = PatternUtils.getthrid(string);
		System.out.println(string2);
	}

	/**
	 * Test method for {@link com.lixiaolong.utils.PatternUtils#getsec(java.lang.String)}.
	 */
	@Test
	public void testGetsec() {
		String string = "外汇局：美国认定中国“汇率操纵”根本站不住脚|http://news.cnstock.com/news,yw-201908-4413224.htm|8|2019-08-08 07:37:32";
		String  string2 = PatternUtils.getFirstNum(string);
		System.out.println(string2);
		String  string3 = PatternUtils.getsec(string);
		System.out.println(string3);
		String stri = PatternUtils.getLastNum(string);
		System.out.println(stri);
		
	}

}
