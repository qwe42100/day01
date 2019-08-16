/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: RandomUtilTest.java 
 * @Prject: lixiaolong-common
 * @Package: com.lixiaolong.utils 
 * @Description: TODO
 * @author: ASUS   
 * @date: 2019年8月8日 下午2:30:30 
 * @version: V1.0   
 */
package com.lixiaolong.utils;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;
import org.junit.experimental.theories.FromDataPoints;

/** 
 * @ClassName: RandomUtilTest 
 * @Description: TODO
 * @author: ASUS
 * @date: 2019年8月8日 下午2:30:30  
 */
public class RandomUtilTest {

	/**
	 * Test method for {@link com.lixiaolong.utils.RandomUtil#random(int, int)}.
	 */
	@Test
	public void testRandom() {
		for (int j = 0; j < 5; j++) {
			int i = RandomUtil.random(1, 3);
			System.out.println(i);
			
		}
	}

	/**
	 * Test method for {@link com.lixiaolong.utils.RandomUtil#subRandom(int, int, int)}.
	 */
	@Test
	public void testSubRandom() {
		int[] is = RandomUtil.subRandom(1, 10, 5);
		for (int i : is) {
			System.out.println(i);
		}
		
	}

	/**
	 * Test method for {@link com.lixiaolong.utils.RandomUtil#randomCharacter()}.
	 */
	@Test
	public void testRandomCharacter() {
		for (int i = 0; i < 10; i++) {
			char c = RandomUtil.randomCharacter();
			System.out.println(c);
		}
	}

	/**
	 * Test method for {@link com.lixiaolong.utils.RandomUtil#randomString(int)}.
	 */
	@Test
	public void testRandomString() {
		for (int i = 0; i < 5; i++) {
			String ra = RandomUtil.randomString(5);
			System.out.println(ra);
		}
	}

}
