package com.gm.start.board;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

	@RequestMapping(value = "/board/list.gm", method = RequestMethod.GET)
	public String list(Model model) throws Exception {
		System.out.println("List Get 실행");
		
		BoardDAO boardDAO = new BoardDAO();
		ArrayList<BoardDTO> ar = boardDAO.getList();
		
		model.addAttribute("list", ar);
		
		return "board/list";
	}
	
	@RequestMapping(value = "/board/detail.gm", method = RequestMethod.GET)
	public ModelAndView detail(BoardDTO boardDTO) throws Exception {
		System.out.println("Detail Get 실행");
		System.out.println(boardDTO.getBoardNo());
		
		ModelAndView mv = new ModelAndView();
		BoardDAO boardDAO = new BoardDAO();
		boardDTO = boardDAO.getDetail(boardDTO);
		
		mv.setViewName("board/detail");
		mv.addObject("dto", boardDTO);
		
		return mv;
	}
	
	@RequestMapping(value = "/board/update.gm", method = RequestMethod.GET)
	public void update(BoardDTO boardDTO, Model model) throws Exception {
		System.out.println("Update Get 실행");
		System.out.println(boardDTO.getBoardNo());
		
		BoardDAO boardDAO = new BoardDAO();
		boardDTO = boardDAO.getDetail(boardDTO);
		
		model.addAttribute("dto", boardDTO);
		
		
		//return "board/update";
	}
	
	@RequestMapping(value = "/board/update.gm", method = RequestMethod.POST)
	public String update(BoardDTO boardDTO) throws Exception {
		System.out.println("Update Post 실행");
		
		return "board/update";
	}
	
	
}
