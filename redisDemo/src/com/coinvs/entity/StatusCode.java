package com.coinvs.entity;
/**
 * 
 * @author 
 *
 */
public final class StatusCode {
	/**
	 * 字符串 error_code
	 */
	public static final String KEY_ERROR_CODE =  "error_code";
	
	/**
	 * 字符串 error_message
	 */
	public static final String KEY_ERROR_MESSAGE =  "error_message";
	
	/**
	 * 请求成功 0
	 */
	public  final static String SUCCESS_CODE = "0";
	
	/**
	 * 请求失败 1
	 */
	public  final static String ERROR_CODE = "1";
	
	/**
	 * 用户没有绑定易宝 2
	 */
	public final static String NO_BIND_YIBAO = "2";
	
	/**
	 * 用户余额不足 3
	 */
	public final static String MONEY_NOENOUGH = "3";
	
	/**
	 * 没有实名认证 4
	 */
	public final static String NO_CERTIFICATE = "4";
	
	/**
	 * 没有绑定银行卡 5
	 */
	public final static String NO_BIND_BANKCARD = "5";
	/**
	 *Failed to get the data 
	 */
	public final static String ERROR_MESSAGE = "Failed to get the data";
	
	/**
	 * data is_active is alive 1
	 */
	public final static Integer IS_ACTIVE_ALIVE = 1;
	
	/**
	 * data is_active is die 0
	 */
	public final static Integer IS_ACTIVE_DIE= 0;
	
	
}
