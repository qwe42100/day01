/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StringUtilTest.java 
 * @Prject: lixiaolong-common
 * @Package: com.lixiaolong.utils 
 * @Description: TODO
 * @author: ASUS   
 * @date: 2019年8月8日 下午4:47:26 
 * @version: V1.0   
 */
package com.lixiaolong.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @ClassName: StringUtilTest 
 * @Description: TODO
 * @author: ASUS
 * @date: 2019年8月8日 下午4:47:26  
 */
public class StringUtilTest {
	@Test
	public void test() {
		String str = "";
		boolean b = StringUtil.isNumber(str);
		System.out.println(b);
	}

	/**
	 * Test method for {@link com.lixiaolong.utils.StringUtil#hasLength(java.lang.String)}.
	 */
	@Test
	public void testHasLength() {
		boolean b = StringUtil.hasLength("");
		System.out.println(b);
	}

	/**
	 * Test method for {@link com.lixiaolong.utils.StringUtil#hasText(java.lang.String)}.
	 */
	@Test
	public void testHasText() {
		boolean b = StringUtil.hasLength("");
		System.out.println(b);
	}

	/**
	 * Test method for {@link com.lixiaolong.utils.StringUtil#randomChineseString()}.
	 * @throws Exception 
	 */
	@Test
	public void testRandomChineseString() throws Exception {
		System.out.println(StringUtil.randomChineseString(20));
	
	}
	/**
	 * Test method for {@link com.lixiaolong.utils.StringUtil#generateChineseName()}.
	 * @throws Exception 
	 */
	@Test
	public void testGenerateChineseName() throws Exception {
		for (int i = 0; i < 10; i++) {
			System.out.println(StringUtil.generateChineseName());
		}
	}

}
