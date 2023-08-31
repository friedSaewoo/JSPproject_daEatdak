package com.daeatdak.user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.daeatdak.user.dto.UserDTO;
import com.mybatis.config.MyBatisConfig;

public class UserDAO {
			private SqlSession sqlSession;
			
			
	public UserDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
		
	}
	
	
	public void join(UserDTO userDTO) {
		sqlSession.insert("user.join", userDTO);
	}
	
	public List<UserDTO> userList() {
		List<UserDTO> list = null;
		list = sqlSession.selectList("user.userInfoSearch");
		return list;
	}
}
