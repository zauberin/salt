package com.winterfell.pilot.repository;

import org.apache.ibatis.session.SqlSession;

import javax.inject.Inject;
import java.util.List;

public abstract class GenericDAOImpl<E, K> implements GenericDAO<E, K> {

    @Inject
    private SqlSession sqlSession;

    private static final String namespace = "salt.mapper.SaltMapper";

    @Override
    public K getTime() {
        return sqlSession.selectOne(namespace + ".getNow");
    }

    @Override
    public void register(E vo) {
        sqlSession.insert(namespace + ".register", vo);
    }

    @Override
    public E get(K empNo) {
        return sqlSession.selectOne(namespace + ".getEmp", empNo);
    }

    @Override
    public List<E> getList() {
        return sqlSession.selectList(namespace + ".getEmpList");
    }

}
