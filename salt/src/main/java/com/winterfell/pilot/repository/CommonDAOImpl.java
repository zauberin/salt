package com.winterfell.pilot.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommonDAOImpl implements CommonDAO {

    private SqlSession sqlSession;

    @Autowired
    public CommonDAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public int addAccessLog(String id) {
        return sqlSession.insert("salt.mapper.commonMapper.addAccessLog", id);
    }
}
