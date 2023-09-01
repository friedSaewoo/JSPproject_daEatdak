package com.daeatdak.admin.dao;

import org.apache.ibatis.session.SqlSession;

import com.daeatdak.admin.dto.AdminDTO;
import com.mybatis.config.MyBatisConfig;

public class AdminDAO  {

	private SqlSession sqlSession;
	
	public AdminDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void goodsRegist(AdminDTO adminDTO) {
		sqlSession.insert("admin.GoodsRegist", adminDTO);
	}

}
