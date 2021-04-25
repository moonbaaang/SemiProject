package login;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAO {
	
	@Autowired
	SqlSession session;

	public LoginVO login(String id, String pw) {
		LoginVO vo = new LoginVO();
		vo.setId(id);
		vo.setPw(pw);
		return session.selectOne("log.logincheck", vo);
	}

	//회원가입
	public int insertMemberDAO(LoginVO vo) throws Exception {
		return session.insert("log.insert", vo);
	} 
	
	public LoginVO loginviewDAO(LoginVO vo) {
		return session.selectOne("log.viewlogin", vo);
	}

}
