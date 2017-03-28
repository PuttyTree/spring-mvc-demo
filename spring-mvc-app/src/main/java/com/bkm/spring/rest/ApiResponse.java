package com.bkm.spring.rest;

import com.google.gson.Gson;

public class ApiResponse<T> {

	private ErrorCode status = ErrorCode.SUCCESS;

	public  String name;

	private T data;

	private String[] msg;

	public ErrorCode getStatus() {
		return status;
	}

	public ApiResponse<T> setStatus(ErrorCode status) {
		this.status = status;
		return this;
	}

	public String[] getMsg() {
		return msg;
	}

	public ApiResponse<T> setMsg(String[] msg) {
		this.msg = msg;
		return this;
	}

	public T getData() {
		return data;
	}

	public int getCode() {
		return status.getCode();
	}

	public ApiResponse<T> setCode(ErrorCode code) {
		this.status = code;
		return this;
	}

	public ApiResponse<T> setData(T data) {
		this.data = data;
		return this;
	}

	@Override
	public String toString() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}

	public static <T> ApiResponse<T> success(T t) {
		ApiResponse<T> response = new ApiResponse<T>();
		response.setData(t);
		return response;
	}

	public static ApiResponse fail(ErrorCode code, String... msg) {
		ApiResponse response = new ApiResponse();
		response.setCode(code);
		response.setMsg(msg);
		return response;
	}

}
