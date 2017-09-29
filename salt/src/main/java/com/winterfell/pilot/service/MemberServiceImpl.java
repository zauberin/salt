package com.winterfell.pilot.service;

import com.winterfell.pilot.domain.MemberVO;
import com.winterfell.pilot.repository.CommonDAO;
import com.winterfell.pilot.repository.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;


@Service
public class MemberServiceImpl implements MemberService {

    private MemberDAO memberDAO;
    private CommonDAO commonDAO;

    @Autowired
    public MemberServiceImpl(MemberDAO memberDAO, CommonDAO commonDAO) {
        this.memberDAO = memberDAO;
        this.commonDAO = commonDAO;
    }

    @Override
    public MemberVO getMemberInfo(String id) {
        return memberDAO.getMemberInfo(id);
    }

    @Override
    public List<HashMap<String, String>> getMemberList(MemberVO memberVO) {
        return memberDAO.getMemberList(memberVO);
    }

    @Override
    @Transactional
    public int addMember(MemberVO memberVO) {

        commonDAO.addAccessLog(memberVO.getId());
        memberDAO.addMember(memberVO);

        return 1;
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
