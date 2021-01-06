package com.cjpark.service.example;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjpark.entity.example.BoardVo;
import com.cjpark.repository.example.BoardDao;

@Service
public class BoardService {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@Autowired
	private BoardDao boardDao;
	
	public List<BoardVo> getList(Integer page) {
		logger.info("BoardService.list call");
		return boardDao.list();
	}
	
	public boolean save(BoardVo vo) {
		logger.info("BoardService.save call");
		return boardDao.save(vo);
	}

}
