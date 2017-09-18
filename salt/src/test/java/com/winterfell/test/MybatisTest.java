package com.winterfell.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/spring/applicationContext.xml"})
public class MybatisTest {

    @Inject
    private SqlSessionFactory sqlFactory;

    @Test
    public void testFactory() {
        System.out.println("sqlFactory ==>" + sqlFactory + "<==");
    }
    @Test
    public void testSession() {
        try (SqlSession session = sqlFactory.openSession()) {
            System.out.println("sqlSession ==>" + session + "<==");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
