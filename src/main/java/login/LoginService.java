package login;

import javax.servlet.http.HttpSession;

public interface LoginService {
	public boolean LoginCheck(LoginVO vo);
	public LoginVO viewLogin(LoginVO vo);
	public void insertMember(LoginVO vo);
}
