package com.spring.aop;

/**
 * @author cheng
 * 定义切面（切面中有切点和通知）
 */
public class PermissionVerification {

	/**
	 * 权限校验
	 */
	public void canLogin() {
		
		//做一些登陆校验
		System.err.println("我正在校验...");
	}
	
	/**
	 * 校验之后做一些处理（无论是否成功都做处理）
	 */
	public void saveMessage() {
		
		//做一些后置处理
		System.err.println("我正在处理...");
	}
}
