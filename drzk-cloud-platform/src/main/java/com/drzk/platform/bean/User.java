package com.drzk.platform.bean;

import java.io.Serializable;

/**
 * 用户信息
 * @author 李君
 * 2018年3月7日
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8791022984728954167L;

	private String Id;
	
	private String name;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
