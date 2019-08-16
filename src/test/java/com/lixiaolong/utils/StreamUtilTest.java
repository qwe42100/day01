/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StreamUtilTest.java 
 * @Prject: lixiaolong-common
 * @Package: com.lixiaolong.utils 
 * @Description: TODO
 * @author: ASUS   
 * @date: 2019年8月8日 下午1:55:38 
 * @version: V1.0   
 */
package com.lixiaolong.utils;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

/** 
 * @ClassName: StreamUtilTest 
 * @Description: TODO
 * @author: ASUS
 * @date: 2019年8月8日 下午1:55:38  
 */
public class StreamUtilTest {

	/**
	 * Test method for {@link com.lixiaolong.utils.StreamUtil#closeAll(java.lang.AutoCloseable[])}.
	 */
	@Test
	public void testCloseAll() {	
	}

	/**
	 * Test method for {@link com.lixiaolong.utils.StreamUtil#readTextFile(java.io.InputStream)}.
	 * @throws Exception 
	 * @throws FileNotFoundException 
	 */
	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException, Exception {
		String str = StreamUtil.readTextFile(new FileInputStream("D:/aa.txt"));
		System.out.println(str);
	}

	/**
	 * Test method for {@link com.lixiaolong.utils.StreamUtil#readTextFile(java.io.File)}.
	 * @throws Exception 
	 * @throws FileNotFoundException 
	 */
	@Test
	public void testReadTextFileFile() throws FileNotFoundException, Exception {
		String str = StreamUtil.readTextFile(new FileInputStream("D:/aa.txt"));
		System.out.println(str);
	}

}
