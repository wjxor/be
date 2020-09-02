package com.sbs.wjxor.be.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.wjxor.be.dao.MemberDao;
import com.sbs.wjxor.be.dto.Member;

@Service
public class MemberService {

	@Autowired
	private MemberDao memberDao;

	public List<Member> getMembers(Map<String, Object> param) {
		return memberDao.getMembers(param);
	}

	public Member getMember(int id) {
		return memberDao.getMember(id);
	}

}
