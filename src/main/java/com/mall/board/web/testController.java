package com.mall.board.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mall.board.service.boardService;


@Controller
public class testController {
	
	private static final Logger logger = LoggerFactory.getLogger(testController.class);
	
	@Resource(name = "boardService")
	private boardService boardService;
	
	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	public String test(Model model) throws Exception {
		List<Map<String,Object>> list=boardService.selectBoardList();
		return "test";
	}
	
	@RequestMapping(value = "/about.do", method = RequestMethod.GET)
	public String about(Model model) {
		
		return "about";
	}
	
	@RequestMapping(value = "/board.do", method = RequestMethod.GET)
	public String boardList(@RequestParam(defaultValue="1") int currentPageNo, @RequestParam(defaultValue="20") int recordCountPerPage,
			@RequestParam Map<String, Object> paramMap, HttpSession session, HttpServletRequest request, Model model) throws Exception {
		List<Map<String,Object>> list=boardService.selectBoardList();
		System.err.println("list");
		System.err.println(list);
		model.addAttribute("list",list);
	return "board/board";
	}
	
	@RequestMapping(value = "/boardDetail.do", method = RequestMethod.GET)
	public String boardDetail(
			@RequestParam Map<String, Object> paramMap, HttpSession session, HttpServletRequest request, Model model) throws Exception {
		List<Map<String,Object>> list=boardService.selectBoardList();
		System.err.println("detaiL@@@@@@@");
		model.addAttribute("list",list);
	return "board/boardDetail";
	}
}
