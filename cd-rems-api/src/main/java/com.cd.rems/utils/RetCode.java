package com.cd.rems.utils;
/**
 * 返回code
 * @author liufuqiang
 *
 */
public enum RetCode {
	//成功
	SUCCESS(200),
	
	//失败
	FAIL(400),
	
	//错误
	FALSE(404),
	
	//内部错误
	ERRO(500);
	
	private int code;
	
	private RetCode(Integer code){
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
}
