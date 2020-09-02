package com.sbs.wjxor.be.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sbs.wjxor.be.dto.Member;

@Mapper
public interface MemberDao {
	List<Member> getMembers(Map<String, Object> param);

	Member getMember(@Param("id") int id);
}
