package com.winterfell.pilot.repository;

import com.winterfell.pilot.domain.MemberVO;

public interface MemberDAO {

    MemberVO getMemberInfo(String id);

}
