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
	
	//아이디 중복검사 메소드
		//selectOne의 반환타입은 object 타입이다. 비교를하기 위해서 Integer타입으로 형변환한다.
		public boolean checkId(String userId) {
			return (Integer)sqlSession.selectOne("user.checkId", userId) <=0;
		}
}
