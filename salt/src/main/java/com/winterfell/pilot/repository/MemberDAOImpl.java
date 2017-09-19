package com.winterfell.pilot.repository;

import com.winterfell.pilot.domain.MemberVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

@Repository
public class MemberDAOImpl implements MemberDAO {

    @Inject
    private SqlSession sqlSession;

    @Override
    public MemberVO getMemberInfo(String id) {
        return sqlSession.selectOne("salt.mapper.memberMapper.getMemberInfo", id);
    }
}
