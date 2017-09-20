package com.winterfell.pilot.service;

import com.winterfell.pilot.domain.MemberVO;
import com.winterfell.pilot.repository.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDAO memberDAO;

    @Override
    public MemberVO getMemberInfo(String id) {
        return memberDAO.getMemberInfo(id);
    }

    @Override
    public List<HashMap<String, String>> getMemberList(MemberVO memberVO) {
        return memberDAO.getMemberList(memberVO);
    }

    @Override
    public int addMember(MemberVO memberVO) {
        return memberDAO.addMember(memberVO);
    }

    @Override
    public int modMember(MemberVO memberVO) {
        return memberDAO.modMember(memberVO);
    }

    @Override
    public int delMember(String id) {
        return memberDAO.delMember(id);
    }


}
