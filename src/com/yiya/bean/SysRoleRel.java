package com.yiya.bean;

import com.yiya.bean.BaseBean.DELETED;


public class SysRoleRel extends BaseBean {
	
	
	/**
 	 * 枚举
 	 * @author lu
 	 *
 	 */
 	public static enum RelType {
		MENU(0, "菜单"), USER(1,"用户"),BTN(2,"按钮");
		public int key;
		public String value;
		private RelType(int key, String value) {
			this.key = key;
			this.value = value;
		}
		public static RelType get(int key) {
			RelType[] values = RelType.values();
			for (RelType object : values) {
				if (object.key == key) {
					return object;
				}
			}
			return null;
		}
	}
	
	
}