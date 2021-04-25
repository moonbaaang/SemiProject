package login;

import java.util.List;

import javax.servlet.http.HttpSession;

public interface LoginService {
	LoginVO login(String id, String pw);
/*	boolean LoginCheck(LoginVO vo, HttpSession session);*/
	LoginVO viewLogin(LoginVO vo);
	int insertMember(LoginVO vo) throws Exception;
}
