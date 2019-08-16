/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: AssertUtil.java 
 * @Prject: lixiaolong-common
 * @Package: com.lixiaolong.utils 
 * @Description: TODO
 * @author: ASUS   
 * @date: 2019年8月11日 下午6:58:08 
 * @version: V1.0   
 */
package com.lixiaolong.utils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

/** 
 * @ClassName: AssertUtil 
 * @Description: TODO
 * @author: ASUS
 * @date: 2019年8月11日 下午6:58:08  
 */
public class AssertUtil {
	/**
	 * 
	 * @Title: isTrue
	 * @Description: 断言为真（就是表达结果或参数必须为真， 否则抛出自己的自定义 异常）；
	 * @param exp
	 * @param message
	 * @return: void
	 * @throws Exception 
	 */
	public static void isTrue(boolean exp, String message) throws Exception {

		if (!exp)
			throw new CMSRuntimeException(message);

	}

	/**
	 * 断言为假；
	 * 
	 * @Title: isFalse
	 * @Description: TODO
	 * @param exp
	 * @param message
	 * @return: void
	 * @throws Exception 
	 */
	public static void isFalse(boolean exp, String message) throws Exception {

		if (exp)
			throw new CMSRuntimeException(message);

	}

	/**
	 * 
	 * @Title: isNotNull
	 * @Description: // 断言对象不为空；
	 * @param obj
	 * @param message
	 * @return: void
	 * @throws Exception 
	 */

	public static void isNotNull(Object obj, String message) throws Exception {

		if (obj == null)
			throw new CMSRuntimeException(message);

	}

	/**
	 * 
	 * @Title: isNotNull
	 * @Description: // 断言对象必须空；；
	 * @param obj
	 * @param message
	 * @return: void
	 * @throws Exception 
	 */

	public static void isNull(Object obj, String message) throws Exception {

		if (obj != null)
			throw new CMSRuntimeException(message);

	}

	/**
	 * 断言 List 或 Set 集合不为空，没有元素也算空； (6)
	 * 
	 * (8
	 * @throws Exception 
	 */

	public static void isNotEmpty(Collection c, String message) throws Exception {

		if (c == null || c.size() == 0) {
			throw new CMSRuntimeException(message);
		}
	}

	/**
	 * 断言 Map 集合不为空，没有元素也算空；
	 * 
	 * @Title: isNotEmpty
	 * @Description: TODO
	 * @param c
	 * @param message
	 * @return: void
	 * @throws Exception 
	 */
	public static void isNotEmpty(Map<?, ?> map, String message) throws Exception {

		if (map == null || map.isEmpty()) {
			throw new CMSRuntimeException(message);
		}
	}

	/**
	 * (7) 断言字符串必须有值，去掉空格后，长度必须大于 0；
	 * 
	 * @Title: isNotEmpty
	 * @Description: TODO
	 * @param map
	 * @param message
	 * @return: void
	 * @throws Exception 
	 */
	public static void hasText(String src, String message) throws Exception {
		if (null == src || src.trim().length() == 0) {
			throw new CMSRuntimeException(message);
		}
	}

	/**
	 * ) 断言值必须是正数(值大于 0)；
	 * 
	 * @Title: hasText
	 * @Description: TODO
	 * @param src
	 * @param message
	 * @return: void
	 * @throws Exception 
	 */
	public static void isPostive(boolean exp, String message) throws Exception {
		if (!exp)
			throw new CMSRuntimeException(message);
	}

	// 方法8：断言值必须大于0，如果小于或等于0，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void greaterThanZero(BigDecimal value, String message) throws Exception {
		if (value.doubleValue() <= 0)
			throw new CMSRuntimeException(message);
}
}