/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.obeast.generator.utils;

/**
 * @author wxl
 * @date 2022/8/6 19:46
 * @description: 自定义异常
 **/
public class BeastException extends RuntimeException {
	private static final long serialVersionUID = 1L;

    private String msg;
    private int code = 500;

    public BeastException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public BeastException(String msg, Throwable e) {
		super(msg, e);
		this.msg = msg;
	}

	public BeastException(String msg, int code) {
		super(msg);
		this.msg = msg;
		this.code = code;
	}

	public BeastException(String msg, int code, Throwable e) {
		super(msg, e);
		this.msg = msg;
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}


}
