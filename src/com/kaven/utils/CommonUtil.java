package com.kaven.utils;

public class CommonUtil {
	/**
	 * 判断一个String对象是否是空
	 * @author kaven 2017-02-27 10:08:10
	 * @param value
	 * @return
	 */
	public static boolean isEmpty(String value) {
		if(value == null || "".equals(value)){
			return true;
		}else {
			return false;
		}
	}
}
