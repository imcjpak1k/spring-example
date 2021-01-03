/**
 * 
 */
package com.cjpark.controller.example;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjpark.entity.example.BoardVo;
import com.cjpark.service.example.BoardService;

/**
 * @author 박창준
 *
 */
@RestController
@RequestMapping("/example/board/")
public class BoardController {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/list")
	public List<BoardVo> list(@RequestParam(defaultValue = "0") Integer page) {
		logger.info("BoardController.list call");
		// 서비스호출
		List<BoardVo> list = boardService.getList(page);
		
		return list;
	}
}
