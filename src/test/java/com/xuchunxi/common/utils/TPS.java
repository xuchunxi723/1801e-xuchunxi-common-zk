package com.xuchunxi.common.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class TPS {
	private int id;//id
	private String name;//名字
	private int age;//年龄
	private BigDecimal xz;//薪资
	private Date time;//聘用日期
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getXz() {
		return xz;
	}
	public void setXz(BigDecimal xz) {
		this.xz = xz;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	public TPS(int id, String name, int age, BigDecimal xz, Date time) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.xz = xz;
		this.time = time;
	}
	public TPS() {
		super();
	}
	@Override
	public String toString() {
		return "id=" + id + ", 姓名:" + name + ",薪酬:" + xz+",年龄:"+age + ", 聘用日期:" + time;
	}
	
}
