/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StreamUtil.java 
 * @Prject: lixiaolong-common
 * @Package: com.lixiaolong.utils 
 * @Description: TODO
 * @author: ASUS   
 * @date: 2019年8月8日 下午1:46:37 
 * @version: V1.0   
 */
package com.lixiaolong.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/** 
 * @ClassName: StreamUtil 
 * @Description: TODO
 * @author: ASUS
 * @date: 2019年8月8日 下午1:46:37  
 */
public class StreamUtil {
	
	/*
	* 方法1：批量关闭流，参数能传无限个。(3分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	*/
	public static void closeAll(AutoCloseable ... autoCloseables ){
		if (null!=autoCloseables) {
			for (AutoCloseable i : autoCloseables) {
				try {
					i.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，
	* 要求方法内部调用上面第1个方法关闭流(3分)
	*/
	public static String readTextFile(InputStream src) throws Exception{
		byte[] b = new byte[1024];
		String str = "";
		while(src.read(b)!=-1) {
			str += new String(b,"utf-8");
		}
		closeAll();
		return str;
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(3分)，
	* 并且要求内部调用上面第2个方法(5分)。* 
	* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile) throws Exception{
		return readTextFile(new FileInputStream(txtFile));
	}
}
