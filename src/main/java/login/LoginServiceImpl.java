package login;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDAO dao;
	
	@Override
	public boolean LoginCheck(LoginVO vo) {
		boolean result = dao.logincheckDAO(vo);
		return result;
	}

	@Override
	public LoginVO viewLogin(LoginVO vo) {
		return dao.loginviewDAO(vo);
	}

	@Override
	public void insertMember(LoginVO vo) {
		dao.insertMemberDAO(vo);
	}
	
	
	
}
