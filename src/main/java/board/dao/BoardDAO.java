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
	
	public void insert(BoardVO vo) {
		session.insert("bo.insertboard", vo);
	}
	
	public BoardVO read(Integer seq) {
		return session.selectOne("bo.readboard", seq);
	}
	
	public void update(BoardVO vo) {
		session.update("bo.updateboard", vo);
	}

	public void delete(Integer seq) {
		session.delete("bo.deleteboard", seq);
	}
	

}
