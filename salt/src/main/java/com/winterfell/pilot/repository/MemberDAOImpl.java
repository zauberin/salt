package com.winterfell.pilot.repository;

import com.winterfell.pilot.domain.MemberVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class MemberDAOImpl implements MemberDAO {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public MemberVO getMemberInfo(String id) {
        return sqlSession.selectOne("salt.mapper.memberMapper.getMemberInfo", id);
    }

    @Override
    public List<HashMap<String, String>> getMemberList(MemberVO memberVO) {
        return sqlSession.selectList("salt.mapper.memberMapper.getMemberList", memberVO);
    }

    @Override
    public int addMember(MemberVO memberVO) {
        return sqlSession.insert("salt.mapper.memberMapper.addMember", memberVO);
    }

    @Override
    public int modMember(MemberVO memberVO) {
        return sqlSession.update("salt.mapper.memberMapper.modMember", memberVO);
    }

    @Override
    public int delMember(String id) {
        return sqlSession.delete("salt.mapper.memberMapper.delMember", id);
    }

}
