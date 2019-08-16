/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: FileUtilTest.java 
 * @Prject: lixiaolong-common
 * @Package: com.lixiaolong.utils 
 * @Description: TODO
 * @author: ASUS   
 * @date: 2019年8月8日 上午8:42:57 
 * @version: V1.0   
 */
package com.lixiaolong.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @ClassName: FileUtilTest 
 * @Description: TODO
 * @author: ASUS
 * @date: 2019年8月8日 上午8:42:57  
 */
public class FileUtilTest {

	/**
	 * Test method for {@link com.lixiaolong.utils.FileUtil#getExtendName(java.lang.String)}.
	 */
	@Test
	public void testGetExtendName() {
		String test = "aaa.jpg";
		String str = FileUtil.getExtendName(test);
		System.out.println(str);
	}

	/**
	 * Test method for {@link com.lixiaolong.utils.FileUtil#getTempDirectory()}.
	 */
	@Test
	public void testGetTempDirectory() {
		System.out.println(FileUtil.getTempDirectory());
	}
	/**
	 * Test method for {@link com.lixiaolong.utils.FileUtil#getUserDirectory()}.
	 */
	@Test
	public void testGetUserDirectory() {
		System.out.println(FileUtil.getUserDirectory());
	}

}
