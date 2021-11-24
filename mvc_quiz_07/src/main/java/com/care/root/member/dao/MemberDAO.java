package com.care.root.member.dao;

import org.springframework.stereotype.Repository;

import com.care.root.member.dto.MemberDTO;

@Repository
public interface MemberDAO {
	public MemberDTO chkLogin(MemberDTO dto);
}
