package com.sbs.wjxor.be.dto;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.Data;

@Data
public class ResultData {
	private String resultCode;
	private String msg;
	private Map<String, Object> body;

	public ResultData(String resultCode, String msg, String bodyParam1Key, Object bodyParam1Value) {
		this.resultCode = resultCode;
		this.msg = msg;
		this.body = new LinkedHashMap<>();
		this.body.put(bodyParam1Key, bodyParam1Value);
	}
}