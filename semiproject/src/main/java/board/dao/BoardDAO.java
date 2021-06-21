package board.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import board.vo.BoardVO;
import board.vo.PageVO;

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
	
	public BoardVO getOneBoard(int seq) {
		session.update("bo.updateBoard",seq);
		return session.selectOne("bo.getOneBoard",seq);
	}
	
	public List<BoardVO> getBoardList(PageVO vo){
		List<BoardVO> list = session.selectList("bo.boardlist", vo);
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
	
/*	public int count() throws Exception{
		return session.selectOne("bo.count");
	}
	
	public List listPage(int displayPost, int postNum) throws Exception{
		HashMap data = new HashMap();
		data.put("displayPost", displayPost);
		data.put("postNum", postNum);
		return session.selectList("bo.listpage", data);
	}
*/
}
