package com.app.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

/**
 * Map 转换实体类工具
 * @author Administrator
 */
public class MapUtil {
	
	/**
	 * 将map转换成实体类
	 * @param clazz
	 * @param map
	 * @return
	 */
	public static <T> T toBean(Class<T> clazz, Map<String, Object> map) {
		T t = null;
		try {
			t = clazz.newInstance();
			BeanUtils.populate(t, map);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return t;
	}

	/**
	 * 将list<map>转换成实体类
	 * @param clazz
	 * @param list
	 * @return
	 */
	public static <T> List<T> toListBean(Class<T> clazz, List<Map<String, Object>> list) {
		List<T> list2 = new ArrayList<>();
		try {
			T t = null;
			for (Map<String, Object> map : list) {
				t = clazz.newInstance();
				BeanUtils.populate(t, map);
				list2.add(t);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return list2;
	}
	
	/**
	 * 实体类转换成map
	 * @param bean
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> Map<String, Object> toMap(T bean) {
		Map<String, Object> map = null;
		if (bean != null) {
			try {
				map = BeanUtils.describe(bean);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return map;
	}

}