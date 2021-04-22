package board.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import board.service.BoardService;
import board.vo.BoardVO;
import login.LoginService;
import login.LoginVO;

@Controller
public class BoardController {
	// homecontroller
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	BoardService service;
	
//	@Autowired
//	LoginVO logvo;
	
	@Autowired
	LoginService logservice;
	
	// main 페이지
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "main";
	}

	// 로그인페이지
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "loginform";
	}
	
	// 로그인처리
/*	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute LoginVO vo, RedirectAttributes rda) {
		boolean result = logservice.LoginCheck(vo);
		ModelAndView mv = new ModelAndView();
		if(result == true) {
			mv.setViewName("home");
			//mv.addObject("msg", "로그인에 성공하셨습니다.");
		} else {
			rda.setViewName("loginform");
			mv.addObject("msg", "로그인에 실패하셨습니다.");
		}
		return mv;
	}
*/	
	
	// 회원가입 페이지
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signupGet() {
		return "signup";
	}
	
	//회원가입
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signupPost(LoginVO loginvo) {
		logservice.insertMember(loginvo);
		return "redirect:/login";
	}
	
	// 게시판 
	@RequestMapping("/boardlist")
	public ModelAndView getBoardlist(){
		List<BoardVO> list = service.getBoardList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("boardlist", list);
		mv.setViewName("/board/boardlist");
		return mv;
	}
}
