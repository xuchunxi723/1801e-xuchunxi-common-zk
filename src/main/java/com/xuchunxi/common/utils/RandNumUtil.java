package com.xuchunxi.common.utils;

import java.math.BigDecimal;

/**
 * 
 * @ClassName: RandNumUtil 
 * @Description: 随机数工具类
 * @author: xuchunxi
 * @date: 2020年4月27日 上午9:01:22
 */
public class RandNumUtil {
	//方法1：获得指定范围的随机小数,精度scale表示小数点后位数，举例min为25400.56,max为67078.94,返回小数点后2位的min和max之间的数，比如48545.87（8分）
	public static BigDecimal getValue(final double min, final double max,final int scale){
		BigDecimal bd = new BigDecimal(Math.random()*(max-min)+min);
		return bd.setScale(scale,BigDecimal.ROUND_HALF_UP);
	}
	//方法2：返回min-max之间的随机整数（包含min和不包含max值），例如返回1-3之间的随机数，则返回1或2，不能是其他数值（8分）
	public static int random(int min, int max){
		if(max<min)
			throw new RuntimeException("请输入正确的值");
		
		return (int)Math.round(Math.random()*(max-min)+min);
	} 

}
