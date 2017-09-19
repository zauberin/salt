package com.winterfell.pilot.service;

import com.winterfell.pilot.domain.MemberVO;
import com.winterfell.pilot.repository.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDAO memberDAO;

    public MemberVO getMemberInfo(String id) {
        return memberDAO.getMemberInfo(id);
    }

}
