package com.daeatdak.common.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.daeatdak.common.vo.CommonVO;
import com.mybatis.config.MyBatisConfig;

public class CommonDAO {

	public SqlSession sqlSession;
	
	public CommonDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	
	public List<CommonVO> selectAll() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("common.selectAll");
	}
	
	public List<CommonVO> selectAll1() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("common.selectAll1");
	}
	
	public List<CommonVO> selectAll2() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("common.selectAll2");
	}
	public List<CommonVO> selectAll3() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("common.selectAll3");
	}
	public List<CommonVO> selectAll4() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("common.selectAll4");
	}

}
