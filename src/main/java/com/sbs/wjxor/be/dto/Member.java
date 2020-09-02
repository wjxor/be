package com.sbs.wjxor.be.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class Member {
	private int id;
	private String regDate;
	private String updateDate;
	private String loginId;
	@JsonIgnore
	private String loginPw;
	private String name;
	private String nickname;
}
