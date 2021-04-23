package login;

import javax.servlet.http.HttpSession;

public interface LoginService {
	public LoginVO login(LoginVO vo);
	public boolean LoginCheck(LoginVO vo, HttpSession session);
	public LoginVO viewLogin(LoginVO vo);
	public int insertMember(LoginVO vo) throws Exception;
}
