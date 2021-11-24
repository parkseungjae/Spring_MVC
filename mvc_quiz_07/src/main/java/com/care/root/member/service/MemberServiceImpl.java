package com.care.root.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.root.member.dao.MemberDAO;
import com.care.root.member.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO mapper;

	@Override
	public int chkLogin(MemberDTO dto) {
		MemberDTO dtoResult = mapper.chkLogin(dto);
		String userId = dto.getId();
		String userPwd = dto.getPwd();
		int result = 0;
		if (userId.equals(dtoResult.getId())) {
			if (userPwd.equals(dtoResult.getPwd())) {
				System.out.println("로그인 성공");
				result = 1;
			} else {
				System.out.println("비밀번호 불일치");
				result = 0;
			}
		} else {
			System.out.println("아이디 존재하지 않음");
			result = 0;
		}
		return result;
	}

}
