package com.daeatdak.goods.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.daeatdak.goods.dto.GoodsDTO;
import com.mybatis.config.MyBatisConfig;

public class GoodsDAO {
	   public SqlSession sqlSession;
	   
	   public GoodsDAO() {
	      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	   }
	   
	   public List<GoodsDTO> selectCategory(int categoryNum){
	      return sqlSession.selectList("goods.selectCategory", categoryNum);
	   }
}
