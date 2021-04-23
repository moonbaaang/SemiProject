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
	
	@Autowired
	LoginService logservice;
	
	// main 페이지
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main() {
		return "main";
	}

	// 로그인페이지
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "loginform";
	}
	
/*	// 로그인처리
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView loginCheck(@ModelAttribute LoginVO vo,
			HttpServletRequest request, HttpSession session) {
		session = request.getSession();
		boolean result = logservice.LoginCheck(vo, session);
		ModelAndView mv = new ModelAndView();
		if(result == true) {
			mv.setViewName("home");
			mv.addObject("msg", "success");
		} else {
			mv.setViewName("loginform");
			mv.addObject("msg", "failure");
		}
		return mv;
	}
*/
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView loginCheck(@ModelAttribute LoginVO vo,
			HttpServletRequest request) throws Exception{
		HttpSession session = request.getSession();
		LoginVO login = logservice.login(vo);
		ModelAndView mv = new ModelAndView();
		if(login == null) {
			mv.addObject("msg", "failure");
			mv.setViewName("loginform");
		} else {
			session.setAttribute("member", login);
			mv.addObject("msg", "success");
			mv.setViewName("home");
		}
		return mv;
	}
	
	
	// 회원가입 페이지
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signupGet() throws Exception {
		return "signup";
	}
	
	//회원가입 처리
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signupPost(@ModelAttribute LoginVO vo) throws Exception {		
		logservice.insertMember(vo);
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "회원가입이 완료되었습니다.");
		return "loginform";
	}

	
// --------------------------------------------------------------------------------
/*	
	//메인홈페이지
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home() {
		return "home";
	}
*/	
	// 강아지 게시판 
	@RequestMapping("/dogboardlist")
	public ModelAndView getBoardlist(){
		List<BoardVO> list = service.getBoardList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("dogboardlist", list);
		mv.setViewName("/board/dogboardlist");
		return mv;
	}
	
	// 게시글 추가
	@RequestMapping(value="/dogboardwrite", method=RequestMethod.GET)
	public String BoardwriteGet() {
		return "/board/dogboardwrite";
	}
	
	// 게시글 작성
	@RequestMapping(value="/dogboardwrite", method=RequestMethod.POST)
	public String BoardwritePost(@ModelAttribute BoardVO vo) {
		service.insertBoard(vo);
		return "redirect:/dogboardlist";
	}

	//게시글 수정
	@RequestMapping(value="/dogboardupdate", method=RequestMethod.POST)
	public String Boardupdate(@ModelAttribute BoardVO vo) {
		service.updateBoard(vo);
		return "redirect:/dogboardlist";
	}
	
	//게시글 삭제
	

}
