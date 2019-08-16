/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Person.java 
 * @Prject: lixiaolong-common
 * @Package: com.lixiaolong.utils 
 * @Description: TODO
 * @author: ASUS   
 * @date: 2019年8月9日 下午1:40:21 
 * @version: V1.0   
 */
package com.lixiaolong.utils.entity;

import java.util.Date;

/** 
 * @ClassName: Person 
 * @Description: TODO
 * @author: ASUS
 * @date: 2019年8月9日 下午1:40:21  
 */
public class Person {
	private String name;
	private Integer age;
	private String about;
	private Date created;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + ", created=" + created + "]";
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, Integer age, String about, Date created) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.created = created;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
	
}
