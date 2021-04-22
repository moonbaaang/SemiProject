package login;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAO {
	
	@Autowired
	SqlSession session;

	
	public boolean logincheckDAO(LoginVO vo) {
		String check = session.selectOne("log.logincheck", vo);
		if(check == null) {
			return false;
		} else {
			return true;
		}
	}
	
	
	//회원가입
	public void insertMemberDAO(LoginVO vo) {
		session.insert("log.insertmember", vo);
	} 
	
	public LoginVO loginviewDAO(LoginVO vo) {
		return session.selectOne("log.viewlogin", vo);
	}

}
