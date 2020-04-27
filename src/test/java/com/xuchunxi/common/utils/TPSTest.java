package com.xuchunxi.common.utils;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class TPSTest {

	@Test
	public void test() {
	
		for (int i = 1; i <=100; i++) {
			TPS t = new TPS();
			//id从1开始递增
		
			t.setId(i);
			//专家姓名属性值调用ZHStringUtil的getZHName()(5分)
			t.setName(ZHStringUtil.getZHName());
			//年龄属性值调用RandomUtil.random()创建，必须在1-100岁之间(5
			t.setAge(RandNumUtil.random(1, 100));
			//薪酬是3万到8万，小数点后2位的随机数(5分)
			t.setXz(RandNumUtil.getValue(30000, 80000, 2));
			//聘用日期属性值模拟2012年1月1日至今任意随机时间（5分）
			Calendar c = Calendar.getInstance();
			c.set(2012, 0,1);//2012-1-1
			t.setTime(DateUtil.random(c.getTime(), new Date()));
			System.out.println(t);
		}
	}

}
