package login;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDAO dao;
	
	public LoginVO login(LoginVO vo) {
		return dao.login(vo);
	}
	
	@Override
	public boolean LoginCheck(LoginVO vo, HttpSession session) {
		boolean result = dao.logincheckDAO(vo);
		if(result) {
			LoginVO vo2 = viewLogin(vo);
			session.setAttribute("id", vo2.getId());
			session.setAttribute("pw", vo2.getPw());
		}
		return result;
	}

	@Override
	public LoginVO viewLogin(LoginVO vo) {
		return dao.loginviewDAO(vo);
	}

	@Override
	public int insertMember(LoginVO vo) throws Exception {
		return dao.insertMemberDAO(vo);
	}
	
	
	
}
