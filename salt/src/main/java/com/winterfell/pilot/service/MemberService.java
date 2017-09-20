package com.winterfell.pilot.service;

import com.winterfell.pilot.domain.MemberVO;

import java.util.HashMap;
import java.util.List;

public interface MemberService {

    MemberVO getMemberInfo(String id);

    List<HashMap<String, String>> getMemberList(MemberVO memberVO);

    int addMember(MemberVO memberVO);

    int modMember(MemberVO memberVO);

    int delMember(String id);

}
