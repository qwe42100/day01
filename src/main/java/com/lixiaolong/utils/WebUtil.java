/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: WebUtil.java 
 * @Prject: lixiaolong-common
 * @Package: com.lixiaolong.utils 
 * @Description: TODO
 * @author: ASUS   
 * @date: 2019年8月11日 下午7:06:58 
 * @version: V1.0   
 */
package com.lixiaolong.utils;
import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.net.URL;
/** 
 * @ClassName: WebUtil 
 * @Description: TODO
 * @author: ASUS
 * @date: 2019年8月11日 下午7:06:58  
 */
public class WebUtil {
	//方法1：获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值 (5分)
		public static String getString(HttpServletRequest request, String name, String defaultValue){
		    //实现代码
			String str = request.getParameter(name);
			if(null==str) {
				return defaultValue;
			}
			return str;
		}
		//获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值 (5分)
		public static int getInt(HttpServletRequest request, String name,int defaultValue){
		    //实现代码
			
			String str = request.getParameter(name);
			if(str==null)
				return defaultValue;
			return Integer.parseInt(str);
			
		}
		
		//方法4：获取当前请求地址，注意参数不能丢 (5分)
		public static String getUrl(HttpServletRequest request){
			  String param = request.getQueryString();
			  
		    //实现代码
			String uri = request.getRequestURI()+"?"+param;
			return uri;
		}
		/**
		 * 校验传入的参数是否为url
		 * @param param
		 * @return
		 */
		public static boolean isHttpUrl(String param) {
			 URL url;  
			 try {  
		         url = new URL(param);  
		         InputStream in = url.openStream();  
		         return true; 
		    } catch (Exception e1) {  
		         System.out.println("连接打不开!");  
		         url = null;  
		    }  
			 return false;
			
		}
}
