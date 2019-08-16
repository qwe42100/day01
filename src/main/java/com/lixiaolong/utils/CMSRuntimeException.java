/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: CMSRuntimeException.java 
 * @Prject: lixiaolong-common
 * @Package: com.lixiaolong.utils 
 * @Description: TODO
 * @author: ASUS   
 * @date: 2019年8月11日 下午6:59:14 
 * @version: V1.0   
 */
package com.lixiaolong.utils;

/** 
 * @ClassName: CMSRuntimeException 
 * @Description: 自定义异常
 * @author: ASUS
 * @date: 2019年8月11日 下午6:59:14  
 */
public class CMSRuntimeException extends Exception {
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	public CMSRuntimeException() {
		super();
	}

	public CMSRuntimeException(String message) {
		super(message);
	}

}
