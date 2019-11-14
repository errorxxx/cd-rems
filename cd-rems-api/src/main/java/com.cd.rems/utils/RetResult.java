package com.cd.rems.utils;


/**
 * 返回结果封装对象
 * @author liufuqiang
 *
 */
public class RetResult{
	//状态码
	private Integer code;
	//信息
	private String msg;
	//数据
	private Object data;
	
	public RetResult(){
		this.code = Integer.valueOf(0);
		this.msg = "";
		this.data = null;
	}
	/**
	 * 返回状态码、信息、数据
	 * @param code
	 * @param msg
	 * @param data
	 */
	public RetResult(Integer code,String msg,Object data){
		this.code = code;
		this.msg = "";
		this.data = data;
	}
	/**
	 * 只返回状态码、信息，用于失败时
	 * @param code
	 * @param msg
	 */
	public RetResult(Integer code,String msg){
		this.code = code;
		this.msg = msg;
		this.data = null;
	}
	/**
	 * 只返回状态码、数据
	 * @param code
	 * @param data
	 */
	public RetResult(Integer code,Object data){
		this.code = code;
		this.msg = "";
		this.data = data;
	}
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "RetResult [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}
	
}
