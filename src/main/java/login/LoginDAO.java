package login;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAO {
	
	@Autowired
	SqlSession session;

	public LoginVO login(LoginVO vo) {
		return session.selectOne("log.logincheck", vo);
	}
		
	public boolean logincheckDAO(LoginVO vo) {
		String check = (String)session.selectOne("log.logincheck", vo);
		if(check == null) {
			return false;
		} else {
			return true;
		}
	}
	
	//회원가입
	public int insertMemberDAO(LoginVO vo) throws Exception {
		return session.insert("log.insert", vo);
	} 
	
	public LoginVO loginviewDAO(LoginVO vo) {
		return session.selectOne("log.viewlogin", vo);
	}

}
