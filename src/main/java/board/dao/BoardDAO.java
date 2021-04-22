package board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import board.vo.BoardVO;

@Repository //("dao")
public class BoardDAO {
	
	@Autowired
	SqlSession session;
	
	public void setSession(SqlSession session) {
		this.session = session;
	}
	
	public List<BoardVO> getBoardList(){
		List<BoardVO> list = session.selectList("bo.boardlist");
		return list;
	}
}
