package com.cjpark.repository.example;

import java.util.List;
import java.util.logging.Logger;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjpark.entity.example.BoardVo;

@Repository
public class BoardDao {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	private final String namespace = "com.cjpak.example.boardMapper";
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<BoardVo> list() {
		logger.info("BoardDao.list call");
		return sqlSession.selectList(namespace + ".list");
	}
}
