package board.controller;

import static java.lang.Integer.toString;

import java.io.IOException;
import java.io.PrintWriter;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import board.service.BoardService;
import board.vo.BoardVO;
import board.vo.PageVO;
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
	

	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"}) 
//	@ResponseBody
	public ModelAndView login(String id, String pw, 
		HttpServletRequest request) throws Exception{
		LoginVO vo = logservice.login(id, pw);
		ModelAndView mv = new ModelAndView("loginform");
		HttpSession session = request.getSession();
		if(vo != null) {
			session.setAttribute("id", vo.getId());
			mv.addObject("input_id", vo.getId());
			//mv.addObject("message", "로그인되셨습니다.");
			mv.setViewName("home");
		}else {
			mv.setViewName("loginform");
			mv.addObject("message", "아이디 또는 비밀번호를 확인하세요.");
		}
		return mv; 
	}
	
	/*
	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST, produces = "applcation/json; charset=UTF-8")
	@ResponseBody
	public String loginCheck(String id, String password) throws IOException {
		LoginVO vo = logservice.login(id, password);
		String result = "";
		if (vo != null) {
			result = "{\"check\":\"1\"}";
		}
		else {
			result = "{\"check\":\"0\"}";
		}

		return result;
	}
	*/
	
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return "home";
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
	public ModelAndView getBoardlist(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		List<BoardVO> list = service.getBoardList();
		mv.addObject("dogboardlist", list);
		mv.setViewName("/board/dogboardlist");
		return mv;
	}

	
	@RequestMapping("/dogboardlist/{seq}")
	public ModelAndView getBoardDetail(@PathVariable("seq") int seq) {
		ModelAndView mv = new ModelAndView();
		BoardVO bvo = service.getOneBoard(seq);
		mv.addObject("result", bvo);
		mv.setViewName("/boarddetail");
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
	
/*	//페이징 처리 게시물 목록
	@RequestMapping(value="/dogboardlist", method=RequestMethod.GET)
	public void getListPage(@ModelAttribute BoardVO vo) throws Exception{
		List<BoardVO> list = null;
		list = service.getBoardList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
	}
	
	@RequestMapping(value="dogboardlist", method=RequestMethod.GET)
	public void getListPage(ModelAndView mv, @RequestParam("name") int num)
	throws Exception{
		int count = service.count();
		int postNum = 5;
		int pageNum = (int)Math.ceil((double)count/postNum);
		int displayPost = (num-1)*postNum;
		
		List list = service.listPage(displayPost, postNum);
		mv.addObject("list", list);
		mv.addObject("pageNum", pageNum);
	}
*/	
}
