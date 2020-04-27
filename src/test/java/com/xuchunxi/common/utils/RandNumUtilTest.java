package com.xuchunxi.common.utils;

import org.junit.Test;

public class RandNumUtilTest {

	@Test
	public void testGetValue() {
		System.out.println(RandNumUtil.getValue(20.20, 50.20, 2));
	}

	@Test
	public void testRandom() {
		System.out.println(RandNumUtil.random(1, 10));
	}

}
