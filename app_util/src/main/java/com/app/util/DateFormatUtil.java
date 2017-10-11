package com.app.util;

import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;

/**
 * 时间转换
 * @author Administrator
 *
 */
public class DateFormatUtil {

	/**
	 * 将日期转化为日期字符串。失败返回null。
	 * @param date 日期
	 * @param parttern 日期格式
	 * @return 日期字符串
	 */
	public static String format(Date date, DateStyle dateStyle) {
		String dateString = null;
		if (date != null) {
			dateString = format(date, dateStyle.getValue());
		}
		return dateString;
	}

	/**
	 * 将日期转化为日期字符串。失败返回null。
	 * @param date 日期
	 * @param parttern 日期格式
	 * @return 日期字符串
	 */
	public static String format(Date date, String parttern) {
		String dateString = null;
		if (date != null) {
			dateString = DateFormatUtils.format(date, parttern);
		}
		return dateString;
	}
	
	public static String toYYYYMMDD(Date date){
		return format(date, DateStyle.YYYY_MM_DD);
	}
	
	public static String toYYYYMMDDHHMMSS(Date date){
		return format(date, DateStyle.YYYY_MM_DD_HH_MM_SS);
	}
}