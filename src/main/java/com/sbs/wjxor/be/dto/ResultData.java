package com.sbs.wjxor.be.dto;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.Data;

@Data
public class ResultData {
	private String resultCode;
	private String msg;
	private Map<String, Object> body;

	public ResultData(String resultCode, String msg, Object... extra) {
		this.resultCode = resultCode;
		this.msg = msg;
		this.body = new LinkedHashMap<>();

		for (int i = 0; i < extra.length; i += 2) {
			String bodyParamKey = (String) extra[i];
			Object bodyParamValue = extra[i + 1];
			this.body.put(bodyParamKey, bodyParamValue);
		}
	}
}