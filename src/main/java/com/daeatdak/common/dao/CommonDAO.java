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

}
