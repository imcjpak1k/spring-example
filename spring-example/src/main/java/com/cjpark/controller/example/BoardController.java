/**
 * 
 */
package com.cjpark.controller.example;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cjpark.entity.example.BoardVo;
import com.cjpark.service.example.BoardService;

/**
 * @author 박창준
 *
 */
@Controller
@RequestMapping("/example/board")
public class BoardController {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<BoardVo> list(@RequestParam(defaultValue = "0") Integer page) {
		logger.info("BoardController.list call");
		// 서비스호출
		List<BoardVo> list = boardService.getList(page);
		
		return list;
	}

	
	
	
	
	
	@RequestMapping("/tiles/list")
	public ModelAndView tilesList(
			@RequestParam(defaultValue = "0") Integer page) {
		logger.info("BoardController.tiles.list call");
		
		// 서비스호출
		List<BoardVo> list = boardService.getList(page);
		
		ModelAndView mv = new ModelAndView("example.board.list");
		mv.addObject("resultList", list);
		
		return mv;
	}
	
	@RequestMapping("/tiles/reg")
	public String tilesReg() {
		logger.info("BoardController.tiles.reg call");
		return "example.board.reg";
	}
	
	
	@RequestMapping("/tiles/regExecute")
	public String tilesReg(
			@RequestParam(required = true) String title, 
			@RequestParam(required = true) String content) {
		
		logger.info(String.format("BoardController.tiles.regExecute call"
				+ "\n - title : %s"
				+ "\n - content : %s"
				, title, content));
		
		BoardVo vo = new BoardVo();
		vo.setTitle(title);
		vo.setContent(content);
		
		
		// 서비스호출
		boardService.save(vo);
		
		// redirect:목록조회 페이지
		return "redirect:/example/board/tiles/list";
	}
}
